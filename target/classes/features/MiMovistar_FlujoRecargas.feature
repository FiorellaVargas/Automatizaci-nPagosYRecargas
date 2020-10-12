Feature: Mi Movistar Flujo de Recargas

  @Test_1
  Scenario Outline: Generación de TOKEN URL

    Given se genera la URL mediante el API_TEST_recargas

    Examples:
      | caso_prueba |
      |           1 |

  @Test_2
  Scenario Outline: Recargas en Mi Movistar (Ingresando URL manualmente en Excel)

    Given se ingresa en la URL el token generado "<caso_prueba>"
    And se ingresa el numero celular "<caso_prueba>"
    And monto a recargar "<caso_prueba>"
    And se da click en el boton Continuar
    When se ingresa el email "<caso_prueba>" y se da click en continuar
    And se ingresa el numero de tarjeta "<caso_prueba>"
    And se ingresa el mes de vencimiento "<caso_prueba>"
    And se ingresa el anio de vencimiento "<caso_prueba>"
    And se ingresa el codigo de verificacion "<caso_prueba>"
    And se da click en el boton Pagar
    Then se verifica que se hizo la recarga correcta.

    Examples:
      | caso_prueba |
      |           1 |


  @Test_3
  Scenario Outline: Recargas en Mi Movistar Completo (Generando automáticamente Token URL)

    Given se genera la URL mediante el API_TEST_recargas
    Given se ingresa en la URL el token generado "<caso_prueba>"
    And se ingresa el numero celular "<caso_prueba>"
    And monto a recargar "<caso_prueba>"
    And se da click en el boton Continuar
    When se ingresa el email "<caso_prueba>" y se da click en continuar
    And se ingresa el numero de tarjeta "<caso_prueba>"
    And se ingresa el mes de vencimiento "<caso_prueba>"
    And se ingresa el anio de vencimiento "<caso_prueba>"
    And se ingresa el codigo de verificacion "<caso_prueba>"
    And se da click en el boton Pagar
    Then se verifica que se hizo la recarga correcta.

    Examples:
      | caso_prueba |
      |           1 |

  @Test_4
  Scenario Outline: Recargas en Mi Movistar (Ingresando URL manualmente en Excel)
    Given se genera la URL mediante el API_TEST_recargas  
    Given se ingresa en la URL el token generado "<caso_prueba>"
    And se ingresa el numero celular "<caso_prueba>"
    And monto a recargar "<caso_prueba>"
    And se da click en el boton Continuar
    When se ingresa el email "<caso_prueba>" y se da click en continuar
    And se ingresa el numero de tarjeta "<caso_prueba>"
    And se ingresa el mes de vencimiento "<caso_prueba>"
    And se ingresa el anio de vencimiento "<caso_prueba>"
    And se ingresa el codigo de verificacion "<caso_prueba>"
    And se selecciona la opción guardar tarjeta "<caso_prueba>"
    And se da click en el boton Pagar
    Then se verifica que se hizo la recarga correcta.

    Examples:
      | caso_prueba |
      |           1 |

  @Test_5
  Scenario Outline: Recargas en Mi Movistar (Ingresando URL manualmente en Excel)

    Given se ingresa en la URL el token generado "<caso_prueba>"
    And se ingresa el numero celular "<caso_prueba>"
    And monto a recargar "<caso_prueba>"
    And se da click en el boton Continuar
    When se ingresa el email "<caso_prueba>" y se da click en continuar
    And se selecciona la opción pagar con tarjeta guardada "<caso_prueba>"
    Then se verifica que se hizo la recarga correcta.

    Examples:
      | caso_prueba |
      |           1 |

  @Test_6
  Scenario Outline: Recargas en Mi Movistar (Ingresando URL manualmente en Excel 4 veces seguidas)

    Given se ingresa en la URL el token generado "<caso_prueba>"
    And se ingresa el numero celular "<caso_prueba>"
    And monto a recargar "<caso_prueba>"
    And se da click en el boton Continuar
    When se ingresa el email "<caso_prueba>" y se da click en continuar
    And se ingresa el numero de tarjeta "<caso_prueba>"
    And se ingresa el mes de vencimiento "<caso_prueba>"
    And se ingresa el anio de vencimiento "<caso_prueba>"
    And se ingresa el codigo de verificacion "<caso_prueba>"
    And se da click en el boton Pagar
    Then se verifica que se hizo la recarga correcta.

    Examples:
      | caso_prueba |
      |           1 |
      |           2 |
      |           3 |
      |           4 |

    @Test7
    Scenario Outline: Bloqueo Por Tarjeta Maximo 3 exitosas (Ingresando URL manualmente en Excel 4 veces seguidas)

      Given se ingresa en la URL el token generado "<caso_prueba>"
      And se ingresa el numero celular "<caso_prueba>"
      And monto a recargar "<caso_prueba>"
      And se da click en el boton Continuar
      When se ingresa el email "<caso_prueba>" y se da click en continuar
      And se ingresa el numero de tarjeta "<caso_prueba>"
      And se ingresa el mes de vencimiento "<caso_prueba>"
      And se ingresa el anio de vencimiento "<caso_prueba>"
      And se ingresa el codigo de verificacion "<caso_prueba>"
      And se da click en el boton Pagar
      Then se verifica que se hizo la recarga correcta.

      Examples:
        | caso_prueba |
        |           1 |
        |           2 |
        |           3 |
        |           4 |

  @Test_8
  Scenario Outline: Recargas en Mi Movistar Completo seleccionando el monto de S/5 (Generando automáticamente Token URL)

    Given se genera la URL mediante el API_TEST_recargas
    Given se ingresa en la URL el token generado "<caso_prueba>"
    And se ingresa el numero celular "<caso_prueba>"
    And se selecciona la opcion de S/5
    And se da click en el boton Continuar
    When se ingresa el email "<caso_prueba>" y se da click en continuar
    And se ingresa el numero de tarjeta "<caso_prueba>"
    And se ingresa el mes de vencimiento "<caso_prueba>"
    And se ingresa el anio de vencimiento "<caso_prueba>"
    And se ingresa el codigo de verificacion "<caso_prueba>"
    And se da click en el boton Pagar
    Then se verifica que se hizo la recarga correcta.

    Examples:
      | caso_prueba |
      |           1 |