package com.synergyj

import geb.spock.GebSpec
import spock.lang.Unroll

class SumaFunctionalSpec extends GebSpec {
  def "La suma de dos números"(){
    given : "Navego a la página de Suma"
      to SumaPage
    and : "Introduzo los números 67 y 89"
      operando1 << "67"
      operando2 << "89"
    when : "Presiono el boton de sumar"
      sumar.click()
      waitFor { resultado }
    then : "Debo de ver 156 como el resultado"
      assert resultado.text() == "156"
  }

  @Unroll("Al ingresar #a + #b el resultado que debo ver es #c")
  def "Calcular la suma de dos números cualquiera"(){
    given : "Navego a la página de Suma"
      to SumaPage
    and : "Introduzo los números a y b"
      operando1 << a
      operando2 << b
    when : "Presiono el boton de sumar"
      sumar.click()
      waitFor { resultado }
    then : "Debo de ver c como el resultado"
      assert resultado.text() == c
    where : "El conjunto de valores es..."
      a     | b     || c
      "10"  | "11"  || "21"
      "20"  | "30"  || "50"
      "90"  | "9"   || "99"
  }
}
