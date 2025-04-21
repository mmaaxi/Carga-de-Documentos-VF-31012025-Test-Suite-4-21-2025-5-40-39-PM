Feature: Validación de carga de documento en formato PDF

  Scenario: Carga exitosa de documento PDF
    Given el usuario accede al módulo de carga de documentos
    When el usuario selecciona un archivo PDF válido
    And el usuario presiona el botón de 'Cargar'
    Then el documento se carga exitosamente y se muestra un mensaje de confirmación