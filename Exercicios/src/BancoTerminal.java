public class BancoTerminal {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        // Verifica se o saldo é suficiente para o saque
        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Segundo caso: saldo igual a 15 e valor solicitado igual a 22

        if (saldo >= valorSolicitado){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

    }
}
