/* Write a method named daysInMonth that accepts a month (an integer between 1 
 * and 12) as a parameter and returns the number of days in that month in this 
 * year. For example, the call daysInMonth(9) would return 30 because 
 * September has 30 days. Assume that the code is not being run during a leap 
 * year (that February always has 28 days).
 */
public int daysInMonth(int m) {
    switch(m) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            return 31;
        case 4:
        case 6:
        case 9:
        case 11:
            return 30;
        default:
            return 28;
    }
}
