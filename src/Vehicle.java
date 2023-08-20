public abstract class Vehicle {
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
    public abstract  void changeTires();
}
