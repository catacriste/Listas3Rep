package com.example.a48035.listas3;

/**
 * Created by a48035 on 18-03-2015.
 */

public class Aluno {
    private int numeroAluno;
    private int numeroImagem;
    private String nomeAluno;

    public Aluno(String nomeAluno, int numeroAluno, int numeroImagem)
    {
        super();
        this.nomeAluno = nomeAluno;
        this.numeroImagem = numeroImagem;
        this.numeroAluno = numeroAluno;
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(int numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public int getNumeroImagem() {
        return numeroImagem;
    }

    public void setNumeroImagem(int numeroImagem) {
        this.numeroImagem = numeroImagem;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
}
