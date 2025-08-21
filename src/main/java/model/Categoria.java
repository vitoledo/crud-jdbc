package main.java.model;

public class Categoria {
    private int id;
    private String nome;
    private boolean ativo;

    public Categoria() {
    }

    public Categoria(int id, String nome, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.ativo = ativo;
    }

    public Categoria(String nome, boolean ativo) {
        this.nome = nome;
        this.ativo = ativo;
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    // get e set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Categoria{id=" + id + ", nome='" + nome + "', ativo=" + ativo + "}";
    }
}
