public class Conta {
    int agencia;
    int numero;
    String titular;
    double saldo;

    public void deposita(double valor) {

        this.saldo += this.saldo + valor;
        System.out.println("Você depositou a quantia de : R$" + valor);
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }


}
