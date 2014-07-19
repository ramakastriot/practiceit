/* Write a method named evenNumbers that accepts a Scanner as a parameter 
 * reading input from a file containing a series of integers, and report 
 * various statistics about the integers. You may assume that there is at 
 * least one integer in the file. Report the total number of numbers, the sum 
 * of the numbers, the count of even numbers and the percent of even numbers.
 */
public void evenNumbers(Scanner sc) {
    int count = 0;
    int evenCount = 0;
    int sum = 0;
    
    while(sc.hasNext()) {
        int num = sc.nextInt();
        count++;
        sum += num;
        
        if(num % 2 == 0)
            evenCount++;
    }
    
    double percent = (double)(evenCount * 100) / count;
    System.out.println(count + " numbers, sum = " + sum);
    System.out.println(evenCount + " evens (" + String.format("%.2f", percent) + "%)");
}
