class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numberIntoText = Integer.toString(numberToCheck); 
        int sum = 0;

        for (int i = 0; i < numberIntoText.length(); i++) {            
            int chiffre = Character.getNumericValue(numberIntoText.charAt(i));
             sum += Math.pow(chiffre,numberIntoText.length());
        }

        if (sum == numberToCheck){
            return true;
        }else{
            return false;
        }

    }

}
