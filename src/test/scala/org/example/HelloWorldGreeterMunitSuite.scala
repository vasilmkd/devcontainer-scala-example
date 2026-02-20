package org.example

import munit.FunSuite

class HelloWorldGreeterMunitSuite extends FunSuite:
  test("HelloWorldGreeter should greet with Hello, world!"):
    val actual = HelloWorldGreeter.greeting
    val expected = "Hello, world!"
    assertEquals(actual, expected)

  test("failing test"):
    assertNotEquals(1 + 1, 2)
