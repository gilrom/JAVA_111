public class Motorcycle extends Vehicle {
    public Motorcycle (int gpk, String manufacturer, String color, int volume){
        super(gpk, manufacturer, color, volume);
    }
    @Override
    public void changeTires(){
        System.out.println("2");
    }
}