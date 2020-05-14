package phonebook;

/**
 * Create a public class Contact that will be placed in a HashMap 
 * Contact book. Include the standard functionality of constructor,
 * equals, get and set number, equals and hash code for the construction
 * of the hash map. This Class will 
 * @author Zachery Key
 */

public class Contact {
    public int phoneNumber;
    public String Name;
    
    Contact(int num,String Name){
        this.phoneNumber = num;
        this.Name = Name;}
    
    public int getNumber(){
        return phoneNumber;}
    public String getName(){
        return Name;}
    
    @Override //Overide built in equals method for object
    public boolean equals(Object o){
        boolean validity = false; 
        if(o instanceof Contact){validity = true;}
        return validity;
        }
    
    @Override //Overide hashcode method for  
    public int hashCode(){
        return 12/phoneNumber+2;
        }
}
