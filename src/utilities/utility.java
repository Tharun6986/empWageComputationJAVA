package utilities;
/* Author: Tharun Srikanth Reddy
 * Date: 16-10-2020
 * Functionality: This is the utilities file which
                  contains logic for the employee
                  wage program */

public class utility {

    /* Functionality: Getting Random number */
    public double RandomCheck(){
        double Check = Math.floor(Math.random() * 10) % 2;
        return Check;
    }
    /* UserCase1
     * Functionality: Logic to find whether employee
                      is present or absent */
    public int Attendance() {
        int present = 0;
        double Check = RandomCheck();

        if (Check == present)
            return 1;
        else
            return 0;
    }

    /* UserCase2
     * Functionality: Logic to Calculate the
                      Daily Wage*/
    public int DailyWage() {
        int empRatePerHr=20;
        int empHrs=8;
        int Wage;
        int present=1;
        double Check = RandomCheck();

        if (Check == present)
            return Wage = empRatePerHr*empHrs;
        else
            return 0;
    }

    /* UserCase3
     * Functionality: Logic to Add the part time
                      Employee wage */
    public int PartTimeEmp() {
        int PartTime = 1;
        int FullTime = 2;
        int empRatePerHr = 20;
        int TotalWage;
        double Check = Math.floor(Math.random() * 10) % 3;

        if (Check == FullTime)
            return TotalWage = empRatePerHr * 8;
        else if (Check == PartTime)
            return TotalWage = empRatePerHr * 4;
        else
            return 0;
    }
}