package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Chico";
        estudante.sexo = 'M';
        estudante.idade = 25;

        System.out.println(estudante.name);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
    }
}
