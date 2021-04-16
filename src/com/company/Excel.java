package com.company;

public class Excel extends Documento{
    private static String extensao = ".xlsx";

    public Excel(String titulo, String conteudo) {
        super(titulo, conteudo);
    }

    @Override
    public void criarDocumento() {
        System.out.println("Arquivo criado com a extensão "+extensao+": "+getTitulo()+extensao);
    }

    @Override
    public String toString() {
        return "Excel{}";
    }
}
