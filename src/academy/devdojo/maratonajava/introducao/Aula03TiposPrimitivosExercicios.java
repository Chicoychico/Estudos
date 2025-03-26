package academy.devdojo.maratonajava.introducao;
// --PRATICA--
// Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
// Eu <nome>, morando no endereço <endereço>, confirmo que
// recebi o salario de <salario>, na data <data>

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String name = "Wanderson", adress = "Av pernambuco 2286 - TERESINA // PI";
        double wage = 3500.00;
        int day = 25, month = 04, year=2000;
        System.out.println("Eu "+name+" estou morando no endereço: "+ adress+", confirmo que recebi o salario de R$" +wage+ ", na data "+day+"/"+month+"/"+year);

    }
}
