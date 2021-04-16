package com.company;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDocumentos {
    private List<Documento> documentos;

    public GerenciadorDocumentos() {
        this.documentos = new ArrayList<Documento>();
    }

    public void addDocumento(Documento documento){
        this.documentos.add(documento);

    }

    public void listarDocumento(){
        for(int i = 0; i<this.documentos.size(); i++){
            Documento documentoAtual = this.documentos.get(i);
            documentoAtual.criarDocumento();
        }
    }
}
