package br.com.calc.visao;

import javax.swing.JFrame;

public class Calculadora extends JFrame {

    public Calculadora() {

        organizarLayout();
        
        setSize(232, 322);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void organizarLayout() {
    }

    public static void main(String[] args) {
        new Calculadora();
    }
    
}
