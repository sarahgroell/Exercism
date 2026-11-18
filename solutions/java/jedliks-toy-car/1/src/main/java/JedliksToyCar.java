public class JedliksToyCar {
    public int battery = 100;
    public int distance = 0;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        String distanceDisplay = "Driven " + distance + " meters";
        return distanceDisplay;
    }

    public String batteryDisplay() {
        String batteryDisplay = "";
        if(battery >= 1){
            batteryDisplay = "Battery at " + battery + "%";
        }else{
            batteryDisplay = "Battery empty";
        }
        
        return batteryDisplay;
    }

    public void drive() {
        if(battery > 0){
            distance += 20;
            battery--;
        }
        
    }
}
