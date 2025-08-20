package main;

import main.java.dao.CategoriaDAO;
import main.java.model.Categoria;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CategoriaDAO dao = new CategoriaDAO();

        // inserir
        //  fiz um exemplo de categoria
        Categoria nova = new Categoria("Higiene", true);
        dao.inserir(nova);
        System.out.println("Categoria inserida!");

        // listar
        System.out.println("Categorias:");
        List<Categoria> lista = dao.listar();
        lista.forEach(System.out::println);

        // atualizar (pega o primeiro como exemplo)
        if (!lista.isEmpty()) {
            Categoria primeira = lista.get(0);
            primeira.setNome("Higiene e limpeza");
            dao.atualizar(primeira);
            System.out.println("Categoria atualizada!");
        }

        // listar de novo
        System.out.println("Categorias após atualização:");
        dao.listar().forEach(System.out::println);

        // deletar (pega o último como exemplo)
        if (!lista.isEmpty()) {
            Categoria ultima = lista.get(lista.size() - 1);
            dao.deletar(ultima.getId());
            System.out.println("Categoria deletada!");
        }

        // listar no final
        System.out.println("Categorias finais:");
        dao.listar().forEach(System.out::println);
    }
}
