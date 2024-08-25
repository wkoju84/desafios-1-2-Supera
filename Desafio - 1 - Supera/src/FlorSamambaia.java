public class FlorSamambaia {


    public static String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2) {

        // Calcula a distância entre os centros dos círculos
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Verifica se o círculo desenhado engloba o círculo da flor
        if (r1 >= r2 && distancia <= (r1 - r2)) {
            return "RICO";
        } else {
            return "MORTO";
        }
    }

    public static void main(String[] args) {

        // Exemplo de teste

        System.out.println(tentativaDesenhar(5, 0, 0, 2, 2, 2)); // Deve retornar "RICO"
        System.out.println(tentativaDesenhar(3, 0, 0, 3, 4, 4)); // Deve retornar "MORTO"
    }
}