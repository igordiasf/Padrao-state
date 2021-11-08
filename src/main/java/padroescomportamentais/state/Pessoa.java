package padroescomportamentais.state;
public class Pessoa {
    private String nomePessoa;
    private PessoaEstado estado;

    public Pessoa(){
        this.estado = (PessoaEstado) PessoaEstadoRindo.getInstance();
    }
    public void setEstado(PessoaEstado estado){
        this.estado = estado;
    }
    public String rindo(){
        return estado.rindo(this);
    }
    public String chorando(){
        return estado.chorando(this);
    }
    public String getNomeEstado(){
        return estado.getEstado();
    }
    public String getNomePessoa(){
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa){
        this.nomePessoa = nomePessoa;
    }
    public PessoaEstado getEstado(){
        return estado;
    }
}

