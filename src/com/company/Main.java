package com.company;

public class Main {

    public static void main(String[] args) {

        Word word = new Word("Era uma vez", "A história de era uma vez...");
        PowerPoint powerPoint = new PowerPoint("Who is bad?","Música do rei do pop!");
        Excel excel = new Excel("Custos do mês", "Conta, mais contas, mais...");

        word.criarArquivo();
        powerPoint.criarArquivo();
        excel.criarArquivo();

    }
}
