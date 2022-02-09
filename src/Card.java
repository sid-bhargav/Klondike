import java.awt.Graphics;
import java.awt.event.ActionEvent;

/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{

    // Card location coordinates
    private int x;
    private int y;

    /** Suit represented by integers 1-4:
    1 = Hearts
    2 = Spades
    3 = Diamonds
    4 = Clubs **/
    private int suit;
    private int number; 

    public Card(int suit, int num){
        this.suit = suit;
        this.number = num;
    }

    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
    }

}
