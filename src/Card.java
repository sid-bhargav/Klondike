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

    private int x; // Card location coordinates
    private int y; // TEMPORARILY FORCING LOCATION TO BE LOCKED SOMEWHERE, CHANGE THIS
    private int suit;   /** Suit represented by integers 1-4:
                     1 = Hearts
                     2 = Spades
                     3 = Diamonds
                     4 = Clubs **/
    private int number; /** Number represented by integers 1-13:
    1 = Ace; 2 = 2;... 13 = King **/
    
    private Image cardImage;
    private Image backImage;
    private boolean showingBack;


    public Card(int suit, int num){
        this.suit = suit;
        this.number = num;

        // load front card
        try {
            String address = "images/cards/" + this.toString() + ".png";
            // TODO an if statement to decide showing or not
            cardImage = ImageIO.read(new File(address));
        }
        catch (IOException e) {
            System.out.println("Can't find your card's front, cringe.");
            e.printStackTrace();
        }

        // load back card
        try {
            String address = "images/cards/b1fv.png";
            // TODO an if statement to decide showing or not
            backImage = ImageIO.read(new File(address));
        }
        catch (IOException e) {
            System.out.println("Can't find your card's back, cringe.");
            e.printStackTrace();
        }
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
    }

    @Override
    public String toString(){
        String s = "";
        String suitStr = "";
        String numStr = "";
        String suitOptions = "hsdc";
        // Convert suit and number into file address
        // Convert suit:
        suitStr = suitOptions.substring(suit-1, suit);
        // Convert num:
        if (number <= 10){
            numStr = number + "";
        }
        if (number == 11)
            numStr = "j";
        if (number == 12)
            numStr = "q";
        if (number == 13)
            numStr = "k";

        s = suitStr + numStr;        
        return s;
    }

    @Override
    public void draw(Graphics g) {
        
        if(showingBack){
            g.drawImage(backImage, x, y, null);
        }
        g.drawImage(cardImage, x, y, null);
        
    }

}