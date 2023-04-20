import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setSize(400,400);
        MyPanel thePanel = new MyPanel();
thePanel.setLayout(new BorderLayout());


thePanel.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e){

    };
});

        JLabel title = new JLabel("Tic Tac Toe");
        JLabel player1 = new JLabel("Player 1");
        JTextField  play1textField = new JTextField(10);
        JLabel player2 = new JLabel("Player 2");
        JTextField play2TextField = new JTextField(10);

        JLabel p1Name = new JLabel(" name");
        JLabel space = new JLabel("                    ");
        JLabel p2Name = new JLabel("           name");

        JButton topleft = new JButton(" ");
        JButton topMid = new JButton(" ");
        JButton topRight = new JButton(" ");
        JButton midLeft = new JButton(" ");
        JButton midMid = new JButton(" ");
        JButton midRight = new JButton(" ");
        JButton lowLeft = new JButton(" ");
        JButton lowMid = new JButton(" ");
        JButton lowRight = new JButton(" ");


        JPanel topPanelInNorthOfThePanel = new JPanel();
        JPanel midMidPanel = new JPanel();
        JPanel bottomBoard = new JPanel();
        bottomBoard.setLayout(new GridLayout(3,3));

        bottomBoard.add(topleft);
        bottomBoard.add(topMid);
        bottomBoard.add(topRight);
        bottomBoard.add(midLeft);
        bottomBoard.add(midMid);
        bottomBoard.add(midRight);
        bottomBoard.add(lowLeft);
        bottomBoard.add(lowMid);
        bottomBoard.add(lowRight);

        topPanelInNorthOfThePanel.add(title);

        midMidPanel.add(player1);
        midMidPanel.add(play1textField);
        midMidPanel.add(player2);
        midMidPanel.add(play2TextField);
        midMidPanel.add(p1Name);
        midMidPanel.add(space);
        midMidPanel.add(p2Name);


    thePanel.add(midMidPanel, BorderLayout.CENTER);
    thePanel.add(topPanelInNorthOfThePanel,BorderLayout.NORTH);
    thePanel.add(bottomBoard,BorderLayout.SOUTH);







        myFrame.add(thePanel);
        myFrame.setVisible(true);




    }


}