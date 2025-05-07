package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        double result = cal.divideDoisNumeros(20,0);
        System.out.println(result);

        System.out.println("----------------");
        System.out.println(cal.divideDoisNumeros02(15,5));
        System.out.println("----------------");

        cal.imprimeDivisaoDoisNumeros(25,5);
    }
}
