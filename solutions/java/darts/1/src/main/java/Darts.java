class Darts {
    int score(double xOfDart, double yOfDart) {
        double distanceSquared = (xOfDart * xOfDart) + (yOfDart * yOfDart);
        int r1 = 1;
        int r2 = 5;
        int r3 = 10;

        if (distanceSquared <= r1) { 
            return 10;
        } else if (distanceSquared <= Math.pow(r2,2)) { 
            return 5;
        }else if (distanceSquared <= Math.pow(r3,2)){
            return 1;
        }else
            return 0;
    }
}
