
public class Funcionario {
	
	private String nome;
	private String sobrenome;
	private int horasTrabalhadas;
	private double valorPorHora;	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public String nomeCompleto() {
	String nomeCompleto = nome + " " + sobrenome;
	System.out.println(nomeCompleto);
	return nomeCompleto;
	
	}
	
	public double calcularSalario() {
	double salario = horasTrabalhadas * valorPorHora;
		System.out.println(salario);
		return salario;
		
	}
	
	public void incrementarHoras(int horasExtra) {
	horasTrabalhadas = horasTrabalhadas + horasExtra;
	}
}
	


	

