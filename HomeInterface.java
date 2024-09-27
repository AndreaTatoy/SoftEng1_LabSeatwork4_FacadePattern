public class HomeInterface{
    private HomeService homeService;

    public HomeInterface(HomeService homeService){
        this.homeService = homeService;
    }

    public void turnOnAll(){
        homeService.turnOn();
    }

    public void turnOffAll(){
        homeService.turnOff();
    }
}

/* 
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn(); */

    /*
     * 
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
     */