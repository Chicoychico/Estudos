package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){

        System.out.println("__________________");
        System.out.println(estudante.name);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
