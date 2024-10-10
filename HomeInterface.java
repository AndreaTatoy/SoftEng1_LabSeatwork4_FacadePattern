public class HomeInterface{
    private Light light;
    private Tv tv;
    private AirConditioning airconditioning;

    public HomeInterface(){
        this.light = new Light();
        this.tv = new Tv();
        this.airconditioning = new AirConditioning();
    }

    public void turnOnAll(){
        light.turnOn();
        tv.turnOn();
        airconditioning.turnOn();
    }

    public void turnOffAll(){
        light.turnOff();
        tv.turnOff();
        airconditioning.turnOff();
    }
}