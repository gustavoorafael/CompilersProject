package main.java.CompilersProject;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Calc2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Calc2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Calc2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Calc2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputCmd}
	 * labeled alternative in {@link Calc2Parser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputCmd(Calc2Parser.InputCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintCmd}
	 * labeled alternative in {@link Calc2Parser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCmd(Calc2Parser.PrintCmdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignCmd}
	 * labeled alternative in {@link Calc2Parser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignCmd(Calc2Parser.AssignCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link Calc2Parser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(Calc2Parser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link Calc2Parser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(Calc2Parser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Calc2Parser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(Calc2Parser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Calc2Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Calc2Parser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link Calc2Parser#relExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpr(Calc2Parser.RelationalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleExpr}
	 * labeled alternative in {@link Calc2Parser#relExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpr(Calc2Parser.SingleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Calc2Parser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(Calc2Parser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Calc2Parser#arithExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithExpr(Calc2Parser.ArithExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Calc2Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Calc2Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberFactor}
	 * labeled alternative in {@link Calc2Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFactor(Calc2Parser.NumberFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdFactor}
	 * labeled alternative in {@link Calc2Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdFactor(Calc2Parser.IdFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenFactor}
	 * labeled alternative in {@link Calc2Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenFactor(Calc2Parser.ParenFactorContext ctx);
}