public class Aprovado { //classe

    public static void main(String [] args) { //método 

        final int nota = 7;
        if(nota < 5) 
            System.out.println("Reprovado");
        
        else if(nota == 6 ) 
            System.out.println("Prova final");
        
        else if (nota > 6) 
            System.out.println("Aprovado !");
        
    }
    
}
