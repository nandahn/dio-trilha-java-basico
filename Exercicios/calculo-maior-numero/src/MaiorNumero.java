public class MaiorNumero {
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;

        int maiorNumero; 

        if (num1 >= num2 && num1 >= num3) {
            maiorNumero = num1;
        } else if (num2 >= num1 && num2 >= num3){
            maiorNumero = num2;
        } else{
            maiorNumero = num3;
        }

        System.out.println("O maior numero é: " + maiorNumero);
    }
}
