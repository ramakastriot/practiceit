/* Write a method countCommon that takes two Lists of integers as parameters 
 * and returns the number of unique integers that occur in both lists. Use one 
 * or more Sets as storage to help you solve this problem.
 */
public int countCommon(List<Integer> list1, List<Integer> list2) {
    HashSet<Integer> set1 = new HashSet<Integer>(list1);
    HashSet<Integer> set2 = new HashSet<Integer>(list2);
    int count = 0;

    for(int n : set2) {
        if(set1.contains(n))
            count++;
    }

    return count;
}
