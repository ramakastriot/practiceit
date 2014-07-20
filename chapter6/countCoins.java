/* Write a method named countCoins that accepts as its parameter a Scanner for 
 * an input file whose data represents a person's money grouped into stacks of 
 * coins. Your method should add up the cash values of all the coins and print 
 * the total money at the end. The input consists of a series of pairs of 
 * tokens, where each pair begins with an integer and is followed by the type 
 * of coin, which will be either "pennies" (1 cent each), "nickels" (5 cents 
 * each), "dimes" (10 cents each), or "quarters" (25 cents each), 
 * case-insensitively. A given coin might appear more than once on the same 
 * line.
 */
public void countCoins(Scanner sc) {
    double totalCents = 0;
    
    while(sc.hasNext()) {
        int amount = sc.nextInt();
        String type = sc.next().toLowerCase();
        
        if(type.equals("pennies")) {
            totalCents += amount;
        } else if(type.equals("nickels")) {
            totalCents += 5 * amount;
        } else if(type.equals("dimes")) {
            totalCents += 10 * amount;
        } else if(type.equals("quarters")) {
            totalCents += 25 * amount;
        }
    }
    
    System.out.println("Total money: $" + 
        String.format("%.2f", totalCents / 100));
}
