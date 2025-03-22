package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {

        double valorTotal = 25000;

        for (int parcela = (int)valorTotal; parcela>=1 ; parcela--) {
            double valorParcela = valorTotal/parcela;
            if(valorParcela<1000){
                continue;
            }
            System.out.println("Valor da parcela R$ "+valorParcela+" em "+parcela+" vezes.");
        }
    }
}
