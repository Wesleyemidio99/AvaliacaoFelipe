package avaliacao.builder;

public class Lanche {
    private String pao;
    private String carne;
    private String mussarela;

    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setMussarela(String mussarela) {
        this.mussarela = mussarela;
    }

    public void mostrar(){
        System.out.println("Primeiro produto = "+ pao);
        System.out.println("Segundo produto = "+ carne);
        System.out.println("Terceiro produto = "+ mussarela);
    }
}
