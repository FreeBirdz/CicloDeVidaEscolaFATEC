package PacoteEscola;
import static org.junit.Assert.*;
import org.junit.Test;
public class testeEscola {

	@Test
	public void test() {
		
		Escola_Modelo escola_modelo = new Escola_Modelo();
/////////////////////////////////////////////////////////////////////
		
		//ALUNO
		//Cadastra um aluno
		escola_modelo.cadastrarAluno(new Aluno(123,321,999,"teste@teste.com", "nome do meu pai", "nome da minha mae", "Nome do aluno"));
		
		//OBJETO TESTE PARA CRIACAO REPETIDA DE USUARIO TESTANDO CADASTRO REPETIDO (EMAIL, CPF, RA)
		//escola_modelo.cadastrarAluno(new Aluno(123,321,999,"teste@teste.com", "nome do meu pai", "nome da minha mae", "Nome do aluno"));
		
		//Verificar a quantidade de itens cadastrados (Classe Aluno)
		assertEquals(escola_modelo.pesquisarAluno().size(), 1);
		
		
		//RESULTADO FALSO DE TESTE ASSERTEQUALS COM DOIS ALUNOS
		//assertEquals(escola_modelo.pesquisarAluno().size(), 2);

		
		//PESQUISAR ALUNO POR NOME
		assertEquals(escola_modelo.getAlunos().get(0).getNome_aluno(), "Nome do aluno");
		
		//PESQUISAR A NOTA DO ALUNO POR NOME

		
		//PESQUISA DE ALUNO POR CPF
		assertEquals(escola_modelo.getAlunos().get(0).getcpf(), 123);
		
		//PESQUISAR ALUNO POR NOME PAI
		

		//PESQUISAR ALUNO POR MAE
		
		
		//PESQUISAR ALUNO POR RA
		assertEquals(escola_modelo.getAlunos().get(0).getra(), 321);
		
		//PESQUISAR ALUNO POR EMAIL
		assertEquals(escola_modelo.getAlunos().get(0).getEmail(), "teste@teste.com");
		
		//PESQUISAR POR ALUNO COM DIFERENÇA DE DIGITACAO
		
		
		//PESQUISAR POR CPF COM DIFERENÇA DE DIGITACAO
		
		
		//PESQUISAR POR MAE COM DIFERENÇA DE DIGITACAO
		
		
		//PESQUISAR POR PAI COM DIFERENÇA DE DIGITACAO
		
		
		//PESQUISAR POR EMAIL COM DIFERENÇA DE DIGITACAO
		
		
		//PESQUISAR POR CARGO COM DIFERENÇA DE DIGITACAO
	
		
		//CADASTRAR ALUNO COM CPF, EMAIL, NOME
		
		
		//CADASTRAR ALUNO COM SOMENTE CPF, RA E NOME
		
		
		//ALTERAR CADASTRO ALUNO
		
		
//////////////////////////////////////////////////////////////////////
		
		//FUNCIONARIO
		//CADASTRAR FUNCIONARIO
		escola_modelo.cadastrarFuncionario(new Funcionario(123,321,99999999,"NOME DO FUNCIONARIO", "RUA FUNCIONARIO", "PERIODO FUNCIONARIO", "SETOR FUNCIONARIO", "CARGO FUNCIONARIO"));
		
		//TESTAR FUNCIONARIO CADASTRADO
		//Pesquisar por CPF
		assertEquals(escola_modelo.pesquisarFuncionario().get(0).getCpf(), 321);
		
		
		//PESQUISAR POR CPF COM DIFERENÇA DE DIGITACAO
		
		
		//Pesquisar por Telefone
		assertEquals(escola_modelo.pesquisarFuncionario().get(0).getTelefone(), 99999999);
		
		//PESQUISAR POR TELEFONE COM DIFERENÇA DE DIGITACAO
		
		
		//Pesquisar por Endereço
		assertEquals(escola_modelo.pesquisarFuncionario().get(0).getEndereco(), "RUA FUNCIONARIO");
		
		//PESQUISAR POR ENDERECO COM DIFERENÇA DE DIGITACAO
		
		
		//Pesquisar por Periodo
		assertEquals(escola_modelo.pesquisarFuncionario().get(0).getPeriodo(), "PERIODO FUNCIONARIO");
		
		//PESQUISAR POR PERIODO COM DIFERENÇA DE DIGITACAO
		
		
		//Pesquisar por Cargo
		assertEquals(escola_modelo.pesquisarFuncionario().get(0).getCargo(), "CARGO FUNCIONARIO");
		
		//PESQUISAR POR CARGO COM DIFERENÇA DE DIGITACAO
		
		
/////////////////////////////////////////////////////////////////////

		
		//Curso
		//CADASTRAR CURSO
		escola_modelo.cadastrarCurso(new Curso("Banco de Dados","Noturno",1));
		
		//TESTAR CURSO CADASTRADO
		assertEquals(escola_modelo.pesquisarCurso().size(), 1);
		
		//PESQUISAR POR NOME
		
		
		//PESQUISAR POR TITULO
		
		
		//PESQUISAR POR ID
		

		
/////////////////////////////////////////////////////////////////////
		
		// Materia
		//CADASTRAR MATERIA
		escola_modelo.cadastrarMateria(new Materia(1,40,"Calculo","Conta"));
		
		//TESTAR MATERIA CADASTRADO
		assertEquals(escola_modelo.pesquisarMateria().size(), 1);
		
		//PESQUISAR POR NUMERO DE VAGAS
		

		//PESQUISAR POR NOME MATERIA
		

		//PESQUISAR POR DESCRICAO
		
		
/////////////////////////////////////////////////////////////////////
		//fail("Not yet implemented");
	}

}
