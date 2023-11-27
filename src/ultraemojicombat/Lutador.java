package ultraemojicombat;
//O CÓDIGO A SEGUIR É PARTE DE UM PROCESSO DESENVOLVIDO A PARTIR DAS AULAS DO PROFESSOR
//GUSTAVO GUANABARA
// FOI DESENVOLVIDO USANDO O SPRINGBOOT

public class Lutador {
	// Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	// Métodos Públicos
	public void apresentar() {
		System.out.print("");
		System.out.println("================================== APRESENTANDO!!!!! =====================================");
		System.out.print("");
		System.out.println("Apresentando o Lutador: " + this.getNome());
		System.out.println("Diretamente do(a): " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos.");
		System.out.println("Medindo " + this.getAltura() + " de altura.");
		System.out.println("Pesando " + this.getPeso() + " kg.");
		System.out.println("Ganhou " + this.getVitorias() + " lutas.");
		System.out.println("Perdeu " + this.getDerrotas() + " lutas.");
		System.out.println("Empatou " + this.getEmpates() + " vezes.");
		System.out.print("");
		System.out.println("==========================================================================================");

	}

	public void Status() {
		System.out.println("================================== ULTIMATE EMOJI COMBAT =====================================");

		System.out.println(this.getNome());
		System.out.println("É um lutador da categoria " + this.getCategoria() + ", com " + this.getVitorias()
				+ " vitórias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates.");
		System.out.println("==============================================================================================");
	}

	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}

	// Métodos Especiais
	//MÉTODO CONSTRUTOR
	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		super();
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);// AQUI ELE VAI CHAMAR O MÉTODO SETPESO PARA DEFINIR O MÉTODO SETCATEGORIA, UMA VEZ QUE A CATEGORIA SERIA
						 // MANIPULADA NÃO DIRETAMENTE PELO USUÁRIO, MAS SIM PELO MÉTODO SET PESO.
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	
	
	//MÉTODOS GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String no) {
		this.nome = no;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String na) {
		this.nacionalidade = na;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int id) {
		this.idade = id;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float al) {
		this.altura = al;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float pe) {
		this.peso = pe;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	// O SETTER DE CATEGORIA SERÁ MANIPULADO AUTOMATICAMENTE PELO SETTER DE PESO
	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inválido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Peso Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Peso Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Peso Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vi) {
		this.vitorias = vi;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int de) {
		this.derrotas = de;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int em) {
		this.empates = em;
	}

}
