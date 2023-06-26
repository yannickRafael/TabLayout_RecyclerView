package yannick.pdm.tablayout.model;

public class Estudante {

    private String nome, curso, id;
    private int idade, avatar;

    public Estudante(String nome, String curso, int idade, int avatar) {
        this.nome = nome;
        this.curso = curso;
        this.id = Constantes.estudantes.size()+"";
        this.idade = idade;
        this.avatar = avatar;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
