/* Write a method called getGrade that accepts an integer representing a 
 * student's grade in a course and returns that student's numerical course 
 * grade. The grade can be between 0.0 (failing) and 4.0 (perfect). Assume 
 * that scores are in the range of 0 to 100. For an added challenge, make your 
 * method throw an IllegalArgumentException if the user passes a grade lower 
 * than 0 or higher than 100.
 */
public double getGrade(int score) {
    if(score < 0 || score > 100)
        throw new IllegalArgumentException();
        
    double grade;
    
    if(score < 60) {
        grade = 0.0;
    } else if(60 <= score && score <= 62) {
        grade = 0.7;
    } else if(63 <= score && score <= 94) {
        grade = 0.8 + (score - 63) * 0.1;
    } else {
        grade = 4.0;
    }
    
    return grade;
}
