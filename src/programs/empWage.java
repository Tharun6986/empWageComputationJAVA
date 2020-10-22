package programs;

import utilities.utility;

/* Author: Tharun Srikanth Reddy
 * Date: 16-10-2020
 * Functionality: Caluculating employee daily wage
 */
public class empWage {
    public static void main(String[] args) {

        utility imp=new utility();
        int attendance = imp.Attendance();
        if (attendance == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

        /* UserCase2
         * Functionality: Calculating Daily wage */
        int Wage = imp.DailyWage();
        if (Wage != 0)
            System.out.println("Total Wage of employee for 8hrs is: " + Wage);
        else
            System.out.println("Employee is Absent, so Total Wage is: " +Wage);


        /* UserCase3
         * Functionality: Adding Part Time employee Wage
         */
        int TotalWage = imp.PartTimeEmp();
        if (TotalWage == 80)
            System.out.println("Part Time employee Wage is: " + TotalWage);
        else if (TotalWage > 80)
            System.out.println("Full Time employee wage is: " +TotalWage);
        else
            System.out.println("Employee is absent");


        /* UserCase4
         * Functionality: Solving by using Switch Case statement
         */

        int wages = imp.SwitchCase();
        if (wages == 80)
            System.out.println("Part Time employee Wage using switch case is: " + wages);
        else if (wages > 80)
            System.out.println("Full Time employee wage using switch case is: " +wages);
        else
            System.out.println("Employee is absent");

    }

}