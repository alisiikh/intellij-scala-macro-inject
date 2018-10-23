package com.alisiikh.injector

import org.scalatest.{FreeSpec, Matchers}

class FooSpec extends FreeSpec with Matchers {

  @magic
  case class Harry(name: String)

  Harry("Potter")
}
