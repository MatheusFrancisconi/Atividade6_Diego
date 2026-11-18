public class Atividade4 {
    public static void main(String[] args) {
        int[][] m = new int[2][3];
        int quantidadePares = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = Integer.parseInt(
                        IO.readln("Digite o valor de [" + i + "][" + j + "]: ")
                );

                if (m[i][j] % 2 == 0) {
                    quantidadePares++;
                }
            }
        }
        System.out.println("Quantidade de pares: " + quantidadePares);
    }
}