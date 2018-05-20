package com.designPatterns.patterns.flyweight;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Divide the target class's state into: shareable (intrinsic) state,
 * and non-shareable (extrinsic) state.
 * Remove the non-shareable state from the class attributes,
 * and add it the calling argument list of affected methods.
 * The Button label is intrinsic state.
 * @author Ihor Savchenko
 * @version 1.0
 */
class ButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Button button  = (Button)e.getSource();
        Component[] buttons = button.getParent().getComponents();
        int i = 0;
        for ( ; i < buttons.length; i++) {
            if (button == buttons[i]) {
                break;
            }
        }
        System.out.println("label-" + e.getActionCommand()
                + "  x-" + i/10   + "  y-" + i%10);
    }
}
