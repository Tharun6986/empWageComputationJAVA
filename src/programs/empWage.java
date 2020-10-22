package programs;
import utilities.empWageRefactorObject;
import utilities.utility;
import java.util.ArrayList;
/*
 * Author: Tharun Srikanth Reddy
 * Created date: 21st oct 2020
 * Functionality: Computing Employee Wage for multiple companies
 *                using collections.
 */
public class empWage {
    public static void main(String[] argv) {
        utility employeeWageCollectionsLogic = new utility();

        empWageRefactorObject dmart = new empWageRefactorObject("Dmart", 20, 20, 100);
        empWageRefactorObject Reliance = new empWageRefactorObject("Reliance", 20, 28, 150);
        empWageRefactorObject Spencers = new empWageRefactorObject("Spencers", 20, 28, 130);
        empWageRefactorObject More = new empWageRefactorObject("More", 20, 25, 120);

        int dmartWages = employeeWageCollectionsLogic.WageHrs(dmart.getCompany(), dmart.getEmpRatePerHr(), dmart.getNumWorkingDays(),
                dmart.getMaxWorkingHrsInMonth());
        System.out.println("Total Dmart Employee wages are :" + dmartWages);
        int RelianceWages = employeeWageCollectionsLogic.WageHrs(Reliance.getCompany(), Reliance.getEmpRatePerHr(), Reliance.getNumWorkingDays(),
                Reliance.getMaxWorkingHrsInMonth());
        System.out.println("Total Reliance Employee wages are :" + RelianceWages);
        int SpencersWages = employeeWageCollectionsLogic.WageHrs(Spencers.getCompany(), Spencers.getEmpRatePerHr(), Spencers.getNumWorkingDays(),
                Spencers.getMaxWorkingHrsInMonth());
        System.out.println("Total Spencers Employee wages are :" + SpencersWages);
        int MoreWages = employeeWageCollectionsLogic.WageHrs(More.getCompany(), More.getEmpRatePerHr(), More.getNumWorkingDays(), More.getMaxWorkingHrsInMonth());
        System.out.println("Total More Employee wages are :" + MoreWages);

        ArrayList<empWageRefactorObject> list = new ArrayList<empWageRefactorObject>();
        list.add(dmart);
        list.add(Reliance);
        list.add(Spencers);
        list.add(More);

        for (empWageRefactorObject Company : list)
            System.out.println(Company);
    }


}