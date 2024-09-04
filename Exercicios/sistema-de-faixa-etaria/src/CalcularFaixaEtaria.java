public class CalcularFaixaEtaria {
    public static void main(String[] args) {
        
        int idade = 26;
        boolean faixaEtaria;

        if (idade >=18 && idade <= 25) {
            faixaEtaria = true;
            
        } else {
            faixaEtaria = false;
        }

        System.out.println("Está na faixa etária de 18 a 25 anos? " + faixaEtaria);
    }
}
