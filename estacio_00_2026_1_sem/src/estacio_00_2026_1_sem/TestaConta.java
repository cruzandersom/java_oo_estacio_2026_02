package estacio_00_2026_1_sem;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta primeiraConta = new Conta();

		Conta segundaConta = new Conta();
		segundaConta.setAgencia(1);
		segundaConta.setSaldo(1000.000);
		segundaConta.setNumero(1000);
		System.out.println("Saldo inicial segunda conta: " + segundaConta.getSaldo());

		primeiraConta.setAgencia(12);
		primeiraConta.setNumero(10);
		primeiraConta.setSaldo(10000.00);
		System.out.println("Saldo inicial e: R$" + primeiraConta.getSaldo());
		primeiraConta.deposita(10000);
		System.out.println("Saldo apos deposito e: R$" + primeiraConta.getSaldo());

		primeiraConta.transfere(1000.00, segundaConta);
		System.out.println("Saldo inicial segunda apos transferencia: " + segundaConta.getSaldo());

		System.out.println(primeiraConta.getAgencia());
		System.out.println(primeiraConta.getNumero());
		System.out.println(primeiraConta.getSaldo());

		System.out.println("primeira conta tem R$" + primeiraConta.getSaldo() + " de saldo!!");

	}

}
