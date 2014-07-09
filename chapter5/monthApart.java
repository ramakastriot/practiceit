/* Write a method named monthApart that accepts four integer parameters 
 * representing two calendar dates. Each date consists of a month (1 through 12
 * and a day (1 through the number of days in that month [28-31]). The method
 * returns whether the dates are at least a month apart. Assume that all dates
 * in this problem occur during the same year. Note that the first date could
 * come before or after (or be the same as) the second date. Assume that all
 * parameter values passed are valid.
 */
public boolean monthApart(int m1, int d1, int m2, int d2) {
    if(m1 == m2)
        return false;
    
    if(Math.abs(m1 - m2) > 1)
        return true;
    
    if(m1 > m2)
        return d1 - d2 >= 0;
    
    return d2 - d1 >= 0;
}
