package org.example

@main
def main(): Unit =
  val greeter: Greeter = HelloWorldGreeter
  println(greeter.greeting)
