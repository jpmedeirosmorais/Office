package com.company;

import java.util.List;

public class Word extends Documento{
   private static String extensao = ".doc";

    public Word(String titulo, String conteudo) {
        super(titulo, conteudo);
    }

    @Override
    public void criarDocumento(){
        System.out.println("Arquivo criado com a extensão "+extensao+": "+getTitulo()+extensao);
    }

    @Override
    public String toString() {
        return "Word{}";
    }
}
