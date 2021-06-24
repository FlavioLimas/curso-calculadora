package br.com.calc.visao;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display extends JPanel {

    private final JLabel label;

    public Display() {
        setBackground(new Color(46, 49, 50));
        label = new JLabel("1234,56");
        label.setForeground(Color.WHITE);
        add(label);
    }
    
}
