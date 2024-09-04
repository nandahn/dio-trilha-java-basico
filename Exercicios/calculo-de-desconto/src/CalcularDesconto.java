public class CalcularDesconto {
    public static void main(String[] args) {
        double precoOriginal = 100.00;
        double precoFinal;
        double desconto;

        if (precoOriginal >= 100.00) {
            desconto = 0.10;
            
        } else{ 
            desconto = 0.05;
        }

        precoFinal = precoOriginal - (precoOriginal * desconto);

        System.out.println("O preço final com desconto é: " + precoFinal);
    }
}
