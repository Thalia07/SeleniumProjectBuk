#language: es

@Comercio
Característica: Validar el correcto funcionamiento de Product Store
  COMO usuario
  QUIERO realizar el flujo de inicio de sesión
  PARA poder realizar compras
@Login
Escenario: Realizar inicio de sesión exitoso
  Dado que el usuario abre la pagina web
  Cuando ingresa sus credenciales
  Entonces se visualiza el dashboard y se valida el usuario