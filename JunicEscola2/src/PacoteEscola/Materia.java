package PacoteEscola;
import java.util.LinkedList;
import java.util.List;

public class Materia {
int id, n_vagas;
String nome_materia, descricao_materia;

private List<Curso> cursos = new LinkedList<Curso>();
private List<Aluno> alunos = new LinkedList<Aluno>();

public Materia (int id, int n_vagas, String nome_materia, String descricao_materia){
	this.nome_materia = nome_materia;
	this.n_vagas = n_vagas;
	this.descricao_materia = descricao_materia;
	this.id = id;
}

public Materia (int n_vagas, String nome_materia, String descricao_materia){
	this.nome_materia = nome_materia;
	this.n_vagas = n_vagas;
	this.descricao_materia = descricao_materia;
}

public Materia (int id, int n_vagas){
	this.n_vagas = n_vagas;
	this.id = id;
}

public Materia (int id, String nome_materia, String descricao_materia){
	this.nome_materia = nome_materia;
	this.descricao_materia = descricao_materia;
	this.id = id;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getN_vagas() {
	return n_vagas;
}

public void setN_vagas(int n_vagas) {
	this.n_vagas = n_vagas;
}

public String getNome_materia() {
	return nome_materia;
}

public void setNome_materia(String nome_materia) {
	this.nome_materia = nome_materia;
}

public String getDescricao_materia() {
	return descricao_materia;
}

public void setDescricao_materia(String descricao_materia) {
	this.descricao_materia = descricao_materia;
}

public List<Curso> getCursos() {
	return cursos;
}

public void setCursos(List<Curso> cursos) {
	this.cursos = cursos;
}

public List<Aluno> getAlunos() {
	return alunos;
}

public void setAlunos(List<Aluno> alunos) {
	this.alunos = alunos;
}

}
