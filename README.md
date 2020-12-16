Pasos para utilizar aplicacion:
1. Descargar tag

docker pull elivelze/calculadora:tag number
  
2. Crear contenedor de imagen
docker run -d  -p 4200:4200  --net=mynetwork imagen-id
  
3. Ingregar a aplicacion
http://server-ip:9080/swagger-ui.html
