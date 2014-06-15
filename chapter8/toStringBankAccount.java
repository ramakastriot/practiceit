/* Add the following method to the BankAccount class:
 *
 * public String toString()
 *
 * Your method should return a string that contains the account's name and 
 * balance separated by a comma and space. For example, if an account object 
 * named benben has the name "Benson" and a balance of 17.25, the call of 
 * benben.toString() should return:
 *
 * Benson, $17.25
 */
public String toString() {
    String sign = "";
    String pad = "";
    
    if(balance < 0) {
        balance = -balance;
        sign = "-";
    }
    
    int temp = (int) (balance * 100);
    int intPart = temp / 100;
    int decPart = temp % 100;
    
    if(decPart < 10)
        pad = "0";
    
    return name + ", " + sign + "$" + intPart + "." + pad + decPart;
}
