package avaliacao.builder;

public class Main {
    public static void main(String[] args) {

        Builder builder = new MontarLanche();
        Chapeiro chapeiro = new Chapeiro(builder);

        chapeiro.montar();

        Lanche lanche = builder.pao("Australiano").mussarela("Prato").carne("Picanha").getLanche();

        lanche.mostrar();
    }
}
