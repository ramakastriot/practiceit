/* Write a method called inputBirthday that accepts a Scanner for the console 
 * as a parameter and prompts the user to enter a month, day, and year of 
 * birth, then prints the birthdate in a suitable format.
 */
public void inputBirthday(Scanner console) {
    System.out.print("On what day of the month were you born? ");
    int day = console.nextInt();
    System.out.print("What is the name of the month in which you were born? ");
    String month = console.next();
    System.out.print("During what year were you born? ");
    int year = console.nextInt();
    System.out.println("You were born on " + month + " " + day + ", " + year +
                       ". You're mighty old!");
}
