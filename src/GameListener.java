import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameListener implements ActionListener {



    @Override
    public  void actionPerformed(ActionEvent e) {
        for (int i= 0; i<9; i++){
            if (e.getSource()== TheGame.buttons[i]){
                if (TheGame.firstTurn){
                    if (TheGame.buttons[i].getText()== ""){
                        TheGame.buttons[i].setForeground(Color.BLUE);
                        TheGame.buttons[i].setText("X");
                        TheGame. firstTurn = false;
                        TheGame.text.setText("O turn");
                        TheGame.check();
                    }
                }
                else {
                    if (TheGame.buttons[i].getText()== ""){
                       TheGame. buttons[i].setForeground(Color.RED);
                       TheGame. buttons[i].setText("O");
                       TheGame. firstTurn = true;
                        TheGame.text.setText("X turn");
                       TheGame. check();
                    }

                }
            }
        }
    }
}
