package avaliacao.command;

public class PessoaQueComandaCachorro {
    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void executarComando(){
        comando.sentar();
    }
}
