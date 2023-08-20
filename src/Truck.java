
public class Truck extends Vehicle {

    public Truck (int gpk, String manufacturer, String color, int volume){
        super(gpk, manufacturer, color, volume);
    }
    @Override
    public void changeTires(){
        System.out.println("8");
    }
//    public static void main(String[] args){
//        Car c = new Car(8, "WV","Orange", 40);
//        System.out.println(c.toString());
//        float payed = c.fillGas(5);
//        System.out.println("Payed = "+payed);
//        boolean drives = c.drive(2);
//        System.out.println("Can we drive? = " + drives);
//        System.out.println(c.toString());
//    }
}
