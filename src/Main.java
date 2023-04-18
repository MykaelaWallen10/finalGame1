import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setSize(400,400);
        MyPanel thePanel = new MyPanel();
thePanel.setLayout(new GridLayout());

        myFrame.add(thePanel);
        myFrame.setVisible(true);




    }


}