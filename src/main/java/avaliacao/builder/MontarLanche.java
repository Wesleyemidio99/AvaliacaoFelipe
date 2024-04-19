package avaliacao.builder;

public class MontarLanche implements Builder{

    private Lanche lanche;

    public MontarLanche() {
        this.lanche = new Lanche();
    }


    @Override
    public MontarLanche pao(String pao) {
        lanche.setPao(pao);
        return this;
    }

    @Override
    public MontarLanche carne(String carne) {
        lanche.setCarne(carne);
        return this;
    }

    @Override
    public MontarLanche mussarela(String mussarela) {
        lanche.setMussarela(mussarela);
        return this;
    }

    @Override
    public Lanche getLanche(){
        return lanche;
    }
}
