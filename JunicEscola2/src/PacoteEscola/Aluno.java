package PacoteEscola;

public class Aluno {
private int ra, telefone, cpf;
private String email, nome_pai, nome_mae, nome_aluno;
//date data_nascimento
 

public Aluno (int cpf, int ra, int telefone, String email, String nome_pai, String nome_mae, String nome_aluno){
	this.cpf = cpf;
	this.ra = ra;
	this.telefone = telefone;
	this.email = email;
	this.nome_pai = nome_pai;
	this.nome_mae = nome_mae;
	this.nome_aluno = nome_aluno;

}

public Aluno (int cpf, String email,  String nome_aluno){
	this.cpf = cpf;
	this.email = email;
	this.nome_aluno = nome_aluno;

}


public String getNome_aluno() {
	return nome_aluno;
}

public void setNome_aluno(String nome_aluno) {
	this.nome_aluno = nome_aluno;
}

public int getra() {
	return ra;
}
public void setra(int ra) {
	ra = ra;
}
public int getTelefone() {
	return telefone;
}
public void setTelefone(int telefone) {
	this.telefone = telefone;
}
public int getcpf() {
	return cpf;
}
public void setcpf(int cpf) {
	cpf = cpf;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNome_pai() {
	return nome_pai;
}
public void setNome_pai(String nome_pai) {
	this.nome_pai = nome_pai;
}
public String getNome_mae() {
	return nome_mae;
}
public void setNome_mae(String nome_mae) {
	this.nome_mae = nome_mae;
}



}
