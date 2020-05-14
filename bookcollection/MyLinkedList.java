package bookcollection;
/**
 * This Part of the Program exists to define the MyLinkedList you will be maintaining 
 in your program. It includes all of the functionality of a MyLinkedList by 
 implementing add, delete, get and show methods. You will use each of these when 
 implementing the main method in the body of the program. 
 * @author Zachery Key
 */
public class MyLinkedList{
    Book head;
    Book tail;
    int size = 0;
    public void add(int booknumber,String author,String title){
        // Scenario 1: Empty Linked List. You will insert the first nodeBeforeNodetoDelete which 
        // will be both the head and the tail
        Book book1 = new Book();
        book1.author = author;
        book1.title = title;
        book1.booknumber = booknumber;
        
        if(tail==null){
            tail=book1;
            head=book1;}
        // Scenario 2: Non-Empty Linked List. add Node(10)[Node(23) ->  Node(3) ]
        //                                     [Node(23) -> Node(3) ->  Node(10)]
        else{
        tail.nextBook = book1;
        //this will append a Book to the end of the list where the tail is
        tail = book1;}
        // this will set the tail to the new inserted book position}
        size++;
    }
    public Book get(int index){
        assert(index >= 0);
        // This will make sure that you have no errors by setting any indexes below
        // zero equal to 0. 
        Book current = head;
        // Establish a first value to run through. This will give your while loop
        // an initial position to start at. 
        if(index==0){return head;}
        // If the index is equal to zero, return the head value.
        if(size<index){return null;}
        else{
        while(index > 0){
            current = current.nextBook;
            index--;
            // Start at the head value. For each time through the while loop, 
            // update the current position to be the next in the linkedlist. 
            // once you reach the position you want, exit the while loop, 
            // returning the value you ended on. For each iteration, the index 
            // decreases by one, thus effectively shutting off the while loop 
            // when the index updates to zero.
            }
        return current;
        }
    }
    public void ShowAll(){
        Book current = head;
        if(size==0){System.out.println("No Books in Collection! ");}
        else{
        while(current.nextBook!=null){
            System.out.println(current.author+" "+current.title+" "+current.booknumber);
            current = current.nextBook;
            }
        System.out.print(current.author+" "+current.title+" "+current.booknumber);
        }
    }
    public Book delete(int index){
        if(index+1>size){return null;}
        if(size==0){
            return null;}
        if(size==1){
            head = null;
            tail = null;
            size--;
            return null;
            }
        
        Book nodeBeforeNodetoDelete;
        nodeBeforeNodetoDelete = getPreviousBook(index);
        Book deleting = get(index);
        //Case where we need to delete the head
        if(nodeBeforeNodetoDelete==null){
            head = head.nextBook;
            }
        else{
            // Case where we need to delete the tail
            if(tail==deleting){
                nodeBeforeNodetoDelete.nextBook = null;
                tail = nodeBeforeNodetoDelete;
                }
            //Case where we want to delete a node between two others
            else{
                nodeBeforeNodetoDelete.nextBook = deleting.nextBook;
                }
            size--;
            }
        return null;
    }
    // if this method returns an empty book, it means that the element we want
    // to delete is at the head of the linked list. If it returns null, it means 
    // the index is out of bounds. If it returns a book, the index is in 
    // bounds and all is well.
    public Book getPreviousBook(int index){ 
        if(index>size||index<0){return null;}
        else if(index==0){
            return new Book();}
        else{
        index = index-1;
        return this.get(index);}
    }
}
    
    
