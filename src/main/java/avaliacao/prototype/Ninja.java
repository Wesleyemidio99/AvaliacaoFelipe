package avaliacao.prototype;

public class Ninja implements Prototype {
    private String nome;

    public Ninja(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Prototype clonar() {
        return new Ninja(this.nome);
    }
}
