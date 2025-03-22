package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        // 1,2,3,4,5 meses
        // 10,15,20,25,30 dias respectivos de cada mes

        int [][] dias = new int[3][3];

        dias [0][0]=10;
        dias [0][1]=15;
        dias [0][2]=20;

        dias [1][0]=10;
        dias [1][1]=15;
        dias [1][2]=20;

        dias [2][0]=10;
        dias [2][1]=15;
        dias [2][2]=20;

        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("-----------FOREACH ABAIXO-------------");

        for(int [] arrBase:dias){
           for(int num: arrBase){
               System.out.println(num);
           }
        }

    }
}
