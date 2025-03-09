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
                }

            }

        }


        return true;
    }
}
