package PacoteEscola;
import java.util.LinkedList;
import java.util.List;

public class Curso {
String nome_curso, periodo;
int id;

private List<Materia> materias = new LinkedList<Materia>();

public Curso (String nome_curso, String periodo, int id){
	this.nome_curso = nome_curso;
	this.periodo = periodo;
	this.id = id;
}

public Curso (String periodo, int id){
	this.periodo = periodo;
	this.id = id;
}

public Curso (String nome_curso, int id){
	this.nome_curso = nome_curso;
	this.id = id;
}

public Curso (String nome_curso, String periodo){
	this.nome_curso = nome_curso;
	this.periodo = periodo;
}

public String getNome_curso() {
	return nome_curso;
}

public void setNome_curso(String nome_curso) {
	this.nome_curso = nome_curso;
}

public String getPeriodo() {
	return periodo;
}

public void setPeriodo(String periodo) {
	this.periodo = periodo;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public List<Materia> getMaterias() {
	return materias;
}

public void setMaterias(List<Materia> materias) {
	this.materias = materias;
}
}