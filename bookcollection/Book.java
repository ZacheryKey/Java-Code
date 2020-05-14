package bookcollection;
/**
 * Provides the data fields to be used in the program Book collection.
 * Because this class is going to be used in the BookList linkedList it 
 needs to include all of the data to be stored in the nodes as well as 
 the reference to the nextBook node. 
 * @author Zachery Key
 */

public class Book {
    int booknumber = 0;
    String title = null;
    String author = null;
    Book nextBook = null;
    /* This datafield (nextBook) is necessary to include in any class that is going to be 
    used as a node in a LinkedList. */
    public void new_book(int booknumber,String author,String title){
        this.booknumber = booknumber;
        this.author = author;
        this.title = title;
        }
    // override to string to print the data contents and not just the 
    // memory address.
    @Override
    public String toString(){
        return title+" "+author+" "+booknumber;
        }
}
