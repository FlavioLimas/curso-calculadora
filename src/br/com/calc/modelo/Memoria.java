package br.com.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

    private enum TipoComando {
        ZERAR,
        NUMERO,
        DIV,
        MULT,
        SUB,
        SOMA,
        IGUAL,
        VIRGULA;
    };

    private static final Memoria instancia = new Memoria();

    private final List<MemoriaObservador> observadores = new ArrayList<>();

    private String textoAtual = "";
    
    private Memoria() { // aplicando singueton

    }

    public static Memoria getInstancia() {
        return instancia;
    }

    public void adicionarObservador(MemoriaObservador observador) {
        observadores.add(observador);
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }
    
    public void processarComando(String valor) {

        if("AC".equals(valor)) {
            textoAtual = "";
        } else {
            textoAtual += valor;
            observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
        }
    }
}
