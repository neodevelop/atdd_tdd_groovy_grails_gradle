package com.synergyj

class CalculadoraController {

  def calculadoraService

  def suma() {
    [ resultado : calculadoraService.suma(params.int('operando1'),params.int('operando2')) ]
  }
}
