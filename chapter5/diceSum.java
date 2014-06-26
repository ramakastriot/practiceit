/* Write a method named diceSum that prompts the user for a desired sum, then 
 * repeatedly rolls two six-sided dice until their sum is the desired sum.
 */
public void diceSum() {
    Scanner in = new Scanner(System.in);
    System.out.print("Desired dice sum: ");
    int sum = in.nextInt();
    Random r1 = new Random();
    Random r2 = new Random();
    int d1;
    int d2;
    
    do {
        d1 = 1 + r1.nextInt(6);
        d2 = 1 + r2.nextInt(6);
        System.out.println(d1 + " and " + d2 + " = " + (d1 + d2));
    } while(d1 + d2 != sum);
}
