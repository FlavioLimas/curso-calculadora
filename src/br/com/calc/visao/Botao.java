package br.com.calc.visao;

import java.awt.Color;
import javax.swing.JButton;

public class Botao extends JButton {
    
    public Botao(String texto, Color cor) {
        setText(texto);
        setOpaque(true);
        setBackground(cor);
    }
}
