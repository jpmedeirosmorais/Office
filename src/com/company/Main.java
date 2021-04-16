package com.company;

public class Main {

    public static void main(String[] args) {
        Word word = new Word("Era uma vez", "A história de era uma vez...");
        PowerPoint powerPoint = new PowerPoint("Who is bad?","Música do rei do pop!");
        Excel excel = new Excel("Custos do mês", "Conta, mais contas, mais...");
        Word word2 = new Word("asdada", "13513513515");

        GerenciadorDocumentos gerenciadorDocumentos = new GerenciadorDocumentos();

        gerenciadorDocumentos.addDocumento(word);
        gerenciadorDocumentos.addDocumento(word2);
        gerenciadorDocumentos.addDocumento(powerPoint);
        gerenciadorDocumentos.addDocumento(excel);


        gerenciadorDocumentos.listarDocumento();



    }
}
