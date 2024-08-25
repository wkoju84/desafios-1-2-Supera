import java.util.ArrayList;
import java.util.List;

public class Snail {

    public static List<Integer> snail(int[][] matriz){
        List<Integer> resultado = new ArrayList<>();

        if (matriz == null || matriz.length == 0){
            return resultado;
        }

        int cima = 0;
        int baixo = matriz.length - 1;
        int esquerda = 0;
        int direita = matriz[0].length - 1;

        while (cima <= baixo && esquerda <= direita){

            //movendo da esquerda para a direita na linha de cima
            for (int i = esquerda; i <= direita; i++){
                resultado.add(matriz[cima][i]);
            }
            cima++;

            //movendo de cima para baixo na coluna da direita
            for (int i = cima; i <= baixo; i++){
                resultado.add(matriz[i][direita]);
            }
            direita--;

            //movendo da direita para a esquerda na linha de baixo
            if (cima <= baixo){
                for (int i = direita; i >= esquerda;i--){
                    resultado.add(matriz[baixo][i]);
                }
                baixo--;
            }

            //movendo de baixo para cima na coluna da esquerda
            if (esquerda <= direita){
                for (int i = baixo; i >= cima; i--){
                    resultado.add(matriz[i][esquerda]);
                }
                esquerda++;
            }
        }

        return resultado;

    }


    public static void main(String[] args) {

        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matriz2 = {
                {1, 2, 3},
                {4, 10, 12},
                {6, 7, 33}
        };

        int[][] matriz3 = {
                {1, 2, 3, 1},
                {4, 5, 6, 4},
                {7, 8, 9, 7},
                {7, 8, 9, 7}
        };

        int[][] matriz4 = {
                {1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26, 27, 28},
                {29, 30, 31, 32, 33, 34, 35}
        };

        System.out.println(snail(matriz1)); // [1, 2, 3, 6, 9, 8, 7, 4, 5]
        System.out.println(snail(matriz2)); // [1, 2, 3, 12, 33, 7, 6, 4, 10]
        System.out.println(snail(matriz3)); // [1, 2, 3, 1, 4, 7, 7, 9, 8, 7, 7, 4, 5, 6, 9, 8]
        System.out.println(snail(matriz4)); // [1, 2, 3, 4, 5, 6, 7, 14, 21, 28, 35, 34, 33, 32,
                                            // 31, 30, 29, 22, 15, 8, 9, 10, 11, 12, 13, 20, 27,
                                            //26, 25, 24, 23, 16, 17, 18, 19]
    }

}