package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.name = "William";
        prof.idade = 35;
        prof.sexo = 'M';

        System.out.println(prof.idade + " " + prof.sexo + " " + prof.name);
    }
}
