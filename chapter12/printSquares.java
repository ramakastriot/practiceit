/* Write a method printSquares that uses recursive backtracking to find all 
 * ways to express an integer as a sum of squares of unique positive integers. 
 * Some numbers (such as 128 or 0) cannot be represented as a sum of squares, 
 * in which case your method should produce no output. Keep in mind that the 
 * sum has to be formed with unique integers.
 */
public void printSquares(int n) {
    List<Integer> list = new LinkedList<Integer>();
    printSquares(n, list, 1);
}

public void printSquares(int n, List<Integer> list, int i) {
    if(n < 0)
        return;
        
    if(n == 0) {
        printHelper(list);
        return;
    }
    
    if(i * i > n)
        return;
        
    list.add(i);
    printSquares(n - i * i, list, i + 1);
    list.remove(list.size() - 1);
    printSquares(n, list, i + 1);
}
