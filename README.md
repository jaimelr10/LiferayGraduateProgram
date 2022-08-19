# LiferayGraduateProgram
Este proyecto contiene la __solución__ que ofrezco al __ejercicio propuesto por Liferay__.

El repositorio contiene el proyecto con el código desarrollado en __Java__ que resuelve el caso propuesto. La __carpeta /src__ contiene tanto el __código de la solución__ como algunos __tests__ que prueban la funcionalidad.


## El programa en funcionamiento
Lo primero que vemos cuando iniciamos el programa es el menú, donde podemos elegir entre tres opciones.
![image](https://user-images.githubusercontent.com/40394495/185500876-0cbeecd7-63af-4321-9f51-c740f9a998d7.png)

Dependiendo de cuál elijamos, el programa tendrá una respuesta u otra:
* Con la primera opción comprobamos que las entradas propuestas en el enunciado ofrecen las soluciones esperadas.

![image](https://user-images.githubusercontent.com/40394495/185501202-ccbbb323-40e6-4424-a446-a4c05a5fce12.png)

* La segunda opción nos permite añadir a nosotros mismos los productos, eligiendo los atributos de estos. Una vez se dejen de añadir, se genera el ticket.

![image](https://user-images.githubusercontent.com/40394495/185501818-b9a3d399-e29f-40a1-920f-1daca93e76d1.png)

* La tercera opción nos despide y cierra el programa.

![image](https://user-images.githubusercontent.com/40394495/185502136-497f7fc2-ad76-4e88-9b1b-2c7dc12952f8.png)

## Estrategia de pruebas
La estrategia de pruebas nos permite __asegurar que el código queda probado de una forma metodológica__ y __minimiza la aparición de posibles errores__.

Primero habría que __definir qué probar__. En nuestro caso, las __clases LiferayGraduateProgramExercise, Product__ y __Ticket__.
Hay muchos tipos de __test__, como pueden ser los __unitarios__, de __integración__, de __usabilidad__, etc.

Para este caso, podemos utilizar __tests unitarios__ para __comprobar fragmentos de código de forma individual__, así como __tests de integración__ para comprobar que __las distintas partes del programa funcionan bien de forma conjunta__. Los __tests deberían probar tanto casos de éxito como casos de fallo__, así como, las __distintas ramas que puede tomar el programa (como puede pasar cuando hay un condicional)__.

Teniendo esto en cuenta, se han definido una serie de tests que prueban algunos fragmentos de código:

* Sobre la clase __LiferayGraduateProrgamExercise__ se ha probado un método que __comprueba si la entrada de teclado es "y", "n", u otro caso__. En el código hay un __condicional__, por lo que se han probado los __posibles casos en los que este puede entrar__.

![image](https://user-images.githubusercontent.com/40394495/185634237-be8d7b82-f5a2-40d7-913f-26b80907f3f1.png)

* Sobre la clase __Product__ se han probado __dos casos__. El primero, ha sido la prueba de la __función__ utilizada para __redondear__, con la que se ha comprobado que para las distintas franjas descritas en las pruebas (0.00, 0.02, 0.05, 0.06, 0.09, 0.1, 0.99), el programa funciona bien. El segundo caso de prueba ha estado orientado a __comprobar que los productos calculen bien la cantidad de impuestos a pagar sea cual sea su valor en las variables isBasicTaxFree y isImported__
![image](https://user-images.githubusercontent.com/40394495/185636020-bca044db-a137-4c7a-9fe5-9df61c875869.png)
![image](https://user-images.githubusercontent.com/40394495/185636049-4297e4c6-dd3c-40b8-af33-ab3f767bd168.png)

* Por último, para la clase __Ticket__ se ha comprobado que los __costes de un ticket se calculan bien__.

![image](https://user-images.githubusercontent.com/40394495/185636619-324d6a00-bfd7-4cd7-baa3-240b13b545e6.png)

* Existen más casos de prueba posibles, como qué pasa si no hay Productos en un Ticket y se calcula su precio, que ocurre si los tipos de dato no son los esperados, la funcionalidad entera de añadir productos a una lista y calcular el precio, etc.

Si las pruebas pasan correctamente, y el porcentaje de cobertura iguala o supera al pedido por la empresa, se puede decir que el programa ha pasado las pruebas.
Para este sencillo caso de prueba se han pasado las 12 pruebas, y se ha llegado a una cobertura del 54,5% en el proyecto y un 31,8% en la carpeta que contiene el código.

![image](https://user-images.githubusercontent.com/40394495/185638212-9410dfcd-5945-4e61-9ceb-6b2589d2f588.png)
