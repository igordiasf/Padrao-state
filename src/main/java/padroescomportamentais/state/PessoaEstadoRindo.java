package padroescomportamentais.state;

public class PessoaEstadoRindo {

    private PessoaEstadoRindo() {};
    private static PessoaEstadoRindo instance = new PessoaEstadoRindo();
    public static PessoaEstadoRindo getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Pessoa Rindo";
    }
    public String rindo(Pessoa atleta){
        return "Pessoa fora do Descanso";
    }
    public String chorando(Pessoa atleta){
        atleta.setEstado((PessoaEstado) PessoaEstadoChorando.getInstance());
        return "Treino de caminhada iniciado";
    }
}
