package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.ano = 2000;
        carro1.nome = "Cavalinho feroz";
        carro1.modelo = "Mustang";

        carro2.ano = 1998;
        carro2.nome = "Fusca do chico";
        carro2.modelo = "Fusquinha";

        System.out.println("CARRO 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCARRO 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);


    }
}
