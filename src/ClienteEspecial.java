
public class ClienteEspecial extends Cliente{
	static final int dividaMaxima = 50000;
	static final String tipo = "CE";
	
	/* Construtor da Classe ClienteEspecial
	 * Este construtor invoca o construtor da classe Cliente.
	 */
	ClienteEspecial(String nome, int cpf, int valor){
		super(nome, cpf, valor);
		
	}
	
	/* Metodo que retorna o valor do atributo tipo do objeto atual */
	String retornaTipo() {
		return tipo;
	}
	
	public boolean obterEmprestimo(int valor) {
		if (valor <= 0 || valor + this.getValorDaDivida() > dividaMaxima) return false;
		
		int novoValorDaDivida  = this.getValorDaDivida() + valor;
		this.setValorDaDivida(novoValorDaDivida);
		
//		valorDaDivida += valor;
		int novoValorContaCorrente = this.getValorContaCorrente() + valor;
		this.setValorContaCorrente(novoValorContaCorrente);
//		valorContaCorrente += valor;
		
		return true;
		
	}
	
}
