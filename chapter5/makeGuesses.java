/* Write a method named makeGuesses that will guess numbers between 1 and 50 
 * inclusive until it makes a guess of at least 48. It should report each 
 * guess and at the end should report the total number of guesses made.
 */
public void makeGuesses() {
    int count = 0;
    Random r = new Random();
    int guess;
    
    do {
        guess = 1 + r.nextInt(50);
        count++;
        System.out.println("guess = " + guess);
    } while(guess < 48);
    
    System.out.println("total guesses = " + count);
}
