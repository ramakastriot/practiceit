/* Write a method called quadratic that solves quadratic equations and prints 
 * their roots. Your method should accept the coefficients a, b, and c as 
 * parameters and should print the roots of the equation. You may assume that 
 * the equation has two real roots, though mathematically this is not always 
 * the case. Also, there should be two roots, one the result of the addition, 
 * the other, the result of the subtraction. Print the root resulting from the 
 * addition first.
 */
public void quadratic(int a, int b, int c) {
    double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    System.out.println("First root = " + r1);
    System.out.println("Second root = " + r2);
}
