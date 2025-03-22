package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //OPERADORES TERNARIOS
        double salario = 6000;
        String mensagemDoar = "Eo vou doar 500R$ para o chico";
        String mensagemNaoDoar = "Vixe, to lisao mané";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
        /*
         - ESSE SERIA O METODO MAIS COMUM
        if(salario > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

        UTILIZANDO O OPERADOR TERNARIO FICARIA ASSIM
        (CONDICAO) ? VERDADEIRO : FALSO
        */


    }
}
