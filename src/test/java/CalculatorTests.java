import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import junit.framework.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

  Calculator calculator;

  @BeforeEach
  void setup() {
    System.out.println("Setup");
    calculator = new Calculator();
  }

  @AfterEach
  void teardown() {
    System.out.println("Teardown");
  }

  @Test
  @DisplayName("1 + 2 = 3")
  void testUnPlusDeuxEgalTrois() {
    // 1 + 2 = 3


    // Assert
    assertEquals(3, calculator.add(1,2), "1 + 2 equal 3");
  }

  @Test
  void testMax() {
    int max = Integer.MAX_VALUE;
    assertEquals(-2147483648, calculator.add(max, 1));
  }

  @ParameterizedTest
  @CsvSource({
      "1, 2, 3",
      "0, 0, 0",
      "-1, 1, 0",
      "50, 60, 110"
  })
  void testAdd(int a, int b, int expectedResult) {

    assertEquals(expectedResult, calculator.add(a,b));
  }

  @Test
  void testNull() {

    Integer a = null;
    assertThrows(NullPointerException.class, () -> {
      calculator.add(0, a);
    });
  }

  @Test
  void testDivision() {
    assertEquals(0.5, calculator.divide(1, 2));
  }

  @Test
  void testDivisionDelta() {
    assertEquals(0.333, calculator.divide(1, 3), 0.001);
  }

  @Test
  void testDivisionMAX() {
    assertEquals(Double.MAX_VALUE, calculator.divide(1, 0), 0.001);
  }

  @Test
  void testDivisionMIN() {
    assertEquals(Double.MIN_VALUE, calculator.divide(-1, 0), 0.001);
  }

  @Test
  void testDivisionZeroByZero() {
    assertEquals(0, calculator.divide(0, 0), 0.001);
  }
}
