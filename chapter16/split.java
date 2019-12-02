/* Write a method split that rearranges the elements of a list so that all of 
 * the negative values appear before all of the non-negatives.
 */
public void split() {
    ListNode curr = front;
    while (curr != null && curr.next != null) {
        if (curr.next.data < 0) {
            ListNode temp = curr.next.next;
            ListNode neg = curr.next;
            neg.next = front;
            front = neg;
            curr.next = temp;
        }
        else {
            curr = curr.next;
        }
    }
}
