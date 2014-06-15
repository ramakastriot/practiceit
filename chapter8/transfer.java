/* Write an instance method named transfer that will be placed inside the 
 * BankAccount class to become a part of each BankAccount object's behavior. 
 * The transfer method moves money from this bank account to another account. 
 * The method accepts two parameters: a second BankAccount to accept the money,
 * and a real number for the amount of money to transfer.
 *
 * There is a $5.00 fee for transferring money, so this much must be deducted 
 * from the current account's balance before any transfer.
 *
 * The method should modify the two BankAccount objects such that "this" 
 * current object has its balance decreased by the given amount plus the $5
 * fee, and the other BankAccount object's balance is increased by the given 
 * amount. A transfer also counts as a transaction on both accounts.
 *
 * If this account object does not have enough money to make the full transfer,
 * transfer whatever money is left after the $5 fee is deducted. If this
 * account has under $5 or the amount is 0 or less, no transfer should occur 
 * and neither account's state should be modified.
 */
public void transfer(BankAccount ba, double money) {
    if(balance < 5 || money <= 0)
        return;
    
    if(balance < 5 + money) {
        ba.deposit(balance - 5);
        this.withdraw(balance);
    } else {
        ba.deposit(money);
        this.withdraw(5 + money);
    }
}
