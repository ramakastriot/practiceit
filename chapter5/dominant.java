boolean dominant(int a, int b, int c) {
  return Math.max(a, Math.max(b, c)) * 2 > a + b + c;
}
