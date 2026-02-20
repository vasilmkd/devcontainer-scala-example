package org.example

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must.Matchers

class HelloWorldGreeterScalatestSuite extends AnyFunSuite with Matchers:
  test("HelloWorldGreeter should greet with Hello, world!"):
    val actual = HelloWorldGreeter.greeting
    val expected = "Hello, world!"
    actual must equal(expected)

  test("failing test"):
    (1 + 1) must not equal(2)
