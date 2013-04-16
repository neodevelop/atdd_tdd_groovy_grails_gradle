package com.synergyj

class CalculadoraService {

  def suma(Integer a, Integer b) {
    (a ?: 0) + (b ?: 0)
  }
}
