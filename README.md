**Calculadora:**
Proyecto que expone servicios para realizar las operaciones básicas Suma, Resta, Multiplicación y División de dos números.

**Requerimientos:**
*Java 8*
*Maven 3 +*

**Instalación desde repositorio:**
1. clonar repositorio
  *git clone elivelze/calculadora*
2. compilar
  >mvn clean install

Ejecución desde compilado
1. Localizar jar dentro de /tarjet
2. Ejecutar con java -jar calculadora-0.0.1-SNAPSHOT.jar

Ingresar a aplicación:
*http://your-ip:9080/swagger-ui.html*

**Swagger servicios Rest para calculadora**

1. Abrir en http://your-ip:8080/swagger-ui.html#/operaciones-controller

Se exponen los siguientes endpoint con su descripción de uso.
*/v1/division/
*/v1/multiplicacion/
*/v1/resta/
*/v1/suma/

**Generar Documentación del proyecto.**
Para poder obtener la documentación completa del proyecto y depencias se puede realizar con el siguiente comando.
>mvn site
generará la carpeta /site en /target donde al abrir el archivo index.html se obtendrá un sitio con toda la información del proyecto, clases y dependencias.

**Cobertura de pruebas unitarias y reporte**
Al ejecutar el comando de compilación se generará el reporte de cobertura dentro de
*/target/surefire-reports*


**Ejecución desde docker**
La aplicación está configurada para su ejecución desde docker lo cual hace aún mas sencilla su instalación siguiente los siguientes pasos
1. Crear imagen de docker
  >docker build -t operaciones-back .
2. Crear conentenedor apartir de imagen creada
  >docker run -d  -p 9080:9080  --net=mynetwork imagen-id
3. Ingregar a aplicacion
  http://your-ip:9080/swagger-ui.html
  
  
**Ejecución desde docker hub**
La aplicación también puede ser descargada desde el repo git hub elivelze/operacion siguiendo los siguientes pasos:
1. Descargar tag
  >docker pull elivelze/operacion:tag number
  
2. Crear contenedor de imagen
  >docker run -d  -p 9080:9080  --net=mynetwork imagen-id
  
3. Ingregar a aplicacion
  *http://server-ip:9080/swagger-ui.html*



**Quality Gates**
La aplicación tiene incorporado la capacidad de exportar el reporte de cobertura de pruebas unitarias a Sonar. Para realizar la ejecución del reporte en sonar ejecutar el siguiente comando.
>mvn sonar:sonar
Este generará el reporte y será enviado al sonar que se encuentre configurado en el pom, por default se puede consultar en:
*http:200.52.91.234:9001*

En sonar podemos realizar dos de las siguientes funciones
1. **Análisis de código** *La aplicación puede ser examinada clase por clase para análisis mejoras bugs o problemas en código.*
  *Código duplicado
  *Calificación global de fiabilidad apartir del número de bugs y severidad.
  *Calificación global de seguridad apartir del número de vulnerabilidades detectadas.
2. **Cobertura de pruebas** *
  *Reporte general del porcetaje de código cubierto en pruebas unitarias, esto es útil a la hora de poner el un porcetaje mínimo de cobertura en el Quality Gate.



