package programs;
import utilities.empWageRefactorObject;
import utilities.utility;
/*
 * Author: Tharun Srikanth Reddy
 * Created date: 19th oct 2020
 * Functionality: Refactor the Code to write a Class Method to
                  Compute Employee Wage
 */
public class empWage{
    public static void main(String[] argv){
        utility employeeWage=new utility();
        empWageRefactorObject employeeObject=new empWageRefactorObject();
        employeeObject.setCompany("Reliance");
        employeeObject.setEmpRatePerHr(20);
        employeeObject.setNumWorkingDays(20);
        employeeObject.setMaxWorkingHrsInMonth(100);
        int totalWages = employeeWage.WageHrs(employeeObject.getCompany(),employeeObject.getEmpRatePerHr(), employeeObject.getNumWorkingDays(), employeeObject.getMaxWorkingHrsInMonth());
        System.out.println("Employee total Wage is :" + totalWages);

    }
}