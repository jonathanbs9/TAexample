Feature: Test Login

    Feature Description

Scenario: Login incorrecto
    Given Navego a la pantalla principal 
    When Ingreso email y password invalidos
    And Hago click en Login
    Then Obtengo acceso invalido

Scenario: Login correcto
    Given Navego a la pantalla principal
    When Ingreso email y password correctos
    And Hago click en Login 
    Then Obtengo acceso

Scenario: Login incorrecto - campo email vacio
    Given Navego a la pantalla principal
    When Ingreso contraseña
    And Hago click en Login
    Then Obtengo aceso invalido

Scenario:  Login incorrecto - campo contraseña vacia
    Given Navego a la pantalla principal
    When Ingreso email
    And Hago click en Login
    Then Obtengo aceso invalido

Scenario: Login incorrecto - campo contraseña < 6 caracteres
    Given Navego a la pantalla principal
    When Ingreso email correcto y contraseña con menos de 6 caracteres
    And Hago click en Login
    Then Obtengo aceso invalido