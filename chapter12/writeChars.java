/* Write a method writeChars that accepts an integer parameter n and that 
 * prints out n characters as follows. The middle character of the output 
 * should always be an asterisk ("*"). If you are asked to write out an even 
 * number of characters, then there will be two asterisks in the middle 
 * ("**"). Before the asterisk(s) you should write out less-than characters 
 * ("<"). After the asterisk(s) you should write out greater-than characters 
 * (">"). Your method should throw an IllegalArgumentException if passed a 
 * value less than 1. Note that the output does not advance to the next line.
 */
public void writeChars(int n) {
    if(n < 1)
        throw new IllegalArgumentException();
        
    if(n == 1) {
        System.out.print("*");
        return;
    }
    
    if(n == 2) {
        System.out.print("**");
        return;
    }
    
    System.out.print("<");
    writeChars(n-2);
    System.out.print(">");
}
