package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    // Condição valor da parcela, valor da parcela deve ser >=1000
    public static void main(String[] args) {
        double valorTotal = 25000;
        for (int parcela = 1; parcela<=valorTotal ; parcela++) {
            double valorParcela = valorTotal/parcela;
            if(valorParcela>1000){
                break;
            }
            System.out.println("Valor da parcela R$ "+valorParcela+" em "+parcela+" vezes.");
        }
    }
}
