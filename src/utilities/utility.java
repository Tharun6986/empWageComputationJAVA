package utilities;
/* Author: Tharun Srikanth Reddy
 * Date: 16-10-2020
 * Functionality: This is the utilities file which
                  contains logic for the employee
                  wage program */

public class utility {

    /* Functionality: Logic to find whether employee
                      is present or absent */
    public int Attendance() {
        int present = 0;
        double Check = Math.floor(Math.random() * 10) % 2;

        if (Check == present)
            return 1;
        else
            return 0;
    }
}
