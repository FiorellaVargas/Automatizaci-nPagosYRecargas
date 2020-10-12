Feature: Mi Movistar Flujo de Pago de Recibo

  @Test_1
  Scenario Outline: Generación de TOKEN URL

    Given se genera la URL mediante el API_TEST_recargas

    Examples:
      | caso_prueba |
      |           1 |
