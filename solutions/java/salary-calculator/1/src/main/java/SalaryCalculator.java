public class SalaryCalculator {
     
    public double salaryMultiplier(int daysSkipped) {
        boolean expr = daysSkipped >= 5;
        double salaryMultiplier = expr ? 0.85 : 1;
        return salaryMultiplier;
        
    }

    public int bonusMultiplier(int productsSold) {
        boolean expr = productsSold >= 20;
        int bonusMultiplier = expr ? 13 : 10;
        return bonusMultiplier;

    }

    public double bonusForProductsSold(int productsSold) {
        double primeTotale = productsSold * bonusMultiplier(productsSold);
        return primeTotale;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salaireBase = 1000.00 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        salaireBase = salaireBase >= 2000.00 ? 2000.00 : salaireBase;
        return salaireBase;
    } 
}
