/* Write a method named printAverage that accepts a Scanner for the console as 
 * a parameter and repeatedly prompts the user for numbers. Once any number 
 * less than zero is typed, the average of all non-negative numbers typed is 
 * displayed. Display the average as a double, and do not round it.
 */
public void printAverage(Scanner console) {
    System.out.print("Type a number: ");
    int num = console.nextInt();
    
    if(num < 0)
        return;
    
    int sum = 0;
    int count = 0;
    
    while(num >= 0) {
        sum += num;
        count++;
        System.out.print("Type a number: ");
        num = console.nextInt();
    }
    
    System.out.println("Average was " + ((double) sum / count));
}
