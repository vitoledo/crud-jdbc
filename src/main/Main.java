package main;

import main.java.dao.CategoriaDAO;
import main.java.model.Categoria;

import main.java.dao.ProdutoDAO;
import main.java.model.Produto;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoDAO dao = new ProdutoDAO();
        CategoriaDAO categoriaDAO = new CategoriaDAO();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Inserir produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Deletar produto");
            System.out.println("5 - Sair");
            System.out.println("6 - Inserir categoria");
            System.out.println("7 - Listar categorias");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    Produto p = new Produto(nome, preco);
                    dao.inserir(p);
                    break;

                case 2:
                    List<Produto> lista = dao.listar();
                    for (Produto prod : lista) {
                        System.out.println(prod.getId() + " - " +
                                prod.getNome() + " - " +
                                prod.getPreco());
                    }
                    break;

                case 3:
                    System.out.print("ID do produto para atualizar: ");
                    int idAtualizar = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Novo preço: ");
                    double novoPreco = sc.nextDouble();
                    Produto pAtualizar = new Produto(novoNome, novoPreco);
                    pAtualizar.setId(idAtualizar);
                    dao.atualizar(pAtualizar);
                    break;

                case 4:
                    System.out.print("ID do produto para deletar: ");
                    int idDeletar = sc.nextInt();
                    dao.deletar(idDeletar);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                case 6:
                    System.out.print("Nome da categoria: ");
                    String nomeCat = sc.nextLine();
                    Categoria categoria = new Categoria(nomeCat);
                    categoriaDAO.inserir(categoria);
                    break;

                case 7:
                    List<Categoria> categorias = categoriaDAO.listar();
                    for (Categoria cat : categorias) {
                        System.out.println(cat.getId() + " - " + cat.getNome());
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
