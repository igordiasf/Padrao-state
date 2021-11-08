package padroescomportamentais.state;


public interface PessoaEstado {

    String getEstado();

    String chorando(Pessoa pessoa);

    String rindo(Pessoa pessoa);

    String correndo(Pessoa pessoa);
}


