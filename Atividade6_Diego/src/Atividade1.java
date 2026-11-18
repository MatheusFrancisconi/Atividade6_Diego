public class Atividade1 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = Integer.parseInt(
                        IO.readln("Digite o valor de [" + i + "][" + j + "]: ")
                );
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}