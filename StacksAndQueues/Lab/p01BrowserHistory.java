package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        ArrayDeque<String> stackHistory = new ArrayDeque<>();

        String currentInput = scanner.nextLine();

        while (!currentInput.equals("Home")) {

            if (currentInput.equals("back")) {
                if (stackHistory.isEmpty() || stackHistory.size() == 1){
                    System.out.println("no previous URLs");
                    currentInput = scanner.nextLine();
                    continue;
                }
                stackHistory.pop();

            }else {
             stackHistory.push(currentInput);
            }
            System.out.println(stackHistory.peek());

           currentInput = scanner.nextLine();
        }


    }
}
