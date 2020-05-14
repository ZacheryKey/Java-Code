package setslab;
/**
 * Create the class Card and define equals and hash code method so that you 
 * can use these in your hash set. 
 * @author Zachery Key
 */
public class Card {
    // list the datafields for the class card
    int cardnumber;
    String CardHolder_name;
        // Create Constructor method to create a new Card for this Class. This 
        // will make it easier for you to construct an object of the class card
        // because it will allow you to go ahead and set the values of the datafields
        // so you don't have to do it manually by using the .field
        Card(int c_num,String c_name){
            CardHolder_name =  c_name;
            cardnumber = c_num;
            }
        //Compare two objects to see if they both have the same cardnumber, the
        // same Cardholder name and are of the same class, Card. If so, return 
        // true. Else, return false. 
        @Override 
        public boolean equals(Object o){
            boolean valid = true;
            if(o instanceof Card){
                Card c = (Card)o;
                if(this.cardnumber == c.cardnumber && this.CardHolder_name.equals(c.CardHolder_name)){valid = true;}
                }
            else{valid = false;}
            return valid;    
            }
        
       // Create a fingerprint ID for all of the objects that you are adding to the hashset
        @Override 
        public int hashCode(){
            int hash = 57*cardnumber*CardHolder_name.hashCode();
            return hash;}
        
        @Override 
        public String toString(){
            return cardnumber+" "+CardHolder_name;}
}
