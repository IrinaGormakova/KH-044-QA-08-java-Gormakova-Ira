package practice.arrays;

public class Car implements Comparable<Car>{
    private String type;
    private float engineCapacity;
    private int productionYear;

    public Car (String myType, float myEngineCapacity, int myYear){
        this.type=myType;
        this.engineCapacity=myEngineCapacity;
        this.productionYear=myYear;
    }

    public int getProductionYear() {
        return productionYear;
    }
    @Override
    public int compareTo(Car o) {
        return this.getProductionYear()-o.getProductionYear();
    }

    @Override
    public String toString() {
        return "Car{model="+this.type+", productionYear="+this.productionYear+", engineCapacity="+this.engineCapacity+"}\n";
    }
}

