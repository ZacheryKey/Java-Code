
package bstlab;
/* 
Creates: A binary search tree for Strings. 

We are going to add a few new methods to the existing code that we downloaded. 
We will be adding methods to the BST class such as size() to return the total 
number of nodes in the BST; isEmpty() to return true or false depending on whether 
or not the binary search tree has any elements; makeEmpty() to delete ALL of the 
nodes in the BST, and Prune() to delete the entire subtree of a given node.

*/
public class BST {
    /** An node in a tree. */
    private class TreeNode<T> {
        private String datum;
        private TreeNode<T> left, right;

        /** Constructor: a node with value datum and empty left- and right subtrees. */
        public TreeNode(String datum) {
            this.datum= datum;
            left= null;
            right= null;
        }
        /* A "Contains" method for a subtree starting at the given treenode. */
        public boolean contains(String id){
            int comp = id.compareTo(datum);
            if(comp==0){return true;}
            if(comp<0 && left!=null && left.contains(id)){return true;}
            if(comp>0 && right!=null && right.contains(id)){return true;}
            return false;
            }
    }
    
    private TreeNode<String> root; // The root of the BST. null if empty
    public TreeNode<String> cursor;
            
    /** Constructor. An empty tree */
    public BST() {
        root= null;
    }

    /** Insert s into this tree. Nothing happens if s is already in the BST. */
    public void insert(String s) {
        root= insert(s, root);
    }
    /** Precondition: node is a possibly empty BST.
     * Add s to node (if it is not in the BST) and
     * return the root of the new BST. */
    private TreeNode<String> insert(String s, TreeNode<String> node) {
        if (node == null) return new TreeNode<String>(s);
        int compare;
        if (s == null && node.datum == null)
        	compare= 0;
        else if (s == null)
        	compare= -1;
        else if (node.datum == null)
        	compare= 1;
        else
        	compare= s.compareTo(node.datum);
        if (compare < 0) node.left= insert(s, node.left);
        else if (compare > 0) node.right= insert(s, node.right);
        return node;
    }
    
    
    /* Here you are going to return the size of the tree. This can be determined 
    so that each time you add a new item to the tree, the size variable is incremented
    by one. You can have a method for the */
    
    public int size(){
        return size(root);
        // When you call the size method with the parameter of a node, then the size 
        // method will be the one described below this method. This will then check to 
        // see if the node is null. If the node is null, then the size of the tree is 
        // zero. Otherwise, the second size method will add one for the root of the first 
        // subtree and the method will be called recursively for the size of the left and 
        // the right subtrees, continuing outward until you reach the leaves of the tree 
        // the next nodes are null. 
        }
    private int size(TreeNode<String> node){
        // start with the first node. if the first node is null then the size of
        // the tree is zero.
        if(node == null){return 0;}
        // if the first node is not zero, then you need to check the size of the left and 
        // right nodes underneath that until you arrive at a null node 
        else{
            int counter = 1+size(node.left)+size(node.right);
            // counter will be the size of the root (1 node) plus the size of the left and 
            // right subtrees to that node. counter will recursively add up all of the nodes
            // that the tree has on it to form a grand total 
            return counter;
            }
        }
    
    /* In order to make the tree empty, you can simply set the root element of the tree
    to be null and then all of the nodes will then be null too */
    public void makeEmpty(){
        root = null;
        System.out.println("You have pruned the entire tree. ");
        }
    
    public boolean inTree(String data){
        // Check to make sure that root is not null. If it is, terminate process
        if(root==null){return false;}
        // Else, check the tree for the data, starting at the root.
        else{return inTree(root,data);}
        }
    private boolean inTree(TreeNode node, String data){
    // If you find it in the current node, return true
    // If you cannot find it in any node, return false
    if(node==null){return false;}
    if(node.datum.equals(data)){return true;}
    //If not, check the subtree
    if(data.compareTo(node.datum)>0){return (inTree(node.right,data));}
    //If not, Check the other subtree
    else{return (inTree(node.left,data));}
    }
    
    
    public TreeNode<String> find(String datum){
        // Base Case: If the root is null then return null 
        if(root==null||this.inTree(datum)!=true){
            return null;
        // else search through the tree for the value you want, starting at the root
        }else{
            return find(root,datum);}
        }
    private TreeNode<String> find(TreeNode<String> node,String key){
        // Condition 1: If the current node is the node you are looking for, return it.
        if(key.compareTo(node.datum)==0){return node;}
        // Condition 2: If the current node contains a value greater (further in the alpahabet) 
        // than the value you are passing, then you need to check the left subtree. Else, check the 
        // right subtree. 
        else if(key.compareTo(node.datum)<0){return find(node.left,key);}
        else{return find(node.right,key);}
        }
    
    /*In order to prune part of the tree, you will have to input the root node of the part you 
    want to prune and set its childrens values equal to null*/
    public void prune(String data){
        TreeNode toDelete = this.find(data);
        if(this.find(data)!=null){
            toDelete.left=null;
            toDelete.right=null;}
        else{System.out.println("The node you are trying to prune is not on the tree.");}
        }
    
    /* Create a method to show whether the tree contains any nodes. */
    public boolean isEmpty(){
        boolean validity;
        if(root==null){validity=true;}
        else{validity=false;}
        return validity;
        }

    /** Print the contents of the BST in dictionary order.  */
    public void show() {
        show(root);
        System.out.println();
    }

    /** Print the contents of BST node in dictionary order, on one line. */
    private void show(TreeNode<String> node) {
        if (node == null) return;
        show(node.left);
        System.out.print(node.datum + " ");
        show(node.right);
    }
}


