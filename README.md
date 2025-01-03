# PROYECTO DE BACK-END JAVA 

- Este programa mapea una tabla de una base de datos applicando ORM de JPA en java.
- Para la creacion de este proyecto se uso dependencia del framework de Spring Boot.
- La arquitectura que se pretende usar es MVC.


### Tecnologías usadas.

![](Imagenes/java-spring.jpg)

## Estructura MVC 
![](Imagenes/Arquitectura%20MVC.png)

El patrón Modelo-Vista-Controlador (MVC) es una arquitectura de software fundamental que se utiliza para estructurar aplicaciones, especialmente en el desarrollo web. Este patrón fue introducido por Trygve Reenskaug en 1979 y ha evolucionado para convertirse en un estándar en el diseño de aplicaciones, permitiendo una separación clara de responsabilidades y facilitando el mantenimiento y la escalabilidad del software.

### Componentes del Patrón MVC

#### Modelo:
El modelo representa la lógica de negocio y los datos de la aplicación. Es responsable de gestionar los datos, las reglas de negocio y la lógica que define cómo se accede a esos datos. En aplicaciones Java, el modelo puede estar compuesto por clases que representan entidades del dominio, como Cliente, Factura, etc.14.
El modelo no tiene conocimiento de la vista o el controlador; su única responsabilidad es manejar los datos y proporcionar métodos para acceder y manipularlos.

#### Vista:
La vista es la capa encargada de la presentación de los datos al usuario. Se ocupa de mostrar la información contenida en el modelo y puede ser implementada utilizando tecnologías como JSP, HTML o frameworks modernos como Thymeleaf23.
La vista se actualiza automáticamente cuando el modelo cambia, lo que permite una experiencia de usuario más dinámica y responsiva.

#### Controlador:
El controlador actúa como intermediario entre el modelo y la vista. Recibe las entradas del usuario (por ejemplo, a través de formularios), procesa esas entradas (posiblemente modificando el modelo) y determina qué vista debe ser presentada al usuario34.
El controlador contiene la lógica que decide cómo responder a las acciones del usuario, gestionando las interacciones y actualizando la vista según sea necesario.

