//package leetcode.stack.q224;
//
//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//import leetcode.stack.q224.BasicCalculator;
//
//public class BasicCalculatorTests {
//  @Test
//  public void testAddition() {
//    BasicCalculator calculator = new BasicCalculator();
//    assertEquals(calculator.calculate("1+2"), 3);
//  }
//
//  @Test
//  public void testSubtraction() {
//    BasicCalculator calculator = new BasicCalculator();
//    assertEquals(calculator.calculate("5-2"), 3);
//  }
//
//  @Test
//  public void testMultiplication() {
//    BasicCalculator calculator = new BasicCalculator();
//    assertEquals(calculator.calculate("2*5"), 10);
//  }
//
//  @Test
//  public void testDivision() {
//    BasicCalculator calculator = new BasicCalculator();
//    assertEquals(calculator.calculate("10/2"), 5);
//  }
//
//  @Test
//  public void testMultipleOperations() {
//    BasicCalculator calculator = new BasicCalculator();
//    assertEquals(calculator.calculate("5+10-3*2"), 14);
//  }
//
//  @Test
//  public void testParenthesis() {
//    BasicCalculator calculator = new BasicCalculator();
//    assertEquals(calculator.calculate("2+(5*3)"), 17);
//  }
//
//  @Test
//  public void testNegativeNumbers() {
//    BasicCalculator calculator = new BasicCalculator();
//    assertEquals(calculator.calculate("-2+5"), 3);
//  }
//
//  @Test
//  public void testDecimalNumbers() {
//    BasicCalculator calculator = new BasicCalculator();
//    assertEquals(calculator.calculate("5.5+2.5"), 8.0);
//  }
//
//  @Test
//  public void testZeroDivisor() {
//    BasicCalculator calculator = new BasicCalculator();
//    assertThrows(ArithmeticException.class, () -> calculator.calculate("10/0"));
//  }
//
//  @Test
//  public void testInvalidInput() {
//    BasicCalculator calculator = new BasicCalculator();
//    assertThrows(IllegalArgumentException.class, () -> calculator.calculate("abc+def"));
//  }
//
//  @Test
//  public void testEdgeCases() {
//    BasicCalculator calculator = new BasicCalculator();
//    assertEquals(calculator.calculate("0+2"), 2);
//    assertEquals(calculator.calculate("1+0"), 1);
//    assertEquals(calculator.calculate("2*-3"), -6);
//  }
//}