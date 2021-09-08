# Trazo De Lineas Y Poligonos
Construir una aplicación en la que se pueda trazar la línea recta
que une dos puntos, que trace las líneas rectas que unan puntos sucesivos marcados con el
ratón y dado el valor del número de lados (n), dibujar el polígono correspondiente de n lados. 

-Importamos todas las librerias que utilizaremos para la creación de nuestro programa.
![image](https://user-images.githubusercontent.com/71079322/132070962-4e954679-a05b-4542-bb5f-6630850d6ee8.png)

# Clase Ejercicio_2C
-En esta parte inicia nuestra clase Ejercicio_2C en la cual implementamos la interfaz conocida con el nombre GLEventListener. Declaramos las variables que utilizaremos más adelante.

![image](https://user-images.githubusercontent.com/71079322/132544539-0355bd6a-a0ad-4178-93fa-3ce1b9a8eee4.png)

# Método Main
-Dentro de nuestro método main se encuentra algunas caraterísticas de nuestra pantalla, así como se crea un hilo para detener la animación cuando nuestra pantalla se cierre.

![image](https://user-images.githubusercontent.com/71079322/132072195-8fffe314-fb80-4b25-a61a-888e96e5f500.png)

-Podemos crear algunas accciones para el mouse, esto nos servira para cuando el usuario realice alguna acción en especifico, en este caso la accion que realizara es 
cuando el mouse realice alguna movida de acuerdo a los trazos que realice el usuario.

![image](https://user-images.githubusercontent.com/71079322/132072730-af4c86b9-7ef5-43a2-9ab4-2d6275a43175.png)

-En este método la acción del mouse se debe a un click y este volvera a solicitar el número de lados para nuestro polígono esperando un segundo, es por eso que manda a llamar al método reiniciar().

![image](https://user-images.githubusercontent.com/71079322/132102710-77ddb9f3-bc37-4668-ad23-b4c1b8c835e0.png)

-Y por último el método de cuando el mouse sea presionado, en este se ira contabilizando el numero de lados que se ingresaron.

![image](https://user-images.githubusercontent.com/71079322/132073307-b6713f52-c2b0-4bc1-b958-45264acbe5d8.png)

-Algunos métodos del mouse pero los cuales no cuentan con alguna operación.
![image](https://user-images.githubusercontent.com/71079322/132073336-6003d8ba-facd-415f-9e9c-e570fee6fcc0.png)

# Método init
-Este método es llamado por drawable inmediatamente después de que el contexto de OpenGL es inicializado. Puede ser utilizado para la inicialización de los gráficos de OpenGL que GLCanvas utilizará tales como el color de fondo, color de los objetos que se dibujarán.

![image](https://user-images.githubusercontent.com/71079322/132073411-0b7a1dbb-1f46-401d-8820-6158056dab47.png)

# Método display
-Este método es llamado por drawable para iniciar el renderizado de OpenGL a petición del usuario. Dentro de este método se incluirán los gráficos que GLCanvas dibujará y será llamado cada vez que se le solicite, o cuando todos los GLEventListeners hayan sido notificados de que ocurrió algún evento, dentro de este método se encuentra las operaciones qe nos ayudara a la realización de las lineas y poligonos, así como la posición de cada línea que sera trazada con el mouse por el usuario.

![image](https://user-images.githubusercontent.com/71079322/132101951-1d7ad809-3260-4f50-b447-9a8a51043859.png)

# Método de reiniciar
-Nos ayudara a como su nombre lo dice reiniciar nuestro programa, nos volvera a solicitar el numero de lados que el usuario desea trazar.

![image](https://user-images.githubusercontent.com/71079322/132074125-21148c41-85d9-473e-8325-bae6a13cb74b.png)

#                                          Resultados
-Como primer paso el usuario debe introducir el número de lados que desea que tenga su polígono

![image](https://user-images.githubusercontent.com/71079322/132102001-9cd35c71-2cc1-4410-81fd-bebedcb1aeda.png)

![image](https://user-images.githubusercontent.com/71079322/132102009-a7af40b4-b308-44fe-8edf-af7b0aee4512.png)

-Despues el usuario comenzara a trazar las lineas con su mouse.
![image](https://user-images.githubusercontent.com/71079322/132102870-7bb0138e-7a95-40b5-9ed2-1e466af8bf5b.png)

-Siguiente paso se trazara un polígono de acuerdo a lados.
![image](https://user-images.githubusercontent.com/71079322/132102936-66b5b157-17dd-4f5b-8df7-48bc1abc76d3.png)

-Por último nos solicitara de nuevo los lados que deseamos introducir.
![image](https://user-images.githubusercontent.com/71079322/132102970-66240f89-b6f8-40a1-a708-90bd155f37a8.png)



                                    


