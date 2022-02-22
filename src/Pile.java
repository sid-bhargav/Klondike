import java.util.ArrayList;

/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
public abstract class Pile implements Drawable, Updateable {
    
    public abstract boolean canAddCard(Card c);
    private ArrayList<Card> cards = new ArrayList<>();

    // Location of pile from top left
    private int x;
    private int y;

    public int getSize(){
        return cards.size();
    }

    //utility
    public Card getCard(int index){
        if(index>-1 && index <cards.size()){
            return cards.get(index);
        }
        return null;
        }

    //Checks to see if a pile can be appended to another pile.
    //Pile one is the original pile;
    //Pile two is the pile to be added.
    //This method only works for adding to the Ace Piles.
    public boolean checkAddable(Pile one, Pile two){
        Card cardOne = one.getCard(one.getSize()-1);
        Card cardTwo = two.getCard(two.getSize()-1);
        if (cardOne.getNumber()-cardTwo.getNumber()==-1){
            if (cardOne.getSuit()-cardTwo.getSuit()==-1 || cardOne.getSuit()-cardTwo.getSuit()==1){
                return true;
            }
        }
    return false;
    }


    //This method has no check for inserting a list of cards to a pile; implement a check 
    //method elsewhere
    //It takes an input list and adds it to an existing pile
    public void insertCards(ArrayList<Card> toInsert){
        for (int i=0; i<toInsert.size(); i++){
            cards.add(toInsert.get(i));
        }
    }
    
    //Removes part of a pile cards according to an index, and returns that list
    //somebody check to see if it functions as intended
    public ArrayList<Card> removeCard(int index){
        ArrayList<Card> toRemove = new ArrayList<>();
        for (int i=index; i<cards.size(); i++){
            toRemove.add(cards.get(i));//copies the cards from the index to the end to the list to be returned
        }
        for (int i=index; i<cards.size(); i++){
            cards.remove(index);//removes the cards from the index to the end
        }
        return toRemove;
    }
    
}
