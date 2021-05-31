# Proyecto conexión de dos conetenedores docker con sockets

## Pasos para ejecutar el proyecto: usando la terminal

### 1. Crear las imagenes del servidor y del cliente:

	- estando en la carpeta servidor: docker build -t img_socket_servidor:v1 -f /servidor/Dokerfile .
	- estando en la carpeta cliente: docker build -t img_socket_cliente:v1 -f /servidor/Dokerfile .

### 2. crear los contenedores del servidor y del cliente: crearlos en dos ventanas de terminal separadas

	- docker run -it --rm --name c_socket_servidor img_socket_servidor:v1

		-- este comando crea un contenedor interactivo, que se removera cuando se termine de usarlo.
		-- estando en la terminal del contenedor servidor, ingresar el siguiente comando: java Servidor
		-- se debe ingresar el puerto por donde escuchara el servidor

	- necesitamos saber la direccion ip del contenedor servidor en el brige que crea dodker para que se 
		puedan comunicar los contenedores:

		-- docker inspect c_socket_servidor | grep IPAddress

	- docker run -it --rm --name c_socket_cliente img_socket_cliente:v1

		-- este comando crea un contenedor interactivo, que se removera cuando se termine de usarlo.
		-- estando en la terminal del contenedor cliente, ingresar el siguiente comando: java Cliente
		-- se debe ingresar la ip del servidor y el mismo puerto que se ingreso en el servidor

### 3. ya esta lista la comunicacion via socket de ambos contenedores.		
