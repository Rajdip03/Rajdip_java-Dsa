class nth_term_series {
    public static void main(String[] args) {
        int n = 10;
        int series[] = new int[10];
        series[0] = 1;
        series[1] = 0;
        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2] + i * 10;
        }
        for (int result : series) {
            System.out.print(result + " ");
        }
    }
}