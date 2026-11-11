# Lección 8 · Guion de narración

**Tema**: Proyecto final y errores comunes
**Duración objetivo**: 9 minutos (~1 120 palabras)
**Archivo de la práctica**: `starter-files/lesson-08/Main.java`

> **Cómo leer este guion**
> - Primera mitad: construir el proyecto con calma, recordando de qué lección viene cada pieza. Segunda mitad: errores comunes, con ritmo más rápido y tono de "a mí también me pasó".
> - `[pausa]` = respira un segundo. `[pausa larga]` = deja que se vea lo que pasa en pantalla.
> - Lo que está entre *(paréntesis y cursiva)* no se lee.
> - Las escenas coinciden con las de `screen-guide.md`.

---

## Escena 1 · Gancho (0:00 – 0:40)

Llegamos a la última lección. Y hoy no vamos a aprender nada nuevo. [pausa] Bueno, casi nada. Hoy vamos a **usar** todo lo que ya sabes para construir un programa de verdad.

Un registro de estudiantes. El programa te pregunta cuántos estudiantes hay, te pide el nombre y tres notas de cada uno, y al final te da un reporte: el promedio de cada quien, cuántos aprobaron y quién tiene el mejor promedio del salón.

Y en la segunda parte, vamos a ver los errores que **todos** cometemos al empezar. Para que cuando te pasen, sepas qué hacer.

## Escena 2 · La clase Estudiante (0:40 – 2:00)

Empezamos por el molde. ¿Qué tiene un estudiante? Un nombre y sus notas. Y como son varias notas, ¿qué usamos? [pausa] Un arreglo. `private double[] notas`.

Ambos atributos son `private`, como vimos la vez pasada. Nadie de afuera debería poder cambiarle las notas a un estudiante, ¿no?

El constructor recibe el nombre y las notas y los guarda con `this`. Un getter para el nombre.

Y aquí viene lo interesante: el estudiante **sabe calcular su propio promedio**. El método `calcularPromedio` recorre su arreglo de notas con un `for`, las va sumando, y devuelve la suma entre la cantidad de notas, `notas.length`.

Y `estaAprobado` devuelve `true` o `false`: si el promedio es once o más. Fíjate que aquí no hay `if`. Directamente devuelvo el resultado de la comparación. Porque `promedio >= 11` ya **es** un `boolean`: o es verdad o no lo es.

## Escena 3 · Pedimos los datos (2:00 – 3:15)

Ahora el `main`. Creamos el Scanner, como en la lección tres, y preguntamos cuántos estudiantes son.

Pero esta vez, en lugar de `nextInt`, leo **todo** con `nextLine` y lo convierto a número con `Integer.parseInt`. [pausa] ¿Por qué? En unos minutos te muestro el error que esto evita. Por ahora, confía en mí.

Si alguien pone cero, no hay nada que registrar, así que mostramos un mensaje y salimos con `return`.

Creamos el arreglo de estudiantes, `salon`, del tamaño que nos dijeron. Y con un `for`, por cada estudiante: pedimos el nombre, y con **otro** `for` adentro pedimos sus tres notas. Un `for` dentro de otro `for`. El de afuera va por estudiante, el de adentro va por nota.

Y al final de cada vuelta, creamos el objeto con `new Estudiante` y lo guardamos en su posición del arreglo.

## Escena 4 · Validar la nota (3:15 – 4:00)

Para pedir cada nota uso un método aparte: `leerNota`. Y aquí está el `while` de la lección cuatro trabajando.

Mientras la nota sea menor a cero o mayor a veinte, la vuelvo a pedir. Empiezo con menos uno para que entre la primera vez. [pausa] Así, si alguien escribe veinticinco, el programa le dice "esa nota no es válida, inténtalo otra vez", y no avanza hasta que ponga una nota que exista.

¿Ves cómo los métodos ayudan? El `main` queda limpio: solo dice `leerNota`, y todo el detalle está guardado aparte.

## Escena 5 · El reporte (4:00 – 5:15)

Último método: `mostrarReporte`. Recibe el arreglo de estudiantes.

Empiezo suponiendo que el mejor es el primero, el de la posición cero. Y un contador de aprobados en cero.

Recorro el salón. Por cada estudiante: si está aprobado, sumo uno al contador. Muestro su nombre, su promedio con un decimal y su estado. Y comparo: si su promedio es mayor que el del mejor hasta ahora, **él** pasa a ser el mejor.

[pausa] Es como cuando buscas al más alto del salón: empiezas con el primero y vas comparando uno por uno. Si encuentras a alguien más alto, ahora ese es tu candidato.

Al final, muestro cuántos aprobaron y quién tuvo el mejor promedio.

## Escena 6 · ¡A probarlo! (5:15 – 5:50)

Run. [pausa] Tres estudiantes. Ana: dieciséis, dieciocho, diecisiete. Bruno: diez, y ahora pongo veinticinco a propósito… [pausa] "Esa nota no es válida". Bien. Nueve, once. Carla: doce punto cinco, catorce, trece.

[pausa larga] Ana diecisiete, aprobada. Bruno diez, desaprobado. Carla trece punto dos, aprobada. Dos de tres aprobados, y el mejor promedio: Ana.

Clases, objetos, arreglos, métodos, decisiones, bucles, entrada y salida. Todo en un solo programa. Eso lo hiciste tú.

## Escena 7 · Errores comunes (5:50 – 8:10)

Ahora sí, los errores. Te los voy a mostrar rompiendo el programa a propósito.

**Uno: el punto y coma y las llaves.** Si falta un punto y coma, Java te dice "punto y coma esperado" y la línea. Si falta una llave, el error a veces sale en otra línea, más abajo. Truco: cada vez que abras una llave, ciérrala de inmediato y después escribe lo de adentro.

**Dos: un igual en vez de dos.** Si en un `if` escribes `nota = 20` en lugar de `nota == 20`, estás guardando, no comparando. Java te va a avisar con un error. Un igual guarda, dos iguales comparan.

**Tres: comparar textos con dos iguales.** Ya lo vimos: los textos se comparan con `equals`. Este no siempre da error, y por eso es peligroso. Parece que funciona hasta que un día no.

**Cuatro: salirte del arreglo.** Si en el `for` pongo `i <= salon.length` en vez de `i < salon.length`… [pausa] `ArrayIndexOutOfBoundsException`. Me fui a una posición que no existe. Un arreglo de tres tiene las posiciones cero, uno y dos. La tres no existe.

**Cinco: el salto fantasma del Scanner.** Te lo prometí. Si lees un número con `nextInt` y justo después un texto con `nextLine`… el `nextLine` se salta y te devuelve vacío. [pausa] ¿Por qué? Porque `nextInt` lee el número, pero deja el Enter ahí, y `nextLine` agarra ese Enter como si fuera tu respuesta. Por eso en este proyecto leí todo con `nextLine` y lo convertí.

**Seis: la coma decimal.** Si escribes doce **coma** cinco, `parseDouble` no lo entiende: `NumberFormatException`. En Java los decimales van con punto: doce punto cinco.

## Escena 8 · Buenas prácticas (8:10 – 8:35)

Y cuatro costumbres que te van a ahorrar horas:

Ponle nombres claros a todo. `promedio` se entiende; `x`, no.

Ordena tu código con sangría, para que se vea qué está dentro de qué.

Prueba seguido. Escribe un poquito, presiona Run. Otro poquito, Run. Así, si algo falla, sabes que fue lo último que cambiaste.

Y la más importante: **lee el error**. No te asustes con el texto rojo. Casi siempre te dice qué pasó y en qué línea.

## Escena 9 · Te toca + cierre del curso (8:35 – 9:00)

Pausa el video, abre el código de inicio y termina el proyecto: el promedio, el aprobado y el reporte. Y de reto: muestra el promedio general de todo el salón. Cuando lo tengas, en OnlineGDB presiona "Share" y compártelo.

[pausa larga]

Y con eso terminamos. Empezaste sin saber qué era programar, y ahora tienes un programa con clases y objetos. [pausa] Sigue practicando: cambia los ejemplos, inventa tus propios programas, equivócate mucho. Así se aprende. Nos vemos.
