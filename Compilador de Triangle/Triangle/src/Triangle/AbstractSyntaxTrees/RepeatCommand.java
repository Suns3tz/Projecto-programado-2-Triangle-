/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 *
 * @author aaron
 *///
public class RepeatCommand extends Command{
    
    public RepeatCommand (Command cAST, Expression eAST, SourcePosition thePosition){
        super(thePosition);
        C = cAST;
        E = eAST;
    }
    
    public Object visit(Visitor v, Object o){
        return v.visitRepeatCommand(this, o);
    }
    
    public Command C;
    public Expression E;

}