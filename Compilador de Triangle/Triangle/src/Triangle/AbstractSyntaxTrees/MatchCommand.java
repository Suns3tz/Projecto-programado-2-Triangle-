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
public class MatchCommand extends Command {

    public Expression E;
    public MatchCaseCommandSequence MCCS;
    public Command C; // otherwise, puede ser null

    public MatchCommand(Expression eAST, MatchCaseCommandSequence mccsAST, Command cAST,
                        SourcePosition thePosition) {
        super(thePosition);
        E = eAST;
        MCCS = mccsAST;
        C = cAST;
    }

    public Object visit(Visitor v, Object o) {
        return v.visitMatchCommand(this, o);
    }
}
