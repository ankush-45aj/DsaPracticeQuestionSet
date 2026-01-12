package backtracking;

public class maze {
    public static void main(String[] args) {
        int eR = 5;
        int eC = 5;
        int sr = 1;
        int sc = 1;
        int a = maze(sr, sc, eR, eC);
        System.out.println(a);
    }

    private static int maze(int sr, int sc, int eR, int eC) {
        if (sr > eR || sc > eC)
            return 0;
        if (eR == sr || sc == eC) {
            return 1;

        }
        int downWays = maze(sr + 1, sc, eR, eC);
        int rightWays = maze(sr, sc + 1, eR, eC);
        int totalWays = downWays + rightWays;
        return totalWays;

    }
}
