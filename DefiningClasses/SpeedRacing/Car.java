package DefiningClasses.SpeedRacing;

public class Car {

    private  String model;
    private double fuelAmount;
    private double consumptionFuelPerKm;
    private int distanceTraveled;
             //конструктор - метод, чрез който съдаваме обекти от класа
    public Car(String model, double fuelAmount, double consumptionFuelPerKm){
        //нов прзен обект
                this.model = model;
                this.fuelAmount = fuelAmount;
                this.consumptionFuelPerKm = consumptionFuelPerKm;
                this.distanceTraveled = 0;
    }
    public boolean drive(int kmDrive){
        //1.нужно количество, за да преминем дадените км(kmDrive);

        double needFuel = kmDrive * this.consumptionFuelPerKm;

        if (needFuel <= this.fuelAmount){   //можем да изминем разстоянието
            this.fuelAmount -= needFuel;
            this.distanceTraveled += kmDrive;
            return  true;
        }
        return false;
    }
    @Override
    public String toString(){     //целта на този метод "toString" e да ми дава всеки един обект от този клас под формата на текст
        return String.format("%s %.2f %d", this.model, this.fuelAmount, this.distanceTraveled);

    }

}
