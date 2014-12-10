/* Write a method isPairwiseSorted that returns whether or not a list of 
 * integers is pairwise sorted (true if it is, false otherwise). A list is 
 * considered pairwise sorted if each successive pair of numbers is in sorted 
 * (non-decreasing) order. If a list is so short that it has no pairs, then it 
 * is considered to be pairwise sorted. If a list is of odd length, the final 
 * element should be ignored since it has no pair.
 */
public boolean isPairwiseSorted() {
    for(int i = 0; i <= size - 2; i+=2) {
        if(elementData[i] > elementData[i+1])
            return false;
    }

    return true;
}
