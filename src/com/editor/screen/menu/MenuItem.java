package com.editor.screen.menu;

import javax.swing.*;

public class MenuItem extends MenuComponents{

    private JMenuItem menuItem;

    public MenuItem(String title, int position) {
        super(title, position);
        menuItem = new JMenuItem(getTitle());
    }

    @Override
    public JMenuItem getItem() {
        return menuItem;
    }

    @Override
    public JMenu getDropDown() {
        return null;
    }


}
