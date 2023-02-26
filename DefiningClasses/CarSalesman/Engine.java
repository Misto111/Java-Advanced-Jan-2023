package DefiningClasses.CarSalesman;

public class Engine {

    private String model;
    private int power;
    private int displacement;        //работен обем
    private String efficiency;       // ефективност

    //Конструктор -> alt + insert


    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return this.displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
