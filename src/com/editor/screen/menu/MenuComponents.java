package com.editor.screen.menu;

import javax.swing.*;

public abstract class MenuComponents {

    private int position;
    private String title;

    public MenuComponents(String title, int position){
        this.title = title;
        this.position = position;
    }

    public int getPosition(){
        return position;
    }

    protected String getTitle(){
        return title;
    }

    public abstract JMenuItem getItem();
    public abstract JMenu getDropDown();
}
