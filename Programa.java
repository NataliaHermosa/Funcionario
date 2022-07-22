
public class Programa {

	public static void main(String[] args) {
		Funcionario novoFuncionario = new Funcionario();
				
			novoFuncionario.setNome("João");
			novoFuncionario.setSobrenome("Silva");
			novoFuncionario.setHorasTrabalhadas(20);
			novoFuncionario.setValorPorHora(37.25);
			
			novoFuncionario.nomeCompleto();
			novoFuncionario.calcularSalario();
			novoFuncionario.incrementarHoras(12);
			novoFuncionario.calcularSalario();
		}
		
		
	}

