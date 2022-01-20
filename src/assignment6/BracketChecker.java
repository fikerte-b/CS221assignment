package assignment6;

import java.util.Scanner;
import java.util.Stack;

public class BracketChecker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter an expression ");
        String st = keyboard.next();
        System.out.println(isBalanced(st));

    }
    public static boolean isBalanced(String str){

        Stack<Character> strStack = new Stack<>();
        for(int i =0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c=='{' || c =='(' || c=='[') {
                strStack.push(c);

            }
            if(strStack.isEmpty())
                return false;

            if(c == '}') {
                if (strStack.pop() != '{') {
                    return false;
                }
            }
            if(c == ')') {
                if (strStack.pop() != '(') {
                    return false;
                }
            }
            if(c == ']') {
                if (strStack.pop() != '[') {
                    return false;
                }
            }
        }

        return strStack.isEmpty();
    }
}
