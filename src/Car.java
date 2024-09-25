class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

public class Car extends Vehicle {
    private String modelName;

    // Invoke parent class constructor;
      Car(String brand,String modelName ){
          super(brand);
          this.modelName=modelName;
      }
    // Invoking overriding method;
    public void honk(){
        System.out.println("Beep,beep");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Ford", "Mustang");
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
