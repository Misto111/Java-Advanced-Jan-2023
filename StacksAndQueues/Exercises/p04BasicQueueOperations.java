package StacksAndQueues.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= n ; i++) {

            queue.add(scanner.nextInt());


        }
        for (int i = 1; i <= s; i++) {
            queue.poll();

        }

    }
}
