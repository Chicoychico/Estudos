package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, log, float e double -> 0
        // char -> \u0000
        // boolean -> false
        // String -> null
        boolean [] nomes = new boolean[3];
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);

        int [] idades = new int[3];
        idades [0] = 25;
        idades [1] = 35;
        idades [2] = 45;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
        //

        String [] name = new String[3];
        name [0] = "Wand";
        name [1] = "Lis";
        name [2] = "Caju";

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
