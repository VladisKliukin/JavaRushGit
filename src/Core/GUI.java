package Core;

import javax.swing.*;
import java.awt.*;

public class GUI {
    private JFrame window;
    private JTextArea storyDisplay;


    public GUI() {
        createWindow();
        window.setVisible(true);
    }


    private void createWindow() {
        window = new JFrame("JavaRush");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setLayout(new BorderLayout());


        storyDisplay = new JTextArea();
        storyDisplay.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(storyDisplay);

        window.add(scrollPane, BorderLayout.CENTER);

    }


    public void updateStoryDisplay(String[] lines) {

        for (String line : lines) {
            storyDisplay.append(line);
        }


    }

}