package phonebook;
import java.util.*;
/**
 * Create a class that extends hash map with one added method to get a value 
 * by a key. Make sure that you include a scenario in which their is no key that
 * matches the users input as parameters. This will avoid program crashing. 
 * @author Zachery Key
 */
public class PhoneBook extends HashMap{
    public int getByName(String Name){
        int findings;
        if(this.containsKey(Name)){
            findings = (Integer)this.get(Name);}
        else{findings = 0;}
        return findings;
    }
}
