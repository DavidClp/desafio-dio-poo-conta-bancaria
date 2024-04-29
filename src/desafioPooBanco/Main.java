package desafioPooBanco;

public class Main {
	public static void main(String[] args) {
		Cliente david = new Cliente();
		david.setNome("David");
		
		Cliente nathalia = new Cliente();
		nathalia.setNome("Nathalia");
		
		Conta contaCorrente1 = new ContaCorrente(david);
		contaCorrente1.depositar(500);
		contaCorrente1.sacar(150);
		
		Conta contaPoupanca1 = new ContaPoupanca(nathalia);
		contaPoupanca1.depositar(900);
		contaPoupanca1.transferir(100, contaCorrente1);
		
		
		contaCorrente1.imprimirExtrato();
		contaPoupanca1.imprimirExtrato();

	}
}
