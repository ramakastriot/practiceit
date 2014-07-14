/* Write a method named allDigitsOdd that returns whether every digit of a 
 * given integer is odd. Your method should return true if the number consists 
 * entirely of odd digits and false if any of its digits are even. 0, 2, 4, 6, 
 * and 8 are even digits, and 1, 3, 5, 7, 9 are odd digits. Your method should 
 * work for positive and negative numbers.
 */
public boolean allDigitsOdd(int num) {
    num = Math.abs(num);
    
    do {
        if(num % 2 == 0)
            return false;
        
        num /= 10;
    } while(num > 0);
    
    return true;
}
