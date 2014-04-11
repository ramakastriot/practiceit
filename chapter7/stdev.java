/* Write a method called stdev that returns the standard deviation of an array 
 * of integers. Standard deviation is computed by taking the square root of 
 * the sum of the squares of the differences between each element and the mean,
 * divided by one less than the number of elements. You may assume that the 
 * array passed is non-null and contains at least two values, because the 
 * standard deviation is undefined otherwise.
 */
public double stdev(int[] a) {
    double avg = 0;
    double num = 0;
    
    for(int i = 0; i < a.length; i++) {
        avg += a[i];
    }
    
    avg /= a.length;
    
    for(int i = 0; i < a.length; i++) {
        num += (a[i] - avg) * (a[i] - avg);
    }
    
    return Math.sqrt(num / (a.length - 1));
}
