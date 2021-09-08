## Java / spring boot (servicio rest)

  
### Ejercicio 2:

Basado en una matriz de R x C, entregando coordenadas de X, Y, se debe sumar los valores hacia las coordenadas de origen (0,0).

Dominio Z = {0, 1, 2, 3, 4, …}  

El llenado de la matriz está dado por Z:

* cuando R = 1, completar fila con Z, si R > 1 entonces completar fila con: Z= Z + R –1

### Ejemplo:
Matriz R x C = 4, 3
Z = 2
X = 1
Y = 2

Por tanto, se obtiene la siguiente matriz:
		  C=1	C=2		C=3
R=1 	2 			2 			2
R=2 	3 			3 			3
R=3 	4 			4 			4
R=4 	5 			5 			5

Dada las coordenadas X e Y la matriz da como resultado 18:
			x0	x1
y0 		2 		2
y1 		3 		3
y2 		4 		4

### Para ejecución

El proyecto contiene 2 clases fundamentales:
1. cl.cellit.matriz.controller.MatrizController.java
1. cl.cellit.matriz.services.MatrizService.java

Para instalar dependencias 
**mvn install**

Se desarrolló con JDK 8

Para ejecutar el proyecto 
**./mvnw.cmd spring-boot:run**
 

Una vez ejecutado y corriendo el proyecto, se puede usar Postman o cualquier navegador web para probar

Con la url **http://localhost:8080/matriz/{R}/{C}/{Z}/{X}/{Y}**

### Descripción de parámetros
**R x C**	Son las dimensiones de la matriz
**X, Y** 	Son las coordenadas desde donde se suma hacia el origen
**Z**			Factor para la creación de la matriz

La API retornará como respuesta una estructura JSON.

Respuesta de ejemplo:
{
  "Suma": 18,
  "Matriz": {
    "R1": { "C1": 2, "C2": 2, "C3": 2  },
    "R2": { "C1": 3, "C2": 3, "C3": 3  }    
  }
}