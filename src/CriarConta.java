public class CriarConta {
    public static void main(String[] args) {
        Conta contaComprador = new Conta();
        contaComprador.numero = 10;
        contaComprador.agencia = 1010;
        contaComprador.titular = "Aluno 1";
        contaComprador.deposita(200);


        if(contaComprador.saca(50)){
            System.out.println("Saque realizado com sucesso!");
        }
        else{
            System.out.println("Não foi possível realizar o saque!!");
        }
        System.out.println("Saldo antes do depósito: R$" + contaComprador.saldo);


        Conta contaVendedor = new Conta();
        contaVendedor.numero = 11;
        contaVendedor.agencia = 1111;
        contaVendedor.titular= "Aluno 2";
        contaVendedor.deposita(0);
        System.out.println("Saldo antes do depósito: R$" + contaVendedor.saldo);

        if (contaComprador.transfere(201.00, contaVendedor)) {
            System.out.println("Transferência realizada com sucesso!!! ");
        } else {
            System.out.println("Não foi possível realizar a transferência");


        }
        System.out.println("Saldo  do VENDEDOR depois da transferencia para o vendedor: R$" + contaVendedor.saldo);
        System.out.println("Saldo  do COMPRADOR depois da tranferência : R$" + contaComprador.saldo);


//        Conta primeiraConta = new Conta();
//        primeiraConta.numero = 2020;
//        primeiraConta.agencia = 20;
//        primeiraConta.titular = "Anderson Cruz";
//
//        System.out.println("Saldo antes do depósito: R$" + primeiraConta.saldo);
//
//        primeiraConta.deposita(500);
//
//        System.out.println("Saldo depois do depósito: R$" + primeiraConta.saldo);
//
//
//        if (primeiraConta.saca(500)){
//            System.out.println("Saque efetuado com sucesso!!!");
//        }
//        else{
//            System.out.println("Não foi possível realizar o saque !!");
//        }
//
//        primeiraConta.saldo -= 900;
//
//        System.out.println("Saldo depois do saque: R$" + primeiraConta.saldo);


//        System.out.println("Titular da conta: " + primeiraConta.titular);
//        System.out.println("Agencia da conta: "+ primeiraConta.agencia);
//        System.out.println("Numero da conta: " + primeiraConta.numero);
//        System.out.println("Saldo da conta: "+ primeiraConta.saldo);
//
//        System.out.println("localização da conta: "+primeiraConta);
//
//        Conta segundaConta = primeiraConta;
//
//        System.out.println("Localização segunda conta: " + segundaConta);
//
//        segundaConta.saldo += 900.00;
//
//        System.out.println("Saldo da conta: "+ primeiraConta.saldo);


    }


}
