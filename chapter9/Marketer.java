/* Write the class Marketer to accompany the other law firm classes described 
 * in this chapter. Marketers make $50,000 ($10,000 more than general 
 * employees) and have an additional method called advertise that prints "Act 
 * now, while supplies last!" Make sure to interact with the Employee 
 * superclass as appropriate.
 */
public class Marketer extends Employee {
    public void advertise() {
        System.out.println("Act now, while supplies last!");
    }
    
    public double getSalary() {
        return super.getSalary() + 10000.0;
    }
}
