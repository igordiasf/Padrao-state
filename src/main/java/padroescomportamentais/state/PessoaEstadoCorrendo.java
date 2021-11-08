package padroescomportamentais.state;

public class PessoaEstadoCorrendo {
    private PessoaEstadoCorrendo() {};
    private static PessoaEstadoCorrendo instance = new PessoaEstadoCorrendo();
    public static PessoaEstadoCorrendo getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Pessoa Correndo";
    }
    public String rindo(Pessoa pessoa){
        return "Pessoa Descansando";
    }
    public String chorando(Pessoa pessoa){
        return "Treino de caminhada iniciado";
    }
    public String correndo(Pessoa pessoa){
        return "Treino não iniciado";
    }
}
