package br.com.calc.modelo;

public class Memoria {

    private static final Memoria instancia = new Memoria();
    
    private Memoria() { // aplicando singueton

    }

    public static Memoria getInstancia() {
        return instancia;
    }

    
}
