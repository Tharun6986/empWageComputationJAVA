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
        empWageRefactorObject ReliancEemployeeWage=new empWageRefactorObject();
        ReliancEemployeeWage.setCompany("Reliance");
        ReliancEemployeeWage.setEmpRatePerHr(20);
        ReliancEemployeeWage.setNumWorkingDays(20);
        ReliancEemployeeWage.setMaxWorkingHrsInMonth(100);
        int ReliancetotalWages = employeeWage.WageHrs(ReliancEemployeeWage.getCompany(),ReliancEemployeeWage.getEmpRatePerHr(), ReliancEemployeeWage.getNumWorkingDays(), ReliancEemployeeWage.getMaxWorkingHrsInMonth());
        System.out.println("Reliance Employee total Wage is :" + ReliancetotalWages);

        empWageRefactorObject dmartemployeewage=new empWageRefactorObject();
        dmartemployeewage.setCompany("DMart");
        dmartemployeewage.setEmpRatePerHr(17);
        dmartemployeewage.setNumWorkingDays(25);
        dmartemployeewage.setMaxWorkingHrsInMonth(90);
        int dmartTotalWage = employeeWage.WageHrs(dmartemployeewage.getCompany(),dmartemployeewage.getEmpRatePerHr(), dmartemployeewage.getNumWorkingDays(), dmartemployeewage.getMaxWorkingHrsInMonth());
        System.out.println("DMart Employee total Wage is :" + dmartTotalWage);
    }
}