package avaliacao.command;

public class Main {
    public static void main(String[] args) {
        CachorroObdiente cachorroObdiente = new CachorroObdiente();

        Comando comando = new Cachorro(cachorroObdiente);

        PessoaQueComandaCachorro pessoaQueComandaCachorro = new PessoaQueComandaCachorro();
        pessoaQueComandaCachorro.setComando(comando);

        pessoaQueComandaCachorro.executarComando();
    }
}
