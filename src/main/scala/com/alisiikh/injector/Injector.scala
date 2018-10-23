package com.alisiikh.injector

import org.jetbrains.plugins.scala.lang.psi.api.toplevel.typedef.ScTypeDefinition
import org.jetbrains.plugins.scala.lang.psi.impl.toplevel.typedef.SyntheticMembersInjector

class Injector extends SyntheticMembersInjector {
  override def injectFunctions(source: ScTypeDefinition): Seq[String] = {
    if (source.hasAnnotation("com.alisiikh.injector.magic")) {
      Seq("def castMagic: String = ???")
    } else {
      Seq("def omg: Unit = ???")
    }
  }
}