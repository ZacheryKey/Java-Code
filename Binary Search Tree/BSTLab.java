package bstlab;

/**
 * This is where we are going to create the BST and implement your new methods.
 * @author Zachery Key
 */
public class BSTLab {
    public static void main(String[] args) {
        // We are going to create a new binary search tree object 
        BST BS_tree = new BST();
        // Lets try and insert some elements into our BST 
        BS_tree.insert("Alpha");
        BS_tree.insert("Hello");
        BS_tree.insert("Zeta");
        BS_tree.insert("Goodbye");
        // Now display the inserted string in the output window 
        // This wil allow you to see that the elements have all been added to
        // the tree in the correct alphabetic order 
        BS_tree.show();
        // Now I want you to print out the size of the tree (or the number of nodes)
        System.out.println(BS_tree.size());
        System.out.println();
        // Now I want you to test out the IsEmpty method that you have created
        System.out.println(BS_tree.isEmpty());
        // Now you should clear out the tree and show the resulting empty tree
        BS_tree.makeEmpty();
        BS_tree.insert("Alpha");
        BS_tree.show();
        System.out.println(BS_tree.size());
        // Ok now we are going to fill our tree with a lot of elements and then clip 
        // off a section of the tree so that it is no longer accesible.
        BS_tree.insert("Beta");
        BS_tree.insert("Delta");
        BS_tree.insert("Epsilion");
        BS_tree.insert("Gamma");
        BS_tree.insert("Kappa");
        BS_tree.insert("Lambda");
        BS_tree.insert("Mu");
        BS_tree.insert("Omega");
        BS_tree.insert("Phi");
        BS_tree.insert("Sigma");
        BS_tree.insert("Theta");
        BS_tree.insert("Zed");
        BS_tree.show(); 
        System.out.println(BS_tree.find("Thta"));
        System.out.println(BS_tree.find("Zed"));
        System.out.println(BS_tree.find("Epsilion"));
        System.out.println();
        System.out.println(BS_tree.inTree("Pi"));
        BS_tree.prune("Oma");
        BS_tree.show();
    }
}
