package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.function.Executable;

class EuclidTest {

  @org.junit.jupiter.api.Test
  void gcdInt() {
    assertAll(
        () -> assertEquals(6791, Euclid.gcd(53_777_929, 38_593_253)),
        () -> assertEquals(6791, Euclid.gcd(38_593_253, 53_777_929)),
        () -> assertEquals(6791, Euclid.gcd(53_777_929, 38_593_253)),
        () -> assertEquals(6791, Euclid.gcd(38_593_235, 0)),
        () -> assertEquals(6791, Euclid.gcd(38_593_235, 0)),
        () -> assertEquals(53_777_929, Euclid.gcd(53_777_929, 0)),
        () -> assertEquals(53_777_929, Euclid.gcd(0, 53_777_929)),
        () -> assertEquals(1, Euclid.gcd(1, 53_777_929)),
        () -> assertEquals(1, Euclid.gcd(53_777_929, 1))
    );

  }

  @org.junit.jupiter.api.Test
  void gcdLong() {
    assertAll(
        () -> assertEquals(6791, Euclid.gcd(53_777_929L, 38_593_253)),
        () -> assertEquals(6791, Euclid.gcd(38_593_253L, 53_777_929)),
        () -> assertEquals(6791, Euclid.gcd(53_777_929L, 38_593_253)),
        () -> assertEquals(6791, Euclid.gcd(38_593_235L, 0)),
        () -> assertEquals(6791, Euclid.gcd(38_593_235L, 0)),
        () -> assertEquals(53_777_929, Euclid.gcd(53_777_929L, 0)),
        () -> assertEquals(53_777_929, Euclid.gcd(0L, 53_777_929)),
        () -> assertEquals(1, Euclid.gcd(1L, 53_777_929)),
        () -> assertEquals(1, Euclid.gcd(53_777_929L, 1))
    );

  }
}