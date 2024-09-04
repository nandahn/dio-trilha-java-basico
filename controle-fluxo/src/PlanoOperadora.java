public class PlanoOperadora {
    public static void main(String[] args) {
        
        //Utilizando Encadeada 
        // String plano = "M";

        // if (plano == "B") {
        //     System.out.println("100 Minutos de ligação");
            
        // }
        // else if (plano == "M") {
        //     System.out.println("100 Minutos de ligação");
        //     System.out.println("Whats e Instagram grátis");
        // }
        // else if (plano == "T") {
        //     System.out.println("100 Minutos de ligação");
        //     System.out.println("Whats e Instagram grátis");
        //     System.out.println("5GB de Youtube");
        // }

        //Utilizando Switch Case

        String plano = "M";

        switch (plano) {
            case "T":
                System.out.println("5GB de Youtube");
            case "M":
                System.out.println("Whats e Instagram Grátis");
            case "B":
                System.out.println("100 minutos de ligação");
        }
    }
}
