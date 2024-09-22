<b>Descripció</b>

Nivel 1 - Ejercicio 1:
  Se crea una clase Month con un solo atributo name y un constructor.
  En la clase Main, se crea una colección ArrayList de objetos Month para insertar todos los meses del año, excepto el mes de agosto, en su orden cronológico.
  Si añadimos luego el mes de agosto con el índice que le corresponde (7), comprobamos que se inserta en la posición esperada.
  Recorremos la lista con un bucle "for i" y imprimimos por la consola los meses en orden ascendente.
  Recorremos la lista con un iterador y imprimimos por la consola los meses en orden descendente esa vez.
  
  Finalmente creamos un hashset a partir de la lista inicial y lo mostramos por la consola. Vemos que tiene el mismo contenido que la llista, pero sin ordenar ya que se trata de un set.
  Añadimos al hashset el mes de agosto y comprobamos que su contenido no varía, es decir que ha ignorado la adición del mes de agosto, al estar duplicado.
  Para llegar a ello, hemos tenido que modificar la clase Month, sobreescribiendo los métodos equals y hashcode, para que el programa pudiera interpretar que los dos objetos Month "agosto" son iguales.
  Sin hacer esta modificación, los dos meses de agosto son instancias distintas y al añadir la segunda instancia, el hashset parecería tener valores duplicados.
  El método equals establece que la igualdad se debe determinar comparando los valores de los dos atributos "name".
  También sobreescribimos el método hashcode para garantizar que no se produzcan colisiones de hash con dos instancias distintas. La mejor solución es utilizar el método utilitario hash()
  de la clase Object de java.util. En nuestro caso, le pasaremos el parámetro del único atributo que tenemos, "name".

Nivel 2 - Ejercicio 1:
  El ejercicio consta de una sola clase Main donde creamos una lista 1 de tipo Integer, con números del 0 al 10.
  Creamos a continuación otra lista 2, con el mismo contenido que la primera, pero en orden inverso, eso es del 10 al 0.
  Definiendo un iterador, leemos la lista 1 y añadimos cada elemento a la lista 2, con lo que obtenemos una lista 2 con un contenido simétrico, del 10 al 0 seguido del 0 al 10.

---------------------------------  
Tecnologies Utilitzades : IDE IntelliJ Idea v 2024.2.1, Java, SDK openjdk-22 Oracle OpenJDK 22.0.2
Requisits: SDK openjdk-22 Oracle OpenJDK 22.0.2

Instal·lació: 
1. Clonar el repositorio de Github
git clone https://github.com/g-lemoing/1.01_JavaLanguage_Sprint1_Task1.git
2. Abrir el IDE e importar el proyecto desde el repositorio local desde File > Open.

Ejecución:
Localizar y abrir las classes Main de cada ejercicio, y ejecutarlas con el Run.

Contribuciones:
1. Crear un fork del repositorio: 
2. Clonar el repositorio hacia el directorio local marcado por git bash
 git clone https://github.com/YOUR-USERNAME/1.01_JavaLanguage_Sprint1_Task1
3. Crear una rama
git branch BRANCH-NAME
git checkout BRANCH-NAME
4. Realizar cambios o comentarios, y hacer un commit: git commit -m 'mensaje cambios'
5. Subir cambios a tu nueva rama: git push origin BRANCH-NAME
6. Hacer un pull request
