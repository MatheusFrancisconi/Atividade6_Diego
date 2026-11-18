public class Atividade5 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = Integer.parseInt(
                        IO.readln("Digite o valor de [" + i + "][" + j + "]: ")
                );
            }
        }

        System.out.print("Diagonal principal: ");

        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i][i] + " ");
        }
        System.out.println();
    }
}