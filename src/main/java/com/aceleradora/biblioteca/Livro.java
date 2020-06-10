package com.aceleradora.biblioteca;

import java.util.ArrayList;

public class Livro {
    //atributos
    private String titulo;
    private ArrayList<Autor> autores;

    //construtor abaixo o que a classe espera quando você vai chamar ela numa novsa instancia
    public Livro (String titulo, ArrayList<Autor> autores){
        this.titulo = titulo;
        this.autores = autores;

    }
    //retornando o valor da variavel titulo
    public String getTitulo(){
        return this.titulo;

    }
    public ArrayList<Autor> getAutor(){
        return this.autores;
    }
    // depois disso criamos o set, responsável por mudar o valor da variavel quando precisar
    public void setTitulo(String titulo){
        this.titulo = titulo;

    }
    public void setAutor(ArrayList<Autor> autores) {
        this.autores = autores;
    }
}
