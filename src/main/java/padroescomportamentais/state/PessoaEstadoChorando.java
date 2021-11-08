package padroescomportamentais.state;

public class PessoaEstadoChorando {
    private PessoaEstadoChorando() {};
    private static PessoaEstadoChorando instance = new PessoaEstadoChorando();
    public static PessoaEstadoChorando getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Pessoa Caminhando";
    }
    public String rindo(Pessoa pessoa){
        return "Pessoa Descansando";
    }
    public String chorando(Pessoa pessoa){
        return "Treino não iniciado";
    }
}
