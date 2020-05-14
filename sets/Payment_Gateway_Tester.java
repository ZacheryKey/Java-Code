package setslab;
/**
 * The purpose of this program is to see if the card is blocked or not. 
 * If the user reports their cards stolen then the cards should be added to 
 * the blocked_cards hash set. 
 * @author Zachery Key
 */

public class Payment_Gateway_Tester {
    public static void main(String[] args) {
        //Create a new object of the class Payment gateway
        Payment_Gateway p = new Payment_Gateway();
        //Create some cards. 
        Card n1 = new Card(123,"Zachery");
        Card n2 = new Card(1232,"Daniella");
        Card n3 = new Card(124,"Nathan");
        Card n4 = new Card(12,"Tyler");
        Card n5 = new Card(123,"Zachery");
        
        // You are going to check and see if the card is in the blocked list. This 
        // should return false because and say that it has not been blocked because
        // you haven't yet implemented the method to block the card. 
        System.out.print(p.check_card(n1));
        System.out.println();
        
        // Add a card to the blocked hash set. 
        p.block_card(n1);
        
        // Now check the card to make sure it has been blocked. 
        System.out.print(p.check_card(n1));
        System.out.println();
        
        //If you have blocked a card with the same exact data fields as 
        //another card, they shuld both be blocked EVEN though you have not 
        //directly blocked that card.  
        System.out.print(p.check_card(n5));
        
    }
}
