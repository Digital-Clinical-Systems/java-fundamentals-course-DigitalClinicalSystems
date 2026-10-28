# Lección 5 · Guion de narración

**Tema**: Métodos y parámetros
**Duración objetivo**: 7 minutos (~860 palabras)
**Archivo de la práctica**: `starter-files/lesson-05/Main.java`

> **Cómo leer este guion**
> - Tono relajado. La idea central (escribir una vez, usar muchas veces) se repite a propósito: es lo que tiene que quedar.
> - `[pausa]` = respira un segundo. `[pausa larga]` = deja que se vea lo que pasa en pantalla.
> - Lo que está entre *(paréntesis y cursiva)* no se lee.
> - Las escenas coinciden con las de `screen-guide.md`.

---

## Escena 1 · Gancho (0:00 – 0:30)

Imagínate que en tu salón son treinta y cada uno quiere saber su promedio. Si para cada persona escribes la suma, la división y el `if` de aprobado… treinta veces lo mismo. [pausa] Y si te equivocaste en una fórmula, tienes que corregirla treinta veces.

Hay una forma mucho más inteligente: escribirlo **una sola vez**, ponerle un nombre, y usarlo cuantas veces quieras. Eso es un método.

## Escena 2 · ¿Qué es un método? (0:30 – 1:30)

Un método es un bloque de código con nombre. Algo así como una receta guardada.

Piensa en una licuadora. Tú le metes fruta y leche, presionas el botón, y te devuelve un jugo. No necesitas saber cómo funciona el motor por dentro. Solo sabes qué le das y qué te devuelve.

[pausa] Un método funciona igual. Lo que le das se llama **parámetros**. Lo que te devuelve se llama **valor de retorno**. Y presionar el botón es **llamar** al método, que es simplemente escribir su nombre con paréntesis.

Y ojo, que tú ya has usado métodos sin darte cuenta. `println` es un método. `nextInt` también. Hoy vamos a crear los nuestros.

## Escena 3 · Un método simple (1:30 – 2:30)

El más fácil de todos: uno que solo muestre el título de la calculadora.

Lo escribimos **fuera** del `main`, pero **dentro** de la clase. Así: `public static void mostrarTitulo()`, llaves, y adentro un `println`.

Vamos por partes. `public static`, por ahora, lo vamos a poner siempre. En la siguiente lección vas a entender para qué sirve. [pausa] `void` significa "vacío": este método hace algo, pero no devuelve nada. Y `mostrarTitulo` es el nombre. Los nombres de los métodos suelen ser verbos, porque los métodos **hacen** cosas: mostrar, calcular, saludar.

Ahora, si presiono Run… no pasa nada. [pausa] ¿Por qué? Porque escribir el método es como guardar la receta en el cuaderno. Todavía no cocinaste. Para usarlo hay que **llamarlo** desde el `main`: `mostrarTitulo();` Run… [pausa] Ahora sí.

## Escena 4 · Parámetros (2:30 – 3:30)

Ahora uno que reciba algo. Un método para saludar a alguien por su nombre.

`public static void saludar(String nombre)`. Dentro de los paréntesis va el parámetro: qué tipo de dato recibe y con qué nombre lo vamos a usar adentro. Y en el `println`: "Hola, " más `nombre`.

Lo llamo con `saludar("Diego")`. [pausa] Java agarra ese "Diego", lo mete en la variable `nombre`, y ejecuta el método. Si lo llamo con "Camila", saluda a Camila. Mismo código, distinto dato.

## Escena 5 · Métodos que devuelven algo (3:30 – 5:15)

Y ahora el más útil: uno que haga una cuenta y te **devuelva** el resultado.

`public static double calcularPromedio(double nota1, double nota2, double nota3)`.

Fíjate en dos cosas. Uno: ya no dice `void`, dice `double`. Eso significa "este método te va a devolver un número con decimales". Dos: recibe **tres** parámetros, separados por comas.

Adentro: sumo las tres notas, y escribo `return suma / 3;`. [pausa] `return` es la palabra clave. Significa "aquí está el resultado, llévatelo". Y apenas Java llega al `return`, sale del método.

En el `main`, como el método me devuelve un valor, lo guardo en una variable: `double promedioDiego = calcularPromedio(15, 12, 17);`. Es como poner un vaso debajo de la licuadora para recibir el jugo.

Y un método más, que devuelva texto: `obtenerEstado`. Recibe el promedio y, con un `if`, devuelve "Aprobado" si es once o más, y "Desaprobado" si no. Aquí hay dos `return`, pero solo uno se ejecuta, depende del camino que tome el `if`.

Para mostrar el promedio uso `String.format`, con `"%.1f"`. No te preocupes por memorizarlo: significa "muéstrame este número con un solo decimal". Porque si no, sale catorce punto seis seis seis seis seis… y nadie quiere eso.

Run… [pausa larga] "Hola, Diego. Promedio: catorce punto siete. Aprobado".

## Escena 6 · La magia de reutilizar (5:15 – 6:15)

Y ahora viene lo bonito. ¿Quiero calcular el de Camila? No escribo ninguna fórmula nueva. Solo llamo a los mismos métodos con otros datos: `saludar("Camila")`, `calcularPromedio(9, 11, 10)`, `obtenerEstado`…

Run. [pausa] Camila, diez, desaprobado.

Y si mañana el colegio dice que se aprueba con doce y no con once, ¿cuántas cosas cambio? [pausa] Una. Un solo número, dentro de `obtenerEstado`. Y se corrige para todos. Por eso los métodos son tan importantes: tu código queda más corto, más ordenado y más fácil de arreglar.

## Escena 7 · Te toca + cierre (6:15 – 7:00)

Te toca. Pausa el video, abre el código de inicio y completa los métodos: el saludo, el promedio y el estado. Después, úsalos con otro estudiante, inventado o tuyo.

Y de reto: crea un método `esExcelente` que devuelva `true` si el promedio es dieciocho o más.

[pausa larga]

Listo. Ya sabes ordenar tu código en métodos. Y con esto terminamos la primera parte del curso.

Porque en la siguiente lección empieza lo que de verdad hace especial a Java: la **programación orientada a objetos**. Vamos a crear una mascota virtual que come, juega y tiene su propia energía. Nos vemos.
