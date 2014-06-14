/* Write an instance method named transactionFee that will be placed inside 
 * the BankAccount class to become a part of each BankAccount object's 
 * behavior. The transactionFee method accepts a fee amount (a real number) as 
 * a parameter, and applies that fee to the user's past transactions. The fee 
 * is applied once for the first transaction, twice for the second 
 * transaction, three times for the third, and so on. These fees are subtracted
 * out from the user's overall balance. If the user's balance is large enough 
 * to afford all of the fees with greater than $0.00 remaining, the method 
 * returns true. If the balance cannot afford all of the fees or has no money 
 * left, the balance is left as 0.0 and the method returns false.
 */
public boolean transactionFee(double fee) {
    double amount = (fee * transactions * (transactions + 1)) / 2;
    
    if(balance > amount) {
        balance -= amount;
        return true;
    }
    
    balance = 0;
    return false;
}
