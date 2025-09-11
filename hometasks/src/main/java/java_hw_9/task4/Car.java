package java_hw_9.task4;

public class Car {

    private String model;
    private double price;
    private int maxSpeed;
    private int countOfWheels;

    private Car(Builder builder){
        this.model = builder.getModel();
        this.price = builder.getPrice();
        this.maxSpeed = builder.getMaxSpeed();
        this.countOfWheels = builder.getCountOfWheels();
    }

    public static class Builder{

        private String model;
        private double price;
        private int maxSpeed;
        private int countOfWheels;

        public String getModel() {
            return model;
        }

        public Builder setModel(String model){
            this.model = model;
            return this;
        }

        public double getPrice() {
            return price;
        }

        public Builder setPrice(double price){
            this.price = price;
            return this;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public Builder setMaxSpeed(int maxSpeed){
            this.maxSpeed = maxSpeed;
            return this;
        }

        public int getCountOfWheels() {
            return countOfWheels;
        }

        public Builder setCountOfWheels(int countOfWheels){
            this.countOfWheels = countOfWheels;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", countOfWheels=" + countOfWheels +
                '}';
    }
}
