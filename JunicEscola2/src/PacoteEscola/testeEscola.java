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
		
		//PESQUISA POR TELEFONE
		assertEquals(escola_modelo.getAlunos().get(0).getTelefone(), 999);
		
		//PESQUISA DE ALUNO POR CPF
		assertEquals(escola_modelo.getAlunos().get(0).getcpf(), 123);
		
		//PESQUISAR ALUNO POR NOME PAI
		assertEquals(escola_modelo.getAlunos().get(0).getNome_pai(), "nome do meu pai");

		//PESQUISAR ALUNO POR MAE
		assertEquals(escola_modelo.getAlunos().get(0).getNome_mae(), "nome da minha mae");
		
		//PESQUISAR ALUNO POR RA
		assertEquals(escola_modelo.getAlunos().get(0).getra(), 321);
		
		//PESQUISAR ALUNO POR EMAIL
		assertEquals(escola_modelo.getAlunos().get(0).getEmail(), "teste@teste.com");
		
		//PESQUISAR POR ALUNO COM DIFERENÇA DE DIGITACAO
		//assertEquals(escola_modelo.getAlunos().get(0).getNome_aluno(), "NOME DO ALUNO 1");
		
		//PESQUISAR POR CPF COM DIFERENÇA DE DIGITACAO
		//assertEquals(escola_modelo.getAlunos().get(0).getcpf(), "um");
		
		//PESQUISAR POR MAE COM DIFERENÇA DE DIGITACAO
		//assertEquals(escola_modelo.getAlunos().get(0).getNome_mae(), "maira1");
		
		//PESQUISAR POR PAI COM DIFERENÇA DE DIGITACAO
		//assertEquals(escola_modelo.getAlunos().get(0).getNome_pai(), "pai10");
		
		//PESQUISAR POR EMAIL COM DIFERENÇA DE DIGITACAO
		//assertEquals(escola_modelo.getAlunos().get(0).getEmail(), "teste@");
				
		//CADASTRAR ALUNO COM CPF, EMAIL, NOME
		escola_modelo.cadastrarAluno(new Aluno(123333,"teste2@teste.com", "Nome do aluno 2"));
		
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
		//assertEquals(escola_modelo.pesquisarFuncionario().get(0).getCpf(), "321a");
		
		//Pesquisar por Telefone
		assertEquals(escola_modelo.pesquisarFuncionario().get(0).getTelefone(), 99999999);
		
		//PESQUISAR POR TELEFONE COM DIFERENÇA DE DIGITACAO
		//assertEquals(escola_modelo.pesquisarFuncionario().get(0).getTelefone(), "a99999999");
		
		//Pesquisar por Endereço
		assertEquals(escola_modelo.pesquisarFuncionario().get(0).getEndereco(), "RUA FUNCIONARIO");
		
		//PESQUISAR POR ENDERECO COM DIFERENÇA DE DIGITACAO
		//assertEquals(escola_modelo.pesquisarFuncionario().get(0).getEndereco(), "Rua fUNCIONARIO1");
		
		//Pesquisar por Periodo
		assertEquals(escola_modelo.pesquisarFuncionario().get(0).getPeriodo(), "PERIODO FUNCIONARIO");
		
		//PESQUISAR POR PERIODO COM DIFERENÇA DE DIGITACAO
		//assertEquals(escola_modelo.pesquisarFuncionario().get(0).getPeriodo(), "Periodo F1cionario");
		
		//Pesquisar por Cargo
		assertEquals(escola_modelo.pesquisarFuncionario().get(0).getCargo(), "CARGO FUNCIONARIO");
		
		//PESQUISAR POR CARGO COM DIFERENÇA DE DIGITACAO
		//assertEquals(escola_modelo.pesquisarFuncionario().get(0).getCargo(), "Cargo FUNCIONARIO");
		
/////////////////////////////////////////////////////////////////////

		
		//Curso
		//CADASTRAR CURSO
		escola_modelo.cadastrarCurso(new Curso("Banco de Dados","Noturno",1));
		
		//TESTAR CURSO CADASTRADO
		assertEquals(escola_modelo.pesquisarCurso().size(), 1);
		
		//CURSO CADASTRADO COM DIFERENCA DE DIGITACAO
		
		//PESQUISAR POR NOME
		assertEquals(escola_modelo.pesquisarCurso().get(0).getNome_curso(), "Banco de Dados");
		
		//NOME COM DIFERENCA DE DIGITACAO
		
		
		//PESQUISAR POR PERIODO
		assertEquals(escola_modelo.pesquisarCurso().get(0).getPeriodo(), "Noturno");
		
		//PERIODO COM DIFERENCA DE DIGITACAO
		//assertEquals(escola_modelo.pesquisarCurso().get(0).getPeriodo(), "NOITE 1");
		
		//PESQUISAR POR ID
		assertEquals(escola_modelo.pesquisarCurso().get(0).getId(), 1);

		//ID COM DIFERENCA DE DIGITACAO
		//assertEquals(escola_modelo.pesquisarCurso().get(0).getId(), "um");
		
/////////////////////////////////////////////////////////////////////
		
		// Materia
		//CADASTRAR MATERIA
		escola_modelo.cadastrarMateria(new Materia(1,40,"Calculo","Conta"));
		
		//TESTAR MATERIA CADASTRADO
		assertEquals(escola_modelo.pesquisarMateria().size(), 1);
		
		//PESQUISA MATERIA COM DIFERNECA DE DIGITACAO
		//assertEquals(escola_modelo.pesquisarMateria().size(), "PRIMEIRO");
		
		//PESQUISAR POR NUMERO DE VAGAS
		assertEquals(escola_modelo.pesquisarMateria().size(), 1);
		
		//PESQUISAR VAGAS COM DIFERNECA DE DIGITACAO
		//assertEquals(escola_modelo.pesquisarMateria().size(), "dez");

		//PESQUISAR POR NOME MATERIA
		assertEquals(escola_modelo.pesquisarMateria().get(0).getNome_materia(), "Calculo");

		//PESQUISAR MATERIA COM DIFERNECA DE DIGITACAO
		//assertEquals(escola_modelo.pesquisarMateria().get(0).getNome_materia(), "CALCULO");
		
		//PESQUISAR POR DESCRICAO
		assertEquals(escola_modelo.pesquisarMateria().get(0).getDescricao_materia(), "Conta");
		
		//PESQUISAR A DESCRICAO COM DIFERNECA DE DIGITACAO
		//assertEquals(escola_modelo.pesquisarMateria().get(0).getDescricao_materia(), "CONTA");
		
/////////////////////////////////////////////////////////////////////
		//fail("Not yet implemented");
	}

}
