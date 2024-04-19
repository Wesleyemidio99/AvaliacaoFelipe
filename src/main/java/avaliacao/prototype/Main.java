package avaliacao.prototype;

import avaliacao.prototype.Ninja;

public class Main {
    public static void main(String[] args) {

        Ninja original = new Ninja("Naruto");
        Ninja cloneDasSombras = (Ninja) original.clonar();
        cloneDasSombras.setNome("Naruto clone");

        System.out.println(original.getNome());
        System.out.println(cloneDasSombras.getNome());
    }
}