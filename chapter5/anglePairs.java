/* Write a static method named anglePairs that accepts three angles (integers),
 * measured in degrees, as parameters and returns whether or not there exists 
 * both complementary and supplementary angles amongst the three angles passed.
 * Two angles are complementary if their sum is exactly 90 degrees; two angles
 * are supplementary if their sum is exactly 180 degrees. Therefore, the method
 * should return true if any two of the three angles add up to 90 degrees and 
 * also any two of the three angles add up to 180 degrees; otherwise the method
 * should return false. You may assume that each angle passed is non-negative.
 */
public boolean anglePairs(int a, int b, int c) {
    boolean complementary = a + b == 90 || a + c == 90 || b + c == 90;
    boolean supplementary = a + b == 180 || a + c == 180 || b + c == 180;
    return complementary && supplementary;
}
