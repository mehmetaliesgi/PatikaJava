package OOP;

public class Car {
    String type = "Sedan", model, color;
    int speed, speedLimit = 180;

    public Car(String type, String model, String color, int speed) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = speed;
        System.out.println("Parametreli kurucu metot");
    }

    public Car() {
        System.out.println("Parametresiz kurucu metot");
    }

    public void incSpeed(int increment) {
        if((speed + increment) < speedLimit) {
            speed += increment;
        }
    }

    public void decSpeed(int decrease) {
        if((speed - decrease) > 0) {
            speed -= decrease;
        }
    }
    void printSpeed() {
        System.out.println("Hızınız: " + speed);
    }

    void info () {
        System.out.println("Model \t:" + this.model);
        System.out.println("Type \t:" + this.type);
        System.out.println("Color \t:" + this.color);
        System.out.println("Speed \t:" + this.speed);
    }
}
