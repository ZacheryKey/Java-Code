package phonebook;
import java.util.*;
import java.io.*;
import java.util.Map;
/**
 * Practice with HashMaps to help you understand why 
 * Display text-based menu for user to interact with the system. 
 * @author Zachery Key
 */
public class PhoneBookTester {
    public static void main(String[] args) {
        // Create new Hash Map 
        PhoneBook p1 = new PhoneBook();
        // Import scanner for user input 
        Scanner scan_me = new Scanner(System.in);
        // Set the switch for the while loop to stop
        boolean on = true;
        // Set up the text interface for the user to see 
        System.out.println("Welcome to the PhoneBook Program.");
        System.out.println("Enter 1 to add a contact. ");
        System.out.println("Enter 2 to search for a contact. ");
        System.out.println("Enter 3 to change or delete an entry. ");
        System.out.println("Enter 4 to list all of the contacts. ");
        System.out.println("Enter 5 to close the program. ");
        // Begin while loop to run the program
        while(on){
            System.out.println();
            System.out.println("Awaiting user input... ");
            if(scan_me.hasNextInt()){int user_input = scan_me.nextInt();
            //Switch cases for the different user options
            switch(user_input){
                case 1:
                    // Add a Contact to the List 
                    System.out.println("Enter the contact number. ");
                        int number = scan_me.nextInt();
                        scan_me.nextLine();
                    System.out.println("Enter the contact name. ");
                        String namer = scan_me.nextLine();
                        //scan_me.next();
                    //Create new Contact 
                        Contact newContact = new Contact(number,namer);
                    //Add new contact to phonebook
                        String key = newContact.Name;
                        p1.put(key, number);
                    //Show the user what they have done
                        System.out.println("You have added "+namer+" to the Phonebook. Their number is "+number+".");    
                    break;
                case 2:
                    // Search for a number by the persons name
                    scan_me.nextLine();
                    System.out.println("Enter persons name to be searched for: ");
                    String Name_boi = scan_me.nextLine();
                    System.out.print(Name_boi+"'s number is "+p1.getByName(Name_boi));
                    System.out.println();
                    break;
                case 3:
                    // Change or delete a directory entry 
                    scan_me.nextLine();
                    // Allow user to choose to change number or delete contact.
                    System.out.println("Enter C to change a number or D to delete a contact: ");
                    String choice = scan_me.next();
                    if(choice.equals("C")||choice.equals("c")){
                        scan_me.nextLine();
                        System.out.println("Enter persons name to be updated: ");
                        String old_name = scan_me.nextLine();
                        System.out.println("Enter new number: ");
                        int new_num = scan_me.nextInt();
                        p1.replace(old_name,new_num);
                        System.out.println(old_name+"'s number has been changed to "+new_num+".");
                        }
                    else if(choice.equals("D")||choice.equals("d")){
                        scan_me.nextLine();
                        System.out.println("Enter persons name to be deleted: ");
                        String deleted_name = scan_me.nextLine();
                        String namest = deleted_name;
                        p1.remove(deleted_name);
                        System.out.print("You have removed the contact "+namest+".");
                        System.out.println();
                        }
                    break;
                case 4:
                    // List all contacts 
                    Iterator it = p1.entrySet().iterator();
                    // create an iterator to move through your mappings
                    System.out.println("All of the Phonebook contacts are as follows: ");
                    while(it.hasNext()){
                        Map.Entry pair = (Map.Entry)it.next();
                        // define the key and value for each iteration advancement
                        System.out.println(pair.getKey() + " = " + pair.getValue());
                        // print out the key and value for each value in the hashmap
                        }
                    break;
                case 5:
                    // Close the program 
                    on = false;
                    break;
                }
            }
        }
    }
}
