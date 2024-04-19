package avaliacao.builder;

public interface Builder {
    MontarLanche pao(String pao);
    MontarLanche carne(String carne);
    MontarLanche mussarela(String mussarela);

    Lanche getLanche();
}
