package PacoteEscola;

public class Funcionario {
	private int id, cpf, telefone ;
	private String nome_completo, endereco, periodo, setor, cargo;
	
	public Funcionario (int id, int cpf, int telefone, String nome_completo, String endereco, String periodo, String setor, String cargo){
		this.id = id;
		this.cpf = cpf;
		this.telefone = telefone;
		this.nome_completo = nome_completo;
		this.endereco = endereco;
		this.periodo = periodo;
		this.setor = setor;
		this.cargo = cargo;
		
	}
	
		public Funcionario (int cpfString nome_completo){
		this.cpf = cpf;
		this.nome_completo = nome_completo;
	}
	
		public Funcionario (int id, int cpf, int telefone, String nome_completo, String endereco){
		this.id = id;
		this.cpf = cpf;
		this.telefone = telefone;
		this.nome_completo = nome_completo;
		this.endereco = endereco;
	}
	
		public Funcionario (int id, int cpf, String nome_completo, String periodo, String setor, String cargo){
		this.id = id;
		this.cpf = cpf;
		this.nome_completo = nome_completo;
		this.periodo = periodo;
		this.setor = setor;
		this.cargo = cargo;
		
	}
	
		public Funcionario (, int cpf, int telefone, String nome_completo, String endereco, String periodo, String setor, String cargo){
		this.cpf = cpf;
		this.telefone = telefone;
		this.nome_completo = nome_completo;
		this.endereco = endereco;
		this.periodo = periodo;
		this.setor = setor;
		this.cargo = cargo;
		
	}
	
		public Funcionario (int id, String nome_completo, String endereco, String periodo, String setor, String cargo){
		this.id = id;
		this.nome_completo = nome_completo;
		this.endereco = endereco;
		this.periodo = periodo;
		this.setor = setor;
		this.cargo = cargo;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	}

