package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[]args){

        // int, double, float, char, byte, short, long, boolean

        int idade = 10;
        long numeroGrande = 10000;
        double salarioDouble = 2000;
        double salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        //Strings nao sao do tipo primitivo, por isso devem ser declaradas com letra maiuscula

        String nome = "Isso é uma string";


    System.out.println(idade);
    System.out.println("A minha idade é "+idade+" anos, chama papai!");
    System.out.println("caractere" + caractere);
    System.out.println(falso);
    System.out.println("Este numero é bem grande: "+ numeroGrande);
    }
}
