package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21-10);
    }

    public void multiplicaDoisNumeros(int num, int num2){
        System.out.println(num * num2);
    }

    public double divideDoisNumeros(double num1, double num2){

        if (num2 == 0){
            return 0;
        }

        return num1/num2;
    }
    public double divideDoisNumeros02(double num1, double num2){

        if (num2 == 0){
            return 0;
        }else {
            return num1/num2;
        }
    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2){
        if (num2==0){
            System.out.println("INVALIDO");
        }
        System.out.println(num1/num2);
    }
}
