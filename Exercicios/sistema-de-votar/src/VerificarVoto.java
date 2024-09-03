public class VerificarVoto {
    public static void main(String[] args) {
        int idade = 15;

        boolean podeVotar;

        if (idade >= 18) {
            podeVotar = true;
        } else {
            podeVotar = false;
        }

        System.out.println("Pode votar? " + podeVotar);
    }
}
