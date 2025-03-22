package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String [] args) {

        int idade = 20;
        boolean isAutorizadoComprar = idade >= 18;
        if (isAutorizadoComprar) {
            System.out.println("Autorizado a venda!");
        }
        if (!isAutorizadoComprar) {
            System.out.println("Voce não esta autorizado!");
        }
        System.out.println("Resultado if-else abaixo:");

        // if else
        //

        if (isAutorizadoComprar) {
            System.out.println("Autorizado a venda!");
        }else{
            System.out.println("Voce não esta autorizado!");
        }
    }
}
