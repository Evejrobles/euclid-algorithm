package edu.cnm.deepdive;

public class Euclid {

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    a = Math.abs(a);
    b = Math.abs(b);
    while (a != 0) {
      if (b > a) {
        b %= a;
      } else if (b == 0) {
      } else {
        a %= b;
      }
    }
    return b;
  }

  public static long gcd(long a, long b) {
    if (b == 0) {

    }
    a = Math.abs(a);
    b = Math.abs(b);
    while (a != 0) {
      if (b > a) {
        b %= a;
      } else if (b == 0) {
      } else {
        a %= b;
      }
    }
    return b;
  }
}
