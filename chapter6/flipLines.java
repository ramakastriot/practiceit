/* Write a method named flipLines that accepts as its parameter a Scanner for 
 * an input file and that writes to the console the same file's contents with 
 * successive pairs of lines reversed in order.
 */
public void flipLines(Scanner sc) {
    while(sc.hasNextLine()) {
        String temp = sc.nextLine();
        
        if(!sc.hasNextLine()) {
            System.out.println(temp);
            break;
        }
        
        System.out.println(sc.nextLine());
        System.out.println(temp);
    }
}
