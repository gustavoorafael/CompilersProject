package main.java.CompilersProject;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Calc2Parser}.
 */
public interface Calc2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Calc2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Calc2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calc2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Calc2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputCmd}
	 * labeled alternative in {@link Calc2Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterInputCmd(Calc2Parser.InputCmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputCmd}
	 * labeled alternative in {@link Calc2Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitInputCmd(Calc2Parser.InputCmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintCmd}
	 * labeled alternative in {@link Calc2Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterPrintCmd(Calc2Parser.PrintCmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintCmd}
	 * labeled alternative in {@link Calc2Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitPrintCmd(Calc2Parser.PrintCmdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignCmd}
	 * labeled alternative in {@link Calc2Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterAssignCmd(Calc2Parser.AssignCmdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignCmd}
	 * labeled alternative in {@link Calc2Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitAssignCmd(Calc2Parser.AssignCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calc2Parser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(Calc2Parser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calc2Parser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(Calc2Parser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calc2Parser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(Calc2Parser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calc2Parser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(Calc2Parser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calc2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(Calc2Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calc2Parser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(Calc2Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calc2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Calc2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calc2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Calc2Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link Calc2Parser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(Calc2Parser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link Calc2Parser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(Calc2Parser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleExpr}
	 * labeled alternative in {@link Calc2Parser#relExpr}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpr(Calc2Parser.SingleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleExpr}
	 * labeled alternative in {@link Calc2Parser#relExpr}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpr(Calc2Parser.SingleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calc2Parser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(Calc2Parser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calc2Parser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(Calc2Parser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calc2Parser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithExpr(Calc2Parser.ArithExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calc2Parser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithExpr(Calc2Parser.ArithExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Calc2Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Calc2Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Calc2Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Calc2Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberFactor}
	 * labeled alternative in {@link Calc2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNumberFactor(Calc2Parser.NumberFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberFactor}
	 * labeled alternative in {@link Calc2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNumberFactor(Calc2Parser.NumberFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdFactor}
	 * labeled alternative in {@link Calc2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIdFactor(Calc2Parser.IdFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdFactor}
	 * labeled alternative in {@link Calc2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIdFactor(Calc2Parser.IdFactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenFactor}
	 * labeled alternative in {@link Calc2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterParenFactor(Calc2Parser.ParenFactorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenFactor}
	 * labeled alternative in {@link Calc2Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitParenFactor(Calc2Parser.ParenFactorContext ctx);
}