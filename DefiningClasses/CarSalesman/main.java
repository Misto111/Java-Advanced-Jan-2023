package DefiningClasses.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Engine> engines = new ArrayList<>();

        int enginesCount = Integer.parseInt(scanner.nextLine());

        for (int engineCount = 1; engineCount <= enginesCount; engineCount++) {

            String[] engineData = scanner.nextLine().split("\\s+");
            String model = engineData[0];
            int power = Integer.parseInt(engineData[1]);
            //optional:

            int displacement = 0;
            String efficiency = null;

            //проверка дали са въведени displacement and efficiency:

            if (engineData.length == 4) {
                displacement = Integer.parseInt(engineData[2]);
                efficiency = engineData[3];
            } else if (engineData.length == 3) {


                if (Character.isDigit(engineData[2].charAt(0))) {
                    displacement = Integer.parseInt(engineData[2]);

                } else {
                    efficiency = engineData[2];
                }
            }
            //model, power, displacement, efficiency

            Engine engine = new Engine(model, power, displacement, efficiency);

            engines.add(engine);


        }
        int carsCount = Integer.parseInt(scanner.nextLine());

        for (int carCount = 1; carCount <= carsCount; carCount++) {

            String[] carData = scanner.nextLine().split("\\s+");

            String carModel = carData[0];
            String engineModel = carData[1];

            //optional:

            int weight = 0;
            String color = null;

            if (carData.length == 4) {
                weight = Integer.parseInt(carData[2]);
                color = carData[3];
            } else if (carData.length == 3) {

                if (Character.isDigit(carData[2].charAt(0))) {   // има въведено тегло
                    weight = Integer.parseInt(carData[2]);

                } else {  // имаме въведен цвят
                    color = carData[2];
                }


            }
            //намирам кой е двигателя от въведените от списъка

            Engine carEngine = null;
            for (Engine engine : engines) {
                if (engineModel.equals(engine.getModel())) {

                    carEngine = engine;

                }


            }
            Car car = new Car(carModel, carEngine, weight, color);
            System.out.print(car.toString());
        }


    }
}
