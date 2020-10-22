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

        /* Calculating Daily wage */
        int Wage = imp.DailyWage();
        if (Wage != 0)
            System.out.println("Total Wage of employee for 8hrs is: " + Wage);
        else
            System.out.println("Employee is Absent, so Total Wage is: " +Wage);
    }
}

