
public class Car {
    private int GPK;
    private String manufacturer;
    private String color;
    private int volume;
    private int gas;
    public Car (int gpk, String manufacturer, String color, int volume){
        this.GPK = gpk;
        this.manufacturer = manufacturer;
        this. color = color;
        this.volume = volume;
        this.gas = volume;
    }
    @Override
    public String toString() {
        return this.color + " " + this.manufacturer + " " + this.gas + "/" + this.volume;
    }
    public boolean drive(float dist){
        if((dist * this.GPK) <= this.gas){
            this.gas -= dist*this.GPK;
            return true;
        }
        return  false;
    }
    public float fillGas(float price_per_liter){
        float total_price = (this.volume - this.gas) * price_per_liter;
        this.gas = this.volume;
        return total_price;
    }
    public void changeTires(){
        System.out.println("4");
    }
    public static void main(String[] args){
        Car c = new Car(8, "WV","Orange", 40);
        System.out.println(c.toString());
        float payed = c.fillGas(5);
        System.out.println("Payed = "+payed);
        boolean drives = c.drive(2);
        System.out.println("Can we drive? = " + drives);
        System.out.println(c.toString());
    }
}
