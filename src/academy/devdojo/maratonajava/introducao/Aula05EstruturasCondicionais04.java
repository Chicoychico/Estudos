package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 25000;
        double primeiraFaixa = 9.70/100;
        double segundaFaixa = 37.55/100;
        double terceiraFaixa = 49.50/100;
        double impostoReal;
        String taxa;
        if (salario>0 && salario<=34712){
            taxa = "Seu salario vai sofrer 9.70% de taxa";
            impostoReal = salario*primeiraFaixa;
        } else if(salario>34712 && salario<=34713){
            taxa = "Seu salario vai sofrer 37.35% de taxa";
            impostoReal = salario*segundaFaixa;
        } else{
            taxa = "Seu salario vai sofrer 49.50% de taxa";
            impostoReal = salario*terceiraFaixa;
        }
        System.out.println(taxa);
        System.out.println(impostoReal);
    }
}
