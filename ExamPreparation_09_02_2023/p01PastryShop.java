package Exampreparation09_02_2023;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class p01PastryShop {

    private static final int Biscuit_VALUE = 25;
    private static final int Cake_VALUE = 50;
    private static final int Pastry_VALUE = 75;
    private static final int Pie_VALUE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] liquidInfo = scanner.nextLine().split("\\s+");

        Deque<Integer> liquids = new ArrayDeque<>();

        for (String liquid : liquidInfo) {
            liquids.offer(Integer.parseInt(liquid));
        }
        String[] ingredientsInfo = scanner.nextLine().split("\\s+");
        Deque<Integer> ingredients = new ArrayDeque<>();
        for (String ingredient : ingredientsInfo) {
            ingredients.push(Integer.parseInt(ingredient));
        }
        int biscuitCount = 0, cakeCount = 0, pastryCount = 0, pieCount = 0;

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            Integer liquid = liquids.poll();
            Integer ingredient = ingredients.pop();
            int possibleDish = liquid + ingredient;

            switch (possibleDish) {
                case Biscuit_VALUE:
                    biscuitCount++;
                    break;
                case Cake_VALUE:
                    cakeCount++;
                    break;
                case Pastry_VALUE:
                    pastryCount++;
                    break;
                case Pie_VALUE:
                    pieCount++;
                    break;

                default:
                    ingredients.push(ingredient + 3);
                    break;


            }

        }
        if (biscuitCount > 0 && cakeCount > 0 && pastryCount > 0 && pieCount > 0) {
            System.out.println("Great! You succeeded in cooking all the food!");
        }else {
            System.out.println("What a pity! You didn't have enough materials to cook everything." );
        }

        System.out.print("Liquids left: ");

        if (liquids.isEmpty()) {
            System.out.println("none");
        }else {
            System.out.println(liquids.toString().replaceAll("[\\[\\]]", ""));
        }
        System.out.print("Ingredients left: ");
        if (ingredients.isEmpty()) {
            System.out.println("none");
        }else {
            System.out.println(ingredients.toString().replaceAll("[\\[\\]]", ""));
        }
        System.out.printf("Biscuit: %d%nCake: %d%nPie: %d%nPastry: %d%n", biscuitCount, cakeCount, pieCount, pastryCount);
    }
}
