/* Write a method named season that takes two integers as parameters 
 * representing a month and day and that returns a String indicating the 
 * season for that month and day. Assume that months are specified as an 
 * integer between 1 and 12 (1 for January, 2 for February, and so on) and 
 * that the day of the month is a number between 1 and 31.
 *
 * If the date falls between 12/16 and 3/15, you should return "Winter". If 
 * the date falls between 3/16 and 6/15, you should return "Spring". If the 
 * date falls between 6/16 and 9/15, you should return "Summer". And if the 
 * date falls between 9/16 and 12/15, you should return "Fall".
 */
public String season(int m, int d) {
    if(m < 3 || (m == 3 && d <= 15) || (m == 12 && d >= 16)) {
        return "Winter";
    } else if((3 < m && m < 6) || (m == 3 && d >= 16) || (m == 6 && d <= 15)) {
        return "Spring";
    } else if((6 < m && m < 9) || (m == 6 && d >= 16) || (m == 9 && d <= 15)) {
        return "Summer";
    } else {
        return "Fall";
    }
}
