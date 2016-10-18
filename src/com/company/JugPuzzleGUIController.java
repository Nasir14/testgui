package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Abdinasir on 15/10/2016.
 */
public class JugPuzzleGUIController {

    private JFrame mainFrame;
    private JPanel amountPanel;
    private JPanel controlPanel;
    private JPanel movesPanel;
    JButton btn1 = new JButton("8");
    JButton btn2 = new JButton("5");
    JButton btn3 = new JButton("3");

    private JugPuzzle jugPuzzle;



    public JugPuzzleGUIController() {
        mainFrame = new JFrame();
        mainFrame.setSize(150, 150);
        mainFrame.setLayout(new GridLayout(3, 1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        jugPuzzle = new JugPuzzle();

        amountPanel = new JPanel();
        amountPanel.setLayout(new GridLayout(1, 3));

        JPanel tempPanel1 = new JPanel();
        tempPanel1.setLayout(new FlowLayout());
        tempPanel1.add(new Label("8", JLabel.CENTER));
        amountPanel.add(tempPanel1);

        JPanel tempPanel2 = new JPanel();
        tempPanel2.setLayout(new FlowLayout());
        tempPanel2.add(new Label("0", JLabel.CENTER));
        amountPanel.add(tempPanel2);

        JPanel tempPanel3 = new JPanel();
        tempPanel3.setLayout(new FlowLayout());
        tempPanel3.add(new Label("0", JLabel.CENTER ));
        amountPanel.add(tempPanel3);



        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(1, 3));
        controlPanel.add(btn1);
        controlPanel.add(btn2);
        controlPanel.add(btn3);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        movesPanel = new JPanel();
        movesPanel.setLayout(new FlowLayout());
        movesPanel.add(new Label("Moves: 5", JLabel.CENTER ));





        mainFrame.add(amountPanel);
        mainFrame.add(controlPanel);
        mainFrame.add(movesPanel);
        mainFrame.setVisible(true);
    }







    public static void main(String[] args) {
        JugPuzzleGUIController jugPuzzleGUIController = new JugPuzzleGUIController();

    }
}
