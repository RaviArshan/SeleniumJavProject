package interview;

import java.util.Stack;

public class BalanceParenthesis {
    public static void main(String[] args) {
     System.out.println(   balancedParenthesis("{[()]}"));
    }
    public static boolean balancedParenthesis(String str) {
        Stack<Character> parenthesis = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            Character paranthesisCharacter = str.charAt(i);
            if(paranthesisCharacter=='{' || paranthesisCharacter=='[' || paranthesisCharacter=='(')
            {
                parenthesis.push(paranthesisCharacter);
            }
            else if(paranthesisCharacter==')' || paranthesisCharacter=='}' || paranthesisCharacter==']')
            {
                Character topElement=parenthesis.pop();
                if(!((topElement=='('&&paranthesisCharacter==')') ||( topElement=='{'&&paranthesisCharacter=='}')
                        || (topElement=='['&&paranthesisCharacter==']')))
                {
                    return false;
                    //his means:
                    //
                    //If topElement and paranthesisCharacter do NOT form one of the valid pairs,
                    //the string is invalid → we immediately return false.
                    //
                    //Example:
                    //
                    //If stack top is { and current char is ],
                    //{ and ] do not match → unbalanced → return false.
                }

            }

            //{ [ ( --)

        }


        return true;
    }
}
