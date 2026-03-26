/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author chp20
 */
public class MatchCaseExpression extends MatchCaseExpressionSequence {

    public Expression E1; // valor del case
    public Expression E2; // expresión resultado

    public MatchCaseExpression(Expression e1AST, Expression e2AST,
                               SourcePosition thePosition) {
        super(thePosition);
        E1 = e1AST;
        E2 = e2AST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitMatchCaseExpression(this, o);
    }
}
