import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

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
    /** Number represented by integers 1-13:
    1 = Ace
    2 = 2
    ...
    13 = King **/
    private int number;

    private Image cardImage;

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
        try {
            String suitStr = "";
            String numStr = "";
            String suitOptions = "hsdc";
            // Convert suit and number into file address
            // Convert suit:
            suitStr = suitOptions.substring(suit-1, suit);
            // Convert num:
            if (number >= 2 && number <= 10){
                numStr = number + "";
            }
            if (number == 1)
                numStr = "a";
            if (number == 11)
                numStr = "j";
            if (number == 12)
                numStr = "q";
            if (number == 13)
                numStr = "k";

            // TODO if statement here decide up or down (probably add an Image as a parameter)
            cardImage = ImageIO.read(new File("images/cards/dj.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }

}
