package programs;
import utilities.empWageRefactorObject;
import utilities.utility;
/*
 * Author: Tharun Srikanth Reddy
 * Created date: 19th oct 2020
 * Functionality: Refactor the Code to write a Class Method to
                  Compute Employee Wage for multiple companies.
 */
public class empWage{
    public static void main(String[] argv){
        utility employeeWage=new utility();
        empWageRefactorObject empWageObject=new empWageRefactorObject();
        empWageObject.setCompany("Reliance");
        empWageObject.setEmpRatePerHr(20);
        empWageObject.setNumWorkingDays(20);
        empWageObject.setMaxWorkingHrsInMonth(100);
        int ReliancetotalWages = employeeWage.WageHrs(empWageObject.getCompany(),empWageObject.getEmpRatePerHr(), empWageObject.getNumWorkingDays(), empWageObject.getMaxWorkingHrsInMonth());
        System.out.println("Reliance Employee total Wage is :" + ReliancetotalWages);

        empWageObject.setCompany("DMart");
        empWageObject.setEmpRatePerHr(17);
        empWageObject.setNumWorkingDays(25);
        empWageObject.setMaxWorkingHrsInMonth(90);
        int dmartTotalWage = employeeWage.WageHrs(empWageObject.getCompany(),empWageObject.getEmpRatePerHr(), empWageObject.getNumWorkingDays(), empWageObject.getMaxWorkingHrsInMonth());
        System.out.println("DMart Employee total Wage is :" + dmartTotalWage);
    }
}