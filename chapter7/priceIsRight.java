/* Write a method priceIsRight that accepts an array of integers bids and an 
 * integer price as parameters. The method returns the element in the bids 
 * array that is closest in value to price without being larger than price. If 
 * all bids are larger than price, then your method should return -1. You may 
 * assume there is at least 1 element in the array, and you may assume that 
 * the price and the values in bids will all be greater than or equal to 1. Do 
 * not modify the contents of the array passed to your method as a parameter.
 */
public int priceIsRight(int[] bids, int price) {
    int bid = -1;
    
    for(int i = 0; i < bids.length; i++) {
        if(price - bids[i] >= 0 && bids[i] > bid)
            bid = bids[i];
    }
    
    return bid;
}
