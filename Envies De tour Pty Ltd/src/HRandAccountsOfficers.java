public class HRandAccountsOfficers extends Employees {
    private static final String department = "HRandAccountsOfficers";
    private static final double carAllowanceRate = 0.15;

    /* Constructor */

    public HRandAccountsOfficers(String employeeID, String firstName, String lastName, String dateOfBirth, String gender, String address, String titleOfEmployment, String dateHired, String department, int hoursWorked, double rateOfPay, int leaveDays, double carAllowance, double monthlyGratuity, double taxRate, double monthlySalary, String city) {
        super(employeeID, firstName, lastName, dateOfBirth, gender, address, titleOfEmployment, dateHired, department, hoursWorked, rateOfPay, leaveDays, carAllowance, monthlyGratuity, taxRate, monthlySalary, city);
    }

    //Getters


    public static String Department() {

        return department;
    }

    public static double getCarAllowanceRate() {

        return carAllowanceRate;
    }

    public double calculateCarAllowance() {
        double carAllowance = (this.getHoursWorked() * this.getRateOfPay()) * HRandAccountsOfficers.carAllowanceRate;

        return carAllowance;
    }

    public double calculatingMonthlySalary() {
        double monthlySalary = ((((this.getHoursWorked() * this.getRateOfPay()) + this.getCarAllowance())) - (this.getMonthlyGratuity() + (0.14 * getRateOfPay() * getHoursWorked())));

        return monthlySalary;
    }
}



