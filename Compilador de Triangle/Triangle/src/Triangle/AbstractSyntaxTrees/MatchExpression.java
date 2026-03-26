/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author Carmen Hidalgo Paz
 */
public class MatchExpression extends Expression {

    public Expression E;
    public MatchCaseExpressionSequence MCES;
    public Expression OE; // otherwise expression

    public MatchExpression(Expression eAST,
                           MatchCaseExpressionSequence mcesAST,
                           Expression oeAST,
                           SourcePosition thePosition) {
        super(thePosition);
        E = eAST;
        MCES = mcesAST;
        OE = oeAST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitMatchExpression(this, o);
    }
}
