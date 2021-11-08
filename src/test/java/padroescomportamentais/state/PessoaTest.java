import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroescomportamentais.state.PessoaEstadoCorrendo;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa pessoa;

    @BeforeEach
    public void setUp(){
        pessoa = new Pessoa();
    }
    @Test
    public void pessoaCorrendoPessoaRindo(){
        pessoa.setEstado(pessoa.getInstance());
        assertEquals("Pessoa Correndo", pessoa.rindo());
    }
    @Test
    public void pessoaCorrendoPessoaRindo(){
        pessoa.setEstado(PessoaEstadoRindo.getInstance());
        assertEquals("Pessoa Correndo", pessoa.chorando());
    }
    @Test
    public void pessoaChorandoPessoaRindo(){
        pessoa.setEstado(PessoaEstadoRindo.getInstance());
        assertEquals("Pessoa Correndo", pessoa.correndo());
    }

    @Test
    public void pessoaCorrendoPessoaChorando(){
        pessoa.setEstado(PessoaEstadoChorando.getInstance());
        assertEquals("Pessoa Correndo", pessoa.rindo());
    }
    @Test
    public void pessoaChorandoPessoaChorando(){
        pessoa.setEstado(PessoaEstadoChorando.getInstance());
        assertEquals("Pessoa Correndo", pessoa.chorando());
    }
    @Test
    public void pessoaCorrendoPessoaChorando(){
        pessoa.setEstado(PessoaEstadoChorando.getInstance());
        assertEquals("Pessoa Correndo", pessoa.correndo());
    }
    @Test
    public void pessoaRindoPessoaCorrendo(){
        pessoa.setEstado(PessoaEstadoCorrendo.getInstance());
        assertEquals("Pessoa Rindo", pessoa.rindo());
    }
    @Test
    public void pessoaChorandoPessoaCorrendo(){
        pessoa.setEstado(PessoaEstadoCorrendo.getInstance());
        assertEquals("Pessoa Correndo", pessoa.chorando());
    }
    @Test
    public void pessoaRindoPessoaCorrendo(){
        pessoa.setEstado(PessoaEstadoCorrendo.getInstance());
        assertEquals("Pessoa Correndo", pessoa.correndo());
    }
}