package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //UTILIZANDO O SWITCH E DADOS OS VALORES DE 1 A 7, IMPRIMA SE É DIA UTIL OU FINAL DE SEMANA.
        // CONSIDERE 1 COMO DOMINGO
        byte dia = 5;
        // char, int, short, enum, String, byte
        switch (dia) {
            case 1:
                System.out.println("Domingo. Hoje não é um dia util.");
                break;
            case 2:
                System.out.println("Segunda, hoje é um dia util");
                break;
            case 3:
                System.out.println("Terça, hoje é um dia util");
                break;
            case 4:
                System.out.println("Quarta, hoje é um dia util");
                break;
            case 5:
                System.out.println("Quinta, hoje é um dia util");
                break;
            case 6:
                System.out.println("Sexta, hoje é um dia util");
                break;
            case 7:
                System.out.println("Sabado. Hoje não é um dia util.");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
