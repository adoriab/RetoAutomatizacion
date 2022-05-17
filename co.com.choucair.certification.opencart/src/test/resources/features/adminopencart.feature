#Autor: Ana Maria Doria

@PruebaFuncional
Feature: Verificar el optimo funcionamiento del modulo de Clientes
  Yo como usuario de OpenCart
  Quiero ingresar a la aplicacion web
  Para obtener informacion sobre los clientes.

  @BusquedaCliente
  Scenario Outline:Busqueda de cliente exitosa
    Given Ana ingresa a OpenCart
    And valida que se encuentra en el login de la app
    When ingresa sus credenciales
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    And Navega por el Menu
      | menu   | submenu   |
      | <menu> | <submenu> |
    And Busca un Cliente por Customer name
      | customername   |
      | <customername> |
    Then Valida la IP de conexion
      | ip   |
      | <ip> |

    Examples:
      | usuario | contrasena | menu     | submenu  | customername              | ip             |
      | demo    | demo       | Customer | Customer | Ana Maria Colorado Bedoya | 172.69.206.146 |
      | demo    | demo       | Customer | Customer | Alvaro Espinoza           | 172.70.82.30   |

  @AgregarClienteFallido
  Scenario Outline: Registro de cliente fallido
    Given Ana ingresa a OpenCart
    And valida que se encuentra en el login de la app
    When ingresa sus credenciales
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    And Navega por el Menu
      | menu   | submenu   |
      | <menu> | <submenu> |
    And Agrega un cliente
      | firstname   | lastname   | email   | telephone   | password   | confirm   |
      | <firstname> | <lastname> | <email> | <telephone> | <password> | <confirm> |
    Then Valida que no se pueden realizar registros

    Examples:
      | usuario | contrasena | menu     | submenu  | firstname | lastname | email           | telephone  | password | confirm |
      | demo    | demo       | Customer | Customer | Luis      | Murillo  | luism@gmail.com | 3238975645 | 12345    | 12345   |

  @EliminarClienteFallido
  Scenario Outline: Eliminar un cliente de forma fallida
    Given Ana ingresa a OpenCart
    And valida que se encuentra en el login de la app
    When ingresa sus credenciales
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    And Navega por el Menu
      | menu   | submenu   |
      | <menu> | <submenu> |
    And Busca un Cliente por Customer name
      | customername   |
      | <customername> |
    And Selecciona el cliente a eliminar
    Then Valida que no se puede eliminar el cliente

    Examples:
      | usuario | contrasena | menu     | submenu  | customername |
      | demo    | demo       | Customer | Customer | qwerty       |