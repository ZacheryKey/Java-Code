package setslab;
import java.util.HashSet;
/**
 *Must include a method to introduce the card into the collection of blocked
 * cards as well as a method to check if a card if Blocked or not (whether or not
 * a certain card exists in the set of blocked cards). This class, payment gateway 
 * will implement a hash set of blocked cards. This class Payment Gateway should exist
 * extend the java data structure hash set. In order for any of the functions to work 
 * with your hash set, you must define a hash code in the class you are going to include 
 * in your hash set. 
 * @author Zachery Key
 */
public class Payment_Gateway{
    HashSet<Card> BlockedCards;
    
    //Create a constructor to create a new collection of Blocked Cards 
    Payment_Gateway(){
        BlockedCards = new HashSet();}
    
    // Create a method to block the card if it is part of the blocked card set.
    public void block_card(Card c){
        BlockedCards.add(c);}
    
    // Create a method to see if the card is in the blockedcards hashset
    public boolean check_card(Card c){
        boolean truther = BlockedCards.contains(c);
        if(truther==true){System.out.println("The card "+c+" has been blocked.");}
            else{System.out.println("The card "+c+" has not been blocked.");}
        return truther;}
}
