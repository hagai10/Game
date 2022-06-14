

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TheGame  {
    protected  static JFrame frame = new JFrame();
    protected static JPanel title = new JPanel();
    protected static  JPanel buttonPanel = new JPanel();
   protected static JLabel text = new JLabel();
   protected static  JButton[] buttons = new JButton[9];
   protected static Random random = new Random();
   protected static boolean firstTurn;


    TheGame(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        text.setBackground(Color.black);
        text.setForeground(Color.orange);
        text.setFont(new Font("David", Font.ITALIC, 80));
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setOpaque(true);

        title.setLayout(new BorderLayout());
        title.setBounds(0,0,700,100);

        buttonPanel.setLayout(new GridLayout(3,3));
        buttonPanel.setForeground(Color.gray);

        GameListener g = new GameListener();

        for (int i=0; i<9; i++){
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Ink Bild", Font.ITALIC, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(g);
        }


        title.add(text);
        frame.add(title, BorderLayout.NORTH);
        frame.add(buttonPanel);

        firstTurn();

    }

    public void firstTurn(){

        if (random.nextInt(2)==0){
            firstTurn = true;
            text.setText("X turn");
        }else {
            firstTurn = false;
            text.setText("O turn");
        }

    }
    public static void check(){

        if ((buttons[0].getText() == "X")  &&
                (buttons[1].getText() == "X") &&
                (buttons[2].getText() == "X") ){

            xWins();        }

        if ((buttons[3].getText() == "X")  &&
                (buttons[4].getText() == "X") &&
                (buttons[5].getText() == "X") ){

            xWins();        }


        if ((buttons[6].getText() == "X")  &&
                (buttons[7].getText() == "X") &&
                (buttons[8].getText() == "X") ){

            xWins();        }

        if ((buttons[0].getText() == "X")  &&
                (buttons[3].getText() == "X") &&
                (buttons[6].getText() == "X") ){

            xWins();        }

        if ((buttons[1].getText() == "X")  &&
                (buttons[4].getText() == "X") &&
                (buttons[7].getText() == "X") ){

            xWins();        }

        if ((buttons[2].getText() == "X")  &&
                (buttons[5].getText() == "X") &&
                (buttons[8].getText() == "X") ){

            xWins();        }

        if ((buttons[0].getText() == "X")  &&
                (buttons[4].getText() == "X") &&
                (buttons[8].getText() == "X") ){

            xWins();
        }

        if ((buttons[2].getText() == "X")  &&
                (buttons[4].getText() == "X") &&
                (buttons[6].getText() == "X") ){

            xWins();
        }

        if ((buttons[0].getText() == "O")  &&
                (buttons[1].getText() == "O") &&
                (buttons[2].getText() == "O") ){

            oWins();
        }

        if ((buttons[3].getText() == "O")  &&
                (buttons[4].getText() == "O") &&
                (buttons[5].getText() == "O") ){

            oWins();
        }


        if ((buttons[6].getText() == "O")  &&
                (buttons[7].getText() == "O") &&
                (buttons[8].getText() == "O") ){

            oWins();
        }

        if ((buttons[0].getText() == "O")  &&
                (buttons[3].getText() == "O") &&
                (buttons[6].getText() == "O") ){

            oWins();
        }

        if ((buttons[1].getText() == "O")  &&
                (buttons[4].getText() == "O") &&
                (buttons[7].getText() == "O") ){

            oWins();
        }

        if ((buttons[2].getText() == "O")  &&
                (buttons[5].getText() == "O") &&
                (buttons[8].getText() == "O") ){

            oWins();
        }

        if ((buttons[0].getText() == "O")  &&
                (buttons[4].getText() == "O") &&
                (buttons[8].getText() == "O") ){

            oWins();
        }

        if ((buttons[2].getText() == "O")  &&
                (buttons[4].getText() == "O") &&
                (buttons[6].getText() == "O") ){

            oWins();
        }
    }

    public static void xWins(){
        text.setText("X wins");
    }

    public static void oWins(){
        text.setText("O wins");
    }


}
