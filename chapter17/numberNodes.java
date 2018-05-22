/* Write a method numberNodes that changes the data stored in a binary tree, 
 * assigning sequential integers starting with 1 to each node so that a 
 * pre-order traversal will produce the numbers in order(1, 2, 3, etc.). You 
 * are not to change the structure of the tree. You are simply changing the 
 * values stored in the data fields. Your method should return a count of how 
 * many nodes were in the tree.
 */
int numberNodes(){
    return numberNodes(overallRoot, 1) - 1;
}
int numberNodes(IntTreeNode root, int number){
    if(root == null) return number;
    root.data = number;
    return numberNodes(root.right, numberNodes(root.left, number + 1));
}
