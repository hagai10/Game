

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
        frame.setTitle("game");

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
        int [][]conditionToWin = {{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        for (int i = 0; i < conditionToWin.length; i++) {
            int one = conditionToWin [i][0];
            int two = conditionToWin [i][1];
            int tree = conditionToWin [i][2];
            if (buttons[one].getText() =="X" && buttons[two].getText()=="X" &&buttons[tree].getText()=="X" ) xWins();
            if (buttons[one].getText() =="O" && buttons[two].getText()=="O" &&buttons[tree].getText()=="O" ) oWins();
        }

    }
    public static void xWins() {
        text.setText("X wins");
        for(int i=0;i<9; i++){
            buttons[i].setEnabled(false);
        }

    }
    public static void oWins() {
        text.setText("O wins");
        for(int i=0;i<9; i++){
            buttons[i].setEnabled(false);
        }
    }


}
