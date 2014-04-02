/* Write a method that returns a list containing the sequence of values 
 * obtained from an in-order traversal of your binary tree of integers. If the 
 * tree is empty, your method should return an empty list. Your method should 
 * not change the structure or contents of the tree.
 */
public List<Integer> inOrderList() {
    List<Integer> list = new LinkedList<Integer>();
    inOrderList(overallRoot, list);
    return list;
}

private void inOrderList(IntTreeNode node, List<Integer> list) {
    if(node == null)
        return;
        
    inOrderList(node.left, list);
    list.add(node.data);
    inOrderList(node.right, list);
}
