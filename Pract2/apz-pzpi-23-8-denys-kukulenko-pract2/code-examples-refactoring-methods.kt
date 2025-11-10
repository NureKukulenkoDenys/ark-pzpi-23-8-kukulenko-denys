public double calculateFinalCost(double price, double taxRate) {
    double temp = price * (1 + taxRate);
    System.out.println("Cost before discount: " + temp);

    if (temp > 500) {
        temp = temp - 50.0;
    }
    return temp;
}


public double calculateFinalCost(double price, double taxRate) {
    double costWithTax = price * (1 + taxRate);
    System.out.println("Cost before discount: " + costWithTax);

    double finalCost = costWithTax;
    if (finalCost > 500) {
        finalCost = finalCost - 50.0;
    }
    return finalCost;
}


public double applyDiscount(double netPrice, double rate) {
    if (netPrice > 1000) {
        rate = 0.15;
    }

    netPrice = netPrice * (1 - rate);
    return netPrice;
}


public double applyDiscount(final double netPrice, final double rate) {
    double actualRate = rate;

    if (netPrice > 1000) {
        actualRate = 0.15;
    }

    return netPrice * (1 - actualRate);
}


public class Employee {
    public double calculateAnnualPay(int daysWorked, double hourlyRate, double bonusFactor) {
        double monthlySalary = daysWorked * hourlyRate * 20.0;
        double taxAmount = monthlySalary * 0.25;
        double netSalary = monthlySalary - taxAmount;
        double annualBonus = netSalary * bonusFactor * 12;
        double finalPay = netSalary * 12 + annualBonus;
        return finalPay;
    }
}


class AnnualPayCalculator {
    private final int daysWorked;
    private final double hourlyRate;
    private final double bonusFactor;

    private double monthlySalary;
    private double netSalary;

    public AnnualPayCalculator(int daysWorked, double hourlyRate, double bonusFactor) {
        this.daysWorked = daysWorked;
        this.hourlyRate = hourlyRate;
        this.bonusFactor = bonusFactor;
    }

    public double compute() {
        calculateMonthlySalary();
        calculateNetSalary();

        double annualBonus = netSalary * bonusFactor * 12;
        return netSalary * 12 + annualBonus;
    }

    private void calculateMonthlySalary() {
        monthlySalary = daysWorked * hourlyRate * 20.0;
    }

    private void calculateNetSalary() {
        double taxAmount = monthlySalary * 0.25;
        netSalary = monthlySalary - taxAmount;
    }
}

public class Employee {
    public double calculateAnnualPay(int daysWorked, double hourlyRate, double bonusFactor) {
        return new AnnualPayCalculator(daysWorked, hourlyRate, bonusFactor).compute();
    }
}


public double calculatePrice(double basePrice, double taxRate, double rate) {
    if (basePrice > 500) {
        rate = 0.10;
    }

    double temp = basePrice * (1 + taxRate);
    temp = temp - (temp * rate);

    return temp;
}



public double calculatePrice(final double basePrice, final double taxRate, double initialRate) {
    double actualRate = initialRate;
    if (basePrice > 500) {
        actualRate = 0.10;
    }

    double priceWithTax = basePrice * (1 + taxRate);
    double finalPrice = priceWithTax - (priceWithTax * actualRate);

    return finalPrice;
}


