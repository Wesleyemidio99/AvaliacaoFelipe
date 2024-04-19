package avaliacao.builder;

public class Chapeiro {

    private Builder builder;

    public Chapeiro(Builder builder){
        this.builder = builder;
    }

    public void montar(){
        builder.pao("Pao");
        builder.carne("Carne");
        builder.mussarela("Mussarela");
    }
}
