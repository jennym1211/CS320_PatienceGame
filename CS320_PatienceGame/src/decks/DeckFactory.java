package decks;

public class DeckFactory {


   

 public PokerDeck getDeck(String deckType){
    if(deckType == null){
       return null;
    }		
 // if(deckType.equalsIgnoreCase("AuthorsDeck")){
   //    return new AuthorDeck();}
       
     else if(deckType.equalsIgnoreCase("PokerDeck")){
       return new PokerDeck();
       
    }
     
    return null;
 }
 
 
 
}