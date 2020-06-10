package com.aceleradora.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        apresentaLinha();

        System.out.println("Bem vinda(o) à biblioteca, onde você encontra os melhores livros de Porto Alegre :)");

        //Cria lista com os dois livros que serão apresentados no console para o usuário selecionar.
        // A criação da lista de autores e de livros está dentro do método criaListaComDoisLivros()
        List<Livro> livros = criaListaComDoisLivros();


        for (int i = 0; i < livros.size(); i++) {
            System.out.println("Livro " + (i + 1));
            System.out.println("    Título do livro: " + livros.get(i).getTitulo());

            System.out.print("    Autoria: ");

            for (int j = 0; j < livros.get(i).getAutor().size(); j++) {
                if (j >= 1) {
                    System.out.print(", ");
                }
                System.out.print(livros.get(i).getAutor().get(j).getNome());
            }
            System.out.println();
        }

        apresentaLinha();
    }

    private static List<Livro> criaListaComDoisLivros() {
        // criando a lista de autores vazia
        ArrayList<Autor> autores = new ArrayList();

        // adicionando o autor barbara na lista 'autores'
        autores.add(new Autor("Barbara Liskov"));

        // criando uma lista vazia de livros com nome 'livros'
        List<Livro> livros = new ArrayList<>();

        // criando um livro com a lista 'autores' (que só tem a barbara dentro)
        Livro livro1 = new Livro("Program development in Java", autores);

        // criando a segunda lista de autores vazia, com nome de 'doisAutores'
        ArrayList<Autor> doisAutores = new ArrayList();

        // adicionando os dois autores na lista de 'doisAutores'
        doisAutores.add(new Autor("Elisabeth Freeman"));
        doisAutores.add(new Autor("Kathy Sierra"));


        Livro livro2 = new Livro("Use a Cabeça: Padrões de projeto", doisAutores);

        livros.add(livro1);
        livros.add(livro2);

        // retorna a lista de livros com os 2 livros
        return livros;
    }


    private static void apresentaLinha() {
        System.out.println("====================================================================");
    }
}
