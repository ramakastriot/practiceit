/* Write a method printLeaves that outputs the leaves of a binary tree from 
 * right to left. More specifically, the leaves should be printed in the 
 * reverse order that they would be printed using any of the standard 
 * traversals. If the tree does not have any leaves (an empty tree), simply 
 * print: no leaves
 */
public void printLeaves() {
    if(overallRoot == null)
        System.out.println("no leaves");
    else
        System.out.print("leaves: ");
        
    printLeaves(overallRoot);
}

private void printLeaves(IntTreeNode node) {
    if(node == null)
        return;
        
    if(node.left == null && node.right == null) {
        System.out.print(node.data + " ");
        return;
    }
    
    printLeaves(node.right);
    printLeaves(node.left);
}
