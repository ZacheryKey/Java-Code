package bookcollection;
import java.util.*;
/**
 * This is where the magic happens. All of your user interface with the system 
 * will run in the main method. Program will display one book at a time (printing  
 * all attributes on the screen). You should have commands for displaying the next 
 * book (entering “1”), displaying the previous book (entering “2”), adding 
 * a new book (“3”), removing the displayed book (“4”) or exit (“5”). When adding 
 * a new book, the user enters the data. After removing a book, the next book is 
 * displayed.
 * 
 * @author Zachery Key
 * date: 11/1/2019
 */

public class BookCollection {
    public static void main(String[] args) {
        //Create the linkedlist you will be using in this program 
        MyLinkedList list;
        list = new MyLinkedList();
        
        //Start by offering the menu options to the program user 
        System.out.println("Welcome to the BookCollection Program. ");
        System.out.println();
        System.out.println("Enter 1 to see the next title.");
        System.out.println("Enter 2 to see the previous title.");
        System.out.println("Enter 3 to add a new book to the system."); 
        System.out.println("Enter 4 to remove the displayed book.");
        System.out.println("Enter 5 to exit the program.");
        System.out.println();
        
        // Create the scanner object to allow user input 
        Scanner scan = new Scanner(System.in);
        
        // Declare the variable index outside the while loop to avoid being 
        // overwritten each time. This variable will allow you to access books
        // using your linkedlists methods get.
        int index = 0;
        // Create the initial codition for the switch to the while loop
        Boolean on = true;
        //Setup the while loop to continously register user feedback. This will
        //end the program when the user enters the number 5 and keep it running 
        //for all other inputs. It should display a warning if the user does not 
        //enter a valid command.
        
            while(on){
                //Create user input scanner. 
                System.out.println();
                System.out.println();
                System.out.println("Awaiting user input... ");
                if(scan.hasNextInt()){int user_input = scan.nextInt();
                // Set up an if else to ensure that you are recieving valid user input numbers.
                // Set up a switch to turn off the while loop and exit the program.
                if(user_input == 5){on=false;}
                else if(user_input>5 || user_input<0){System.out.println("Not a valid command");}
                // If all conditions are met for valid user input, allow the user to access the menu.
                //else{
                    //initialize the current book object
                    Book Current_book = list.get(index);
                    //display current book in queue
                    if(Current_book == null){System.out.println("There is currently no book in your queue. ");}
                    else{System.out.println("The current book in your queue is "+Current_book+".");}
                    //System.out.println();
                    //Set up the user cases for different user inputs. These include going 
                    //to the next book, going to the previous book and adding/deleting 
                    //books in the Linkedlist.
                    switch(user_input){
                       
                        case 1: //go to next book
                            if(index+1==list.size||list.size<=1){System.out.println("You cannot advance any further.");}
                            else{index=index+1;}
                            
                            break;
                        case 2: //go to previous book
                            if(index==0){System.out.println("You cannot regress any further.");}
                            else{index=index-1;}
                            
                            break;
                        case 3: //allow user to add new book
                            System.out.println("Enter the booknumber: ");
                                // make sure input is an integer to avoid throwing exceptions
                                while(scan.hasNextInt()==false){
                                    scan.next();
                                    System.out.println("Invalid user input. Try again.");}
                                int booknumber = scan.nextInt();
                                scan.nextLine();
                            System.out.println("Enter the title of the book: ");
                                String title = scan.nextLine();
                            System.out.println("Enter the Author's Name: ");
                                String author = scan.nextLine();
                            list.add(booknumber,author,title);
                                System.out.print("The Book "+title+" has been added to the system.");
                            break;
                        case 4: //remove displayed (in queue) book from list
                            Book deleted_book = list.get(index);
                            Book a = list.delete(index);
                            System.out.println("You just deleted "+deleted_book+".");
                        //}
                scan.next();}
            }else{scan.next(); System.out.println("Not a valid command.");}
                //Avoid throwing exceptions if the user input is not a integer.
        }
    }
}
