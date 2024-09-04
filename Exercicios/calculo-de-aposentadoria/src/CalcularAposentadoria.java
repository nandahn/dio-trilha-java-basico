public class CalcularAposentadoria {
    public static void main(String[] args) {
        
        int idade = 66;
        int tempoContribuicao = 36;
        boolean podeAposentar;

        if (idade >= 65 && tempoContribuicao >= 35) {
            podeAposentar = true;
            
        } else{
            podeAposentar = false; 
        }

        System.out.println("Pode aposentar? " + podeAposentar);
    }
}
