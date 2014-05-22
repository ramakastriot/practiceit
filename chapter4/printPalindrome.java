/* Write a method called printPalindrome that accepts a Scanner for the 
 * console as a parameter, and prompts the user to enter one or more words and 
 * prints whether the entered String is a palindrome. For an added challenge, 
 * make the code case-insensitive.
 */
public void printPalindrome(Scanner console) {
    System.out.print("Type one or more words: ");
    String str = console.nextLine();
    String temp = str.toLowerCase();
    int i = 0;
    int j = str.length() - 1;
    
    while(i < j) {
        if(temp.charAt(i) != temp.charAt(j)) {
            System.out.println(str + " is not a palindrome.");
            return;
        }
        i++;
        j--;
    }
    
    System.out.println(str + " is a palindrome!");
}
