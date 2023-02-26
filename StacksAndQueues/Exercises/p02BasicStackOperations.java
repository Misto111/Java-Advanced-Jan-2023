package StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class p02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int n = scanner.nextInt();  //брой на елементите
        int s = scanner.nextInt();  //броя на елементи за махане
        int x = scanner.nextInt();  //число за проверяване дали го има в стека

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {     // добавяне
            stack.push(scanner.nextInt());

        }
        for (int i = 1; i <= s ; i++) {   // премахване
            stack.pop();

        }
        if (stack.contains(x)) {    //проверка за наличие на числото x
            System.out.println("true");
        }else {
            if (stack.isEmpty()){
                System.out.println(0);
            }else {
                System.out.println(Collections.min(stack));
            }

        }
    }
}
