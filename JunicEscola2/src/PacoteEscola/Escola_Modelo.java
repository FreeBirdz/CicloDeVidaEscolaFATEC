package PacoteEscola;
import java.util.LinkedList;
import java.util.List;

//import APPBank.Usuario;


public class Escola_Modelo {

	String nome;
	int CEP;
	//int Cpf;
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	private List<Aluno> alunos = new LinkedList<Aluno>();
	private List<Curso> cursos = new LinkedList<Curso>();
	private List<Funcionario> funcionarios = new LinkedList<Funcionario>();
	private List<Materia> materias = new LinkedList<Materia>();
	
	
////////////////////////////////////////////////////////////////////////////////
// METODOS da classe ALUNO
	public void cadastrarAluno(Aluno aluno){
		if(alunoRepetido(aluno.getEmail(), aluno.getcpf(), aluno.getra())){
			alunos.add(aluno);
		}
		else {
			System.out.println("Aluno ja cadastrado");
		}
	}
	
	public boolean alunoRepetido(String email, int cpf, int ra){
		for(Aluno aluno:alunos){
			if(aluno.getEmail().equals(email) || aluno.getcpf()==(cpf) || aluno.getra()==(ra)) return false;
		}
		return true;
	}
	
	public List<Aluno> pesquisarAluno(){
		
		return this.alunos;
	}
	
	public List<Aluno> getAlunos(){
		return this.alunos;
		}
////////////////////////////////////////////////////////////////////////////////
	//METODOS CLASSE CURSO
	
	public void cadastrarCurso(Curso curso){
		cursos.add(curso);
		}

		public List<Curso> pesquisarCurso(){
			
			return this.cursos;
		}
////////////////////////////////////////////////////////////////////////////////
	//METODOS CLASSE MATERIA
		
		public void cadastrarMateria(Materia materia){
			materias.add(materia);
			}
		
			public List<Materia> pesquisarMateria(){
				return this.materias;
			}
			
////////////////////////////////////////////////////////////////////////////////
	//METODOS CLASSE FUNCIONARIO
		
		public void cadastrarFuncionario(Funcionario funcionario){
			funcionarios.add(funcionario);
			}
		
		//FAZER METODO DE FUNCIONARIO REPITIDO
		
		public List<Funcionario> pesquisarFuncionario(){
				
			return this.funcionarios;
			}
}
