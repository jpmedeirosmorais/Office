package com.company;

public class Word extends Documento{
   private static String extensao = ".doc";

    public Word(String titulo, String conteudo) {
        super(titulo, conteudo);
    }

    @Override
    public void criarArquivo() {
        System.out.println("Arquivo criado com a extensão "+extensao+": "+getTitulo()+extensao);
    }
}
