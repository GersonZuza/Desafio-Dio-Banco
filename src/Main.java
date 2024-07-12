
public class Main {

	public static void main(String[] args) {
		Cliente gerson = new Cliente();
		gerson.setNome("Gerson");
		
		Conta cc = new ContaCorrente(gerson);
		Conta poupanca = new ContaPoupanca(gerson);
		
		cc.depositar(100.0);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
