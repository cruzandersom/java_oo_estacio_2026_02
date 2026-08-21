package estacio_00_2026_1_sem;

public class Conta {

	private double saldo;
	private int agencia;
	private int numero;

	private Cliente titular;

	private static int total = 0;

	// Get agencia
	public int getAgencia() {
		return agencia;
	}

	// Set Agencia
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	// Get numero
	public int getNumero() {
		return numero;
	}

	// Set numero
	public void setNumero(int numero) {
		this.numero = numero;
	}

	// Get titular
	public Cliente getTitular() {
		return titular;
	}

	// Set titular
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
		
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
		
	}
	
	

}
