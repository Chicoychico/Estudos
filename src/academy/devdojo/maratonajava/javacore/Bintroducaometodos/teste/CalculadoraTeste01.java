package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        cal.somaDoisNumeros();
        System.out.println("Finalizando calculadora teste.");

        cal.subtraiDoisNumeros();
        System.out.println("Finalizando calculadora teste.");

    }
}
