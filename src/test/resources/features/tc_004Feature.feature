Feature: Validar integridad de metadatos asociados al documento

  Scenario: Cargar documento con metadatos y verificar la integridad
    Given que accedo a la sección de carga de documentos
    When selecciono un archivo PDF junto con metadatos requeridos como título, descripción y fecha
    And ejecuto la carga del archivo
    Then el documento se carga correctamente y los metadatos se visualizan en la consulta del documento