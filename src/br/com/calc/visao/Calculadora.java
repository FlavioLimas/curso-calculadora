package br.com.calc.visao;

import javax.swing.JFrame;

public class Calculadora extends JFrame {

    public Calculadora() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculadora();
    }
    
}
