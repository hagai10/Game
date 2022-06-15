

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TheGame  {
    protected final int PANELWIDTH = 700;

    protected final int PANELHEIGHT= 700;
    protected JFrame frame = new JFrame();
    protected JPanel title = new JPanel();
    protected JPanel buttonPanel = new JPanel();
   protected static JLabel text = new JLabel();
   protected static  JButton[] buttons = new JButton[9];
   protected Random random = new Random();
   protected static boolean firstTurn;


    TheGame(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(PANELWIDTH, PANELHEIGHT);
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        text.setBackground(Color.black);
        text.setForeground(Color.orange);
        text.setFont(new Font("Kristen ITC", Font.ITALIC, 80));
        text.setText("lets play");
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setOpaque(true);

        title.setLayout(new BorderLayout());
        title.setBounds(0,0,PANELWIDTH,PANELHEIGHT/7);

        buttonPanel.setLayout(new GridLayout(3,3));

        GameListener g = new GameListener();

        for (int i=0; i<9; i++){
            buttons[i] = new JButton();
            buttonPanel.add(buttons[i]);
            buttons[i].setFont(new Font("Kristen ITC", Font.ITALIC, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(g);
        }


        title.add(text);
        frame.add(title, BorderLayout.NORTH);
        frame.add(buttonPanel);

        firstTurn();
    }

    public void firstTurn(){
        try{
            Thread.sleep(3000);
        }catch (Exception e){

        }
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

            xWins(0,1,2);        }

        if ((buttons[3].getText() == "X")  &&
                (buttons[4].getText() == "X") &&
                (buttons[5].getText() == "X") ){

            xWins(3,4,5);        }


        if ((buttons[6].getText() == "X")  &&
                (buttons[7].getText() == "X") &&
                (buttons[8].getText() == "X") ){

            xWins(6,7,8);        }

        if ((buttons[0].getText() == "X")  &&
                (buttons[3].getText() == "X") &&
                (buttons[6].getText() == "X") ){

            xWins(0,3,6);        }

        if ((buttons[1].getText() == "X")  &&
                (buttons[4].getText() == "X") &&
                (buttons[7].getText() == "X") ){

            xWins(1,4,7);        }

        if ((buttons[2].getText() == "X")  &&
                (buttons[5].getText() == "X") &&
                (buttons[8].getText() == "X") ){

            xWins(2,5,8);        }

        if ((buttons[0].getText() == "X")  &&
                (buttons[4].getText() == "X") &&
                (buttons[8].getText() == "X") ){

            xWins(0,4,8);
        }

        if ((buttons[2].getText() == "X")  &&
                (buttons[4].getText() == "X") &&
                (buttons[6].getText() == "X") ){

            xWins(2,4,6);
        }

        if ((buttons[0].getText() == "O")  &&
                (buttons[1].getText() == "O") &&
                (buttons[2].getText() == "O") ){

            oWins(0,1,2);
        }

        if ((buttons[3].getText() == "O")  &&
                (buttons[4].getText() == "O") &&
                (buttons[5].getText() == "O") ){

            oWins(3,4,5);
        }


        if ((buttons[6].getText() == "O")  &&
                (buttons[7].getText() == "O") &&
                (buttons[8].getText() == "O") ){

            oWins(6,7,8);
        }

        if ((buttons[0].getText() == "O")  &&
                (buttons[3].getText() == "O") &&
                (buttons[6].getText() == "O") ){

            oWins(0,3,6);
        }

        if ((buttons[1].getText() == "O")  &&
                (buttons[4].getText() == "O") &&
                (buttons[7].getText() == "O") ){

            oWins(1,4,7);
        }

        if ((buttons[2].getText() == "O")  &&
                (buttons[5].getText() == "O") &&
                (buttons[8].getText() == "O") ){

            oWins(2,5,8);
        }

        if ((buttons[0].getText() == "O")  &&
                (buttons[4].getText() == "O") &&
                (buttons[8].getText() == "O") ){

            oWins(0,4,8);
        }

        if ((buttons[2].getText() == "O")  &&
                (buttons[4].getText() == "O") &&
                (buttons[6].getText() == "O") ){

            oWins(2,4,6);
        }
    }

    public static void xWins(int a, int b, int c) {
        text.setForeground(Color.CYAN);
        text.setText("X wins");
        for(int i=0;i<9; i++){
            buttons[i].setEnabled(false);
        }

    }

    public static void oWins(int a, int b, int c) {
        text.setForeground(Color.CYAN);
        text.setText("O wins");
        for(int i=0;i<9; i++){
            buttons[i].setEnabled(false);
        }
    }


}
