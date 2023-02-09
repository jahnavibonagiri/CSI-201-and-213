package Project03;
import java.io.File;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

/**
 * The expression class contains methods that converts the infix to postfix and evaluates the expression.
 * @author Jahnavi Bonagiri
 * @version 1.0
 */

public class Expression <E>{
	
	/**
	 * Contains the expression
	 */
	
	private String infix;
	
	/*
	 * Default Constructor
	 */
	
	public Expression() {
		
	}
	
	/**
	 * Initializes the infix expression
	 * @param infix
	 */
	public Expression( String infix) {
		this.infix=infix;
		
	}
	
	/**
	 * Sets the infix expression
	 * @param infix
	 */
	public void setInfix( String infix) {
		this.infix=infix.replaceAll("\\s+","");
		
	}
	
	/**
	 * Gets the infix expression
	 * @returns the infix expression
	 * @param infix
	 */
	
	public String getInfix() {
		return this.infix;
	}
	
	
	/**
	 * Converts the infix expression to postfix
	 * @returns the postfix expression
	 */
	
	public String infixtoPostfix() {
		GenericStack <String> Postfix= new GenericStack<String>();
		StringTokenizer tokens= new StringTokenizer(this.infix, "+-*/()", true);
		
		String postfix= "";
		while (tokens.hasMoreTokens()) {
			String Token1= tokens.nextToken();
			if(Token1.equals("(")) {
				Postfix.push(Token1);
			}
			else if (Token1.equals(")")) {
				while(!Postfix.peek().equals("(")) {
					postfix= postfix+ " "+ Postfix.pop();
				
				}
				
				if(Postfix.peek().equals("(")) {
					Postfix.pop();
				}
			
			}
		
			else if(this.Operator(Token1)) {
				if(Postfix.isEmpty()||!Operator(Postfix.peek())){
					
					Postfix.push(Token1);
				}
			else {
				while((Precedence(Token1)<=Precedence(Postfix.peek()))){
					if(!Postfix.isEmpty()) {
						postfix= postfix+ " "+ Postfix.pop();
					}
					Postfix.push(Token1);
				}
			}
			}
		

		else {
			postfix= postfix+ " "+ Token1;
		}
			}
		
		while(!Postfix.isEmpty()) {
			postfix= postfix+ " "+ Postfix.pop();
		}
		return postfix;
		
		}

		
	/**
	 * Evaluates the postfix expression 
	 * @returns the evaluated result
	 */
	
	public int Evaluator() {
		
		GenericStack<Integer> postfixStack= new GenericStack<Integer>();
		StringTokenizer postfixExpression= new StringTokenizer(this.infixtoPostfix());
		
		while(postfixExpression.hasMoreTokens()) {
			
			
			String token1= postfixExpression.nextToken();
			//System.out.println(token);
			
			if(Operator(token1)) {
				int number1=postfixStack.pop();
				int number2=postfixStack.pop();
				
			
				if(token1.equals("*")) {
					postfixStack.push(number1*number2);
				
			}
				else if(token1.equals("/")) {
					postfixStack.push(number2/number1);
					
				
			}
			else if(token1.equals("+")) {
				postfixStack.push(number1+number2);
				
			}
			
			else{
				postfixStack.push(number2-number1);
				
			}
			
		}
			else {
				postfixStack.push(Integer.parseInt(token1));
			}
			
		}
			
		return postfixStack.pop();		
}

/**
 * Checks the operators in the expression and see if it equals to the  +, -, /, *
 * @param String token
 * @return if true or false
 */

public boolean Operator(String tokens) {
	if(tokens.equals("*")|| tokens.equals("/")|| tokens.equals("+")|| tokens.equals("-")) {
		return true;
	}
	return false;
}
/**
 * Checks the precedence of the operators
 * @param String tokens
 * @returns the precedence of the operators.
 */

public int Precedence(String tokens) {
	tokens= tokens.replaceAll("\\s+","");
	int precedence;
	if((tokens.equals("+"))|| (tokens.equals("-"))){
		return precedence=1;
	}
	else {
		
		return precedence=2;
	}
}
}