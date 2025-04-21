Feature: Validar carga de documento corrupto

  Scenario: El sistema debe manejar la carga de documentos corruptos adecuadamente
    Given el usuario ha accedido al módulo de carga
    When el usuario selecciona un archivo PDF corrupto
    And el usuario intenta cargar el archivo
    Then el sistema rechaza el archivo y notifica del error en el documento