package desafioPooBanco;

import interfaces.IConta;

public abstract class Conta implements IConta {
	private static int  AGENCIA_PADRAO = 1; 
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo = 0.0;
	protected Cliente cliente;
	
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		
		contaDestino.depositar(valor);
	}

	protected void imprimirInformacoesGerais() {
		System.out.println(String.format("Titular: %s", cliente.nome));
		System.out.println(String.format("Agencia: %d", agencia));
		System.out.println(String.format("Número: %d", numero));
		System.out.println(String.format("Saldo: R$ %.2f", saldo));
	}
}
