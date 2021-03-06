package cursojava.classes;

/**
 * A CLASSE PESSOA É A SUPER CLASSE OU CLASSE PAI
 * A CLASSE PESSOA NÃO PODE SER INSTANCIADA, POIS ELA É UMA CLASSE ABSTRATA
 */
public abstract class Pessoa {

	/*PRIVATE SÓ PODE SER USADO OS ATRIBUTOS NA MESMA CLASSE
	 * E QUANDO ESTAR PROTECTED PODE SER USADO TAMBÉM NAS CLASSES FILHAS */
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String registroGeral;
	protected String numeroCpf;
	protected String nomeMae;
	protected String nomePai;
	protected String email;
	
	
	/*MÉTODO ABSTRACT QUE FICA NA CLASSE PAI, É OBRIGATÓRIO PARA AS CLASSES FILHAS*/
	public abstract double salario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * MÉTODO RETURN TRUE SE FOR 18 ANOS ACIMA, SE NÃO RETORN FALSE
	 * @return
	 */
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}

}
