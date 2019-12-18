package com.editor;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    SwingUtilities.invokeLater(() -> new Main().createAndShowGUI());
    }

    private void createAndShowGUI(){
        JFrame window = new JFrame("AdvancedEdit");
        window.setSize(600,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);



        window.setVisible(true);
    }
}
