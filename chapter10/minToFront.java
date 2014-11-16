/* Write a method minToFront that takes an ArrayList of integers as a 
 * parameter and that moves the minimum value in the list to the front, 
 * otherwise preserving the order of the elements. You may assume that the 
 * list stores at least one value.
 */

public void minToFront(ArrayList<Integer> arr) {
    int min = Integer.MAX_VALUE;
    int pos = -1;
    
    for(int i = 0; i < arr.size(); i++) {
        if(arr.get(i) < min) {
            min = arr.get(i);
            pos = i;
        }
    }
    
    arr.remove(pos);
    arr.add(0, min);
}
