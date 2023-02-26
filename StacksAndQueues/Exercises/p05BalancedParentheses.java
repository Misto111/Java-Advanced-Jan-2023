package StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class p05BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String input =  scanner.nextLine();

        ArrayDeque<Character> openBracketsStack = new ArrayDeque<>();



        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {

                openBracketsStack.push(bracket);


            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                char lastOpenBracket = openBracketsStack.pop();

                if (lastOpenBracket == '(' && bracket == ')'){

                } else if (lastOpenBracket == '{' && bracket == '}') {

                } else if (lastOpenBracket == '[' && bracket == ']') {


                }else {
                    break;
                }

            }

        }


    }
}
