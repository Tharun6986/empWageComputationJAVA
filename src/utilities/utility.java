package utilities;

/* Functionality: This file contains the refactor code for
                  calculating employee wage */


public class utility {
    int empHrs;
    public int WageHrs(String company, int empRatePerHr, int NumWorkingDays, int MaxWorkingHrsInMonth) {
        int totalWages=0,totalEmpHrs=0,totalWorkingDays=0;

        while (totalEmpHrs<MaxWorkingHrsInMonth && totalWorkingDays<NumWorkingDays)
        {
            totalWorkingDays++;
            double empCheck = Math.floor(Math.random()*10)%3;
            switch ((int) empCheck)
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
            totalEmpHrs=totalEmpHrs+empHrs;
            totalWages=totalEmpHrs*empRatePerHr;
        }
        System.out.println("Name of the company is :"+company);
        System.out.println("Working hours of the Employee :"+totalEmpHrs);
        return totalWages;
    }

}