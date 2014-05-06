/* Write a method called processName that accepts a Scanner for the console as 
 * a parameter and that prompts the user to enter his or her full name, then 
 * prints the name in reverse order (i.e., last name, first name). You may 
 * assume that only a first and last name will be given. You should read the 
 * entire line of input at once with the Scanner and then break it apart as 
 * necessary.
 */
public void processName(Scanner console) {
    System.out.print("Please enter your full name: ");
    String name = console.nextLine();
    String[] parts = name.split("\\s+");
    System.out.println("Your name in reverse order is " + parts[1] + ", " +
        parts[0]);
}
