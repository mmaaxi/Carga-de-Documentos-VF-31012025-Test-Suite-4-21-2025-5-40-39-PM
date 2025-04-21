Feature: Validar control de acceso en carga de documentos

  Scenario: Impedir acceso a usuario no autorizado
    Given el usuario está en la página de login
    When el usuario inicia sesión con credenciales no autorizadas
    Then el sistema muestra un mensaje de error de permisos insuficientes

  Scenario: Bloquear acceso al módulo de carga
    Given el usuario no autorizado está logueado
    When intenta acceder al módulo de carga de documentos
    Then el sistema no muestra la opción de carga y redirige al usuario

  Scenario: Validar que no se registren intentos de carga no autorizados
    Given el usuario no autorizado ha intentado cargar un documento
    Then no se registra actividad de carga no autorizada en la base de datos