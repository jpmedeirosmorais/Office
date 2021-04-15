package com.company;

public class PowerPoint extends Documento{
    private static String extensao = ".ppt";

    public PowerPoint(String titulo, String conteudo) {
        super(titulo, conteudo);
    }

    @Override
    public void criarArquivo() {
        System.out.println("Arquivo criado com a extensão "+extensao+": "+getTitulo()+extensao);
    }
}
