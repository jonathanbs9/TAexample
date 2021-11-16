Feature: Testear distintos escenario en la pagina de request.

Rule: Aca va la regla de negocio que quiero validar


Background: Accedo a la pagina principal
    Given Un usuario que accede a la pagina principal

#@Smoke
Scenario: Happy Path 1 - Obtengo Mis Solicitudes
    When Hago click en mis solicitudes
    Then Tengo una lista de mis solicitudes 

#@Smoke
Scenario: Happy Path 2 - Puedo ver una solicitud 
    When Hago click en mis solicitudes
    And Hago click en una solicitud determinada
    Then Puedo ver el detalle de una solicitud

@Smoke
Scenario: Alternative 1 - Error al crear solicitud (fecha de fin < fecha inicio)
    When Hago click en Crear Solicitud
    And Completo los campos correctamente e ingreso una fecha de finalizacion menor a la fecha de inicio
    And Hago click en Enviar Solicitud
    Then Espero un mensaje de error

Scenario: Alternative 1.2 - Error al crear solicitud (Descripcion vacía)
    When Hago click en Crear Solicitud
    And Ingreso una fecha de finalizacion menor a la fecha de inicio
    Then Espero un mensaje "Error al crear la solicitud"    
