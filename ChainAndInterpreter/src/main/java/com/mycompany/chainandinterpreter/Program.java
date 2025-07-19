/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chainandinterpreter;




/**
 *
 * @author Todo mundo
 */
public class Program {
    
    public static void main(String args[]){
    
   /* Expression exp1 = new TerminalExpression("Java");
    Expression exp2 = new TerminalExpression("Python");
    Expression orExp = new OrExpression(exp1, exp2);

        System.out.println(orExp.interpret("Gosto de C++"));*/
        
Handler low = new LowLevelHandler();
Handler medium = new MediumLevelHandler();
Handler high = new HighLevelHandler();

low.setNext(medium);
medium.setNext(high);


low.handleRequest("baixo");
    
    }
    
    
  
}
