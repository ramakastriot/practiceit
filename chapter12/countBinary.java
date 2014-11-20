/* Write a method countBinary that accepts an integer n as a parameter and 
 * that prints all binary numbers that have n digits in ascending order, 
 * printing each value on a separate line. All n digits should be shown for 
 * all numbers, including leading zeros if necessary. You may assume that n is 
 * non-negative. If n is 0, a blank line of output should be produced.
 */
public void countBinary(int n) {
    String num = "";
    countBinary(n, num);
}

public void countBinary(int n, String num) {
    if(n == 0) {
        System.out.println(num);
        return;
    }
    
    countBinary(n - 1, num + "0");
    countBinary(n - 1, num + "1");
}
