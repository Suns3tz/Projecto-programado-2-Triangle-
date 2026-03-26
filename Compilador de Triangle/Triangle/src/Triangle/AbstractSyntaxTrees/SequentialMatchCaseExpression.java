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
public class SequentialMatchCaseExpression extends MatchCaseExpressionSequence {

    public MatchCaseExpressionSequence MCES1;
    public MatchCaseExpressionSequence MCES2;

    public SequentialMatchCaseExpression(MatchCaseExpressionSequence mces1AST,
                                         MatchCaseExpressionSequence mces2AST,
                                         SourcePosition thePosition) {
        super(thePosition);
        MCES1 = mces1AST;
        MCES2 = mces2AST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitSequentialMatchCaseExpression(this, o);
    }
}
