package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos

        int numero01 = 10;
        int numero02 = 20;

        int soma = numero01 + numero02;
        int divisao = numero02 / numero01;
        int multiplicacao =  numero01 * numero02;

        System.out.println(soma);
        System.out.println(divisao);
        System.out.println(multiplicacao);

        // Operadores aritméticos
        // %
        int resto = 20%2;
        System.out.println(resto);

        // Operadores aritméticos
        // < menor > maior
        // <= menor igual >= maior igual
        // == igual
        // != diferente

        boolean isDezMaiorVinte = 10 > 20;
        boolean isDezMenorIgualVinte = 10 <= 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("10 > 20? " + isDezMaiorVinte);
        System.out.println("10 <= 20? "+ isDezMenorIgualVinte);
        System.out.println("10 = 10? "+ isDezIgualDez);
        System.out.println("10 != 20? "+ isDezDiferenteVinte );

        //Operadores Logicos
        // && -> and
        // || -> or
        // ! -> not

        // && -> and
        int idade = 24;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentrodaLeiMenorQueTrinta = idade <= 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: "+ isDentrodaLeiMenorQueTrinta);

        // || -> or
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel" + isPlaystationCincoCompravel);

        //Operadores de Atribuição
        // =  += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1;
        contador ++;
        contador --;
        ++ contador;
        -- contador;
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(contador2);


















    }
}
