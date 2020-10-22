package programs;

import utilities.utility;

/* Author: Tharun Srikanth Reddy
 * Date: 16-10-2020
 * Functionality: To check whether employee is present or absent
 */
public class empWage {
    public static void main(String[] args) {

        utility imp=new utility();
        int attendance = imp.Attendance();
        if (attendance == 1)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");


    }
}
