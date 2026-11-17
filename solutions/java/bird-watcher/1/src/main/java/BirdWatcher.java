
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] lastWeeksBirds = {0,2,5,3,7,8,4};
        return lastWeeksBirds;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean noBirdsToday = false;
        for(int numberBirds : birdsPerDay){
            if (numberBirds == 0){
                noBirdsToday = true;
            }                
        }
        return noBirdsToday;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sumBirds = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for (int i = 0; i < limit; i++){
            sumBirds += birdsPerDay[i];            
        }
        return sumBirds;
    }

    public int getBusyDays() {
        int numberBusyDays = 0;
        for(int numberBirds : birdsPerDay){
            if(numberBirds >= 5){
                numberBusyDays++;
            }
        }
        return numberBusyDays;
    }
}
