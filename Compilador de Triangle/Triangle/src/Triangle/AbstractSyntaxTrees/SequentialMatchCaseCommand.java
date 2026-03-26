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
public class SequentialMatchCaseCommand extends MatchCaseCommandSequence {

    public MatchCaseCommandSequence MCCS1;
    public MatchCaseCommandSequence MCCS2;

    public SequentialMatchCaseCommand(MatchCaseCommandSequence mccs1AST,
                                      MatchCaseCommandSequence mccs2AST,
                                      SourcePosition thePosition) {
        super(thePosition);
        MCCS1 = mccs1AST;
        MCCS2 = mccs2AST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitSequentialMatchCaseCommand(this, o);
    }
}
