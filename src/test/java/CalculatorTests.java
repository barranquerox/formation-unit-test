import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

  @Test
  @DisplayName("1 + 2 = 3")
  void testUnPlusDeuxEgalTrois() {
    // 1 + 2 = 3
    Calculator calculator = new Calculator();

    // Assert
    assertEquals(3, calculator.add(1,2), "1 + 2 equal 3");
  }

  @Test
  void testMax() {
    Calculator calculator = new Calculator();

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
    Calculator calculator = new Calculator();
    assertEquals(expectedResult, calculator.add(a,b));
  }

  @Test
  void testNull() {
    Calculator calculator = new Calculator();
    Integer a = null;
    assertThrows(NullPointerException.class, () -> {
      calculator.add(0, a);
    });
  }
}
