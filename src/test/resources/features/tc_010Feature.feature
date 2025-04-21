Feature: Validar rendimiento de carga bajo múltiples solicitudes concurrentes

  Scenario: Simular múltiples usuarios cargando documentos simultáneamente
    Given el sistema está preparado para aceptar cargas concurrentes
    When simulo 50 usuarios intentando cargar documentos al mismo tiempo
    Then el sistema procesa cada solicitud sin colapsar y mantiene la estabilidad
    And el sistema muestra tiempos de respuesta dentro del parámetro aceptable sin errores críticos
    And no se registra ningún fallo debido a la saturación y se valida el correcto balanceo de carga