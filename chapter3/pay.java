/* Write a method named pay that accepts a real number for a TA's salary and an  * integer for the number of hours the TA worked this week, and returns how 
 * much money to pay the TA. The TA should receive "overtime" pay of 1 1/2 
 * normal salary for any hours above 8.
 */
public double pay(double sal, int h) {
    return h > 8 ? sal * h + (h - 8) * 0.5 * sal : sal * h;
}
