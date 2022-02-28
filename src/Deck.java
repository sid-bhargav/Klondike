import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class Deck extends Pile{

    public Deck(){
        for (int i=0; i<4; i++){
            for (int j=1; j<14; j++){
                Card c = new Card(i+1,j);
                cards.add(c);
            }
        }
    }

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean canAddCard(Card c) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
