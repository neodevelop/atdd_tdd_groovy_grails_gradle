package com.synergyj

import grails.test.mixin.*
import org.junit.*
import spock.lang.Specification
import spock.lang.Unroll

@TestFor(CalculadoraService)
class CalculadoraServiceSpec extends Specification {

  def "La suma de 10 + 11 debe ser 21"(){
    when:
      def r = service.suma(10,11)
    then:
      assert r == 21
  }

  @Unroll("La operación #a + #b es igual a #c")
  def "La operación a + b es igual a c"(){
    when:
      def r = service.suma(a,b)
    then:
      assert r == c
    where:
      a   | b   | c
      21  | 22  | 43
      3   | 7   | 10
      65  | 9   | 74
      null| null| 0
  }
}
