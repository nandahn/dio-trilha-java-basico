public class VerificarString {
    public static void main(String[] args) {
        
        String str1 = "Maria";
        String str2 = "Maria";
        boolean saoIguais;

        if (str1 == str2) {
            saoIguais = true;
        
        } else{
            saoIguais = false;
        }

        System.out.println("As strings são iguais? " + saoIguais);
    }
}
