package javagems.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Testing Foo!
 */
public class FooTest extends TestCase {
  private Foo aFoo;
  protected void setUp() {
    aFoo = new Foo("hello, world");
  }
  

  public void testBarWillReturnProvidedBaz() {
    assertEquals("hello, world", aFoo.getBaz());
  }

  /*
   * Making the tests go
   */
  public static Test suite() { return new TestSuite(FooTest.class); }
  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
