package com.synergyj

import geb.*

class SumaPage extends Page {
  static url = "calculadora/suma"

  static content = {
    operando1 { $("form#calculadora").find("input#operando1") }
    operando2 { $("form#calculadora").find("input#operando2") }
    sumar { $("form#calculadora").find("input[type=submit]") }
    resultado { $("h3") }
  }

  static at = {
    $("h1").text() == "Súper Suma!!!"
  }

}