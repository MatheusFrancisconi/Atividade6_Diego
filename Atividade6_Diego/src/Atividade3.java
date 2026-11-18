public class Atividade3 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = Integer.parseInt(
                        IO.readln("Digite o valor de [" + i + "][" + j + "]: ")
                );
            }
        }

        int maior = m[0][0];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
        }
        System.out.println("Maior valor: " + maior);
    }
}