public class CarsAssemble {
    public static int normalProductionRate = 221;
    
    public double productionRatePerHour(int speed) {
        double productionRate = 0;
        
        if(speed >= 1 && speed <= 4){
            productionRate = speed * normalProductionRate;
        }else if (speed >=5 && speed <= 8){
            productionRate = speed * normalProductionRate * 0.9;
        }else if (speed == 9){
            productionRate = speed * normalProductionRate * 0.8;
        }else{
            productionRate = speed * normalProductionRate * 0.77;
        }
        return productionRate;
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed)/60);
        
    }
}
