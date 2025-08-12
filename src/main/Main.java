package main;

import main.java.CompilersProject.Calc2BaseVisitor;
import main.java.CompilersProject.Calc2Lexer;
import main.java.CompilersProject.Calc2Parser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static HashMap<String, Double> memory = new HashMap<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String inputFile = "input.txt";
        InputStream is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);

        Calc2Lexer lexer = new Calc2Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Calc2Parser parser = new Calc2Parser(tokens);

        ParseTree tree = parser.program();
        Visitor visitor = new Visitor();
        visitor.visit(tree);
    }

    static class Visitor extends Calc2BaseVisitor<Double> {

        @Override
        public Double visitProgram(Calc2Parser.ProgramContext ctx) {
            for (var cmd : ctx.cmd()) {
                visit(cmd);
            }
            return 0.0;
        }

        @Override
        public Double visitInputCmd(Calc2Parser.InputCmdContext ctx) {
            String var = ctx.input().ID().getText();
            System.out.print("Input a value for variable '" + var + "': ");
            double val = scanner.nextDouble();
            memory.put(var, val);
            return 0.0;
        }

        @Override
        public Double visitPrintCmd(Calc2Parser.PrintCmdContext ctx) {
            String exprTexto = ctx.print().expr().getText();
            Double val = visit(ctx.print().expr());

            if (val == null) {
                System.out.println("Error on expression: " + exprTexto);
                return 0.0;
            }

            if (Math.abs(val - 1.0) < 1e-9) {
                System.out.println("Expression '" + exprTexto + "' result: true");
            } else if (Math.abs(val - 0.0) < 1e-9) {
                System.out.println("Expression '" + exprTexto + "' result: false");
            } else {
                System.out.println("Expression '" + exprTexto + "' result: " + val);
            }

            return 0.0;
        }

        @Override
        public Double visitAssignCmd(Calc2Parser.AssignCmdContext ctx) {
            String var = ctx.assign().ID().getText();
            Double val = visit(ctx.assign().expr());
            if (val == null) {
                System.err.println("Error: Attribuition expression value is null.");
                val = 0.0;
            }
            memory.put(var, val);
            return 0.0;
        }

        @Override
        public Double visitRelationalExpr(Calc2Parser.RelationalExprContext ctx) {
            double left = visit(ctx.arithExpr(0));
            double right = visit(ctx.arithExpr(1));
            String op = ctx.relOp().getText();

            return switch (op) {
                case ">" -> left > right ? 1.0 : 0.0;
                case "<" -> left < right ? 1.0 : 0.0;
                case ">=" -> left >= right ? 1.0 : 0.0;
                case "<=" -> left <= right ? 1.0 : 0.0;
                case "==" -> left == right ? 1.0 : 0.0;
                case "!=" -> left != right ? 1.0 : 0.0;
                default -> 0.0;
            };
        }

        @Override
        public Double visitSingleExpr(Calc2Parser.SingleExprContext ctx) {
            return visit(ctx.arithExpr());
        }

        @Override
        public Double visitArithExpr(Calc2Parser.ArithExprContext ctx) {
            double result = visit(ctx.term(0));
            for (int i = 1; i < ctx.term().size(); i++) {
                double right = visit(ctx.term(i));
                Token op = ctx.getChild(2 * i - 1).getPayload() instanceof Token ? (Token) ctx.getChild(2 * i - 1).getPayload() : null;
                if (op != null) {
                    switch (op.getText()) {
                        case "+" -> result += right;
                        case "-" -> result -= right;
                    }
                }
            }
            return result;
        }

        @Override
        public Double visitTerm(Calc2Parser.TermContext ctx) {
            double result = visit(ctx.factor(0));
            for (int i = 1; i < ctx.factor().size(); i++) {
                double right = visit(ctx.factor(i));
                Token op = ctx.getChild(2 * i - 1).getPayload() instanceof Token ? (Token) ctx.getChild(2 * i - 1).getPayload() : null;
                if (op != null) {
                    switch (op.getText()) {
                        case "*" -> result *= right;
                        case "/" -> {
                            if (right == 0) {
                                System.err.println("Error: division by zero.");
                                return 0.0;
                            }
                            result /= right;
                        }
                    }
                }
            }
            return result;
        }

        @Override
        public Double visitNumberFactor(Calc2Parser.NumberFactorContext ctx) {
            return Double.parseDouble(ctx.NUM().getText());
        }

        @Override
        public Double visitIdFactor(Calc2Parser.IdFactorContext ctx) {
            String var = ctx.ID().getText();
            if (!memory.containsKey(var)) {
                System.err.println("Error: variable '" + var + "' not initialized.");
                return 0.0;
            }
            return memory.get(var);
        }

        @Override
        public Double visitParenFactor(Calc2Parser.ParenFactorContext ctx) {
            return visit(ctx.expr());
        }
    }
}
