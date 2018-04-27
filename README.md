# Async Demo Listener #

Este nodo es un escucha de las peticiones del cliente ([async-demo-caller](https://github.com/OvejaNegra/async-demo-caller))
Ambos se comunican entre si mediante peticiones REST.

Para cada una de las peticiones que le llegan, le asigna un tiempo de espera de forma aleatoria, ejecutando esta espera de manera asíncrona, respondiendo inmediatamente cuando llega la solicitud al nodo que ejecuta la acción

## Configuración

Sólo puede modificarse el puerto en el que se ejecuta (por default, 8080). Esto, modificando el parámetro "server.port=8080" de application.properties (src/main/resources/application.properties)

## Instalación

* Clonar las fuentes del respositorio
* Ejecutar: `mvn clean install`
	
## Iniciar
	mvn spring-boot:run