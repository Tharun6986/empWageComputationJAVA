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

    /* UserCase4
     * Functionality: Logic to find Full time wage and
                      part time wage by using switch case*/

    public int SwitchCase(){
        int PartTime;
        int FullTime;
        int empRatePerHr = 20;
        int wages;
        double Check = Math.floor(Math.random() * 10) % 3;
        switch ( (int) Check) {
            case 1:
                FullTime=8;
                wages=empRatePerHr*FullTime;
                return wages;
            case 2:
                PartTime=4;
                wages=empRatePerHr*PartTime;
                return wages;
            default:
                return 0;
        }
    }

    /* UserCase5
     * Functionality: Logic to calculating employee wages
                      for a month */
    public int WagesforMonth(){
        int NumWorkingDays=20;
        int wageformonth=0;
        int empHrs=0;
        int wages;
        int empRatePerHr=20;
        for (int day = 1; day<=NumWorkingDays; day++)
        {
            double randomCheck=(int)Math.floor(Math.random()*10)%3;
            switch ((int) randomCheck)
            {
                case 1:
                    empHrs = 8;
                    break;
                case 2:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            wages=empHrs*empRatePerHr;
            wageformonth = wageformonth+wages;
        }
        return wageformonth;
    }

}
