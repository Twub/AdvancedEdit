package com.editor.screen.menu;

import javax.swing.*;

public class MenuBar {

    private JMenuBar menuBar;
    private static MenuBar instance = null;

    public MenuBar(){
        menuBar = new JMenuBar();
    }

    public JMenuBar getMenuBar(){
        return menuBar;
    }

    public void addComponents(){

    }

    public MenuBar getInstance(){
        if (instance == null){
            instance = new MenuBar();
        }
        return instance;
    }
}
