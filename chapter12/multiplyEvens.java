public int multiplyEvens(int n) {
    if(n <= 0)
        throw new IllegalArgumentException();

    if(n == 1)
        return 2;

    return 2 * n * multiplyEvens(n-1);
}
