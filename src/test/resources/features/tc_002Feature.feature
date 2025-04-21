Feature: Validar carga de documento en formato no soportado

  Scenario: Intentar cargar un documento en formato no soportado
    Given que el usuario está en el módulo de carga de documentos
    When el usuario selecciona un archivo en formato DOCX
    Then el sistema debe mostrar un mensaje de error indicando que el formato no es soportado
    When el usuario intenta cargar el archivo rechazado
    Then el sistema debe detener la carga y solicitar un archivo válido