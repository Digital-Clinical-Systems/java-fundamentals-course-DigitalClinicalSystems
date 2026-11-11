# Lección 3 · Guion de narración

**Tema**: Entrada y salida: tu programa te pregunta
**Duración objetivo**: 6 minutos (~740 palabras)
**Archivo de la práctica**: `starter-files/lesson-03/Main.java`

> **Cómo leer este guion**
> - Tono cercano y curioso. Esta lección es corta: ve al grano, pero sin correr.
> - `[pausa]` = respira un segundo. `[pausa larga]` = deja que se vea lo que pasa en pantalla.
> - Lo que está entre *(paréntesis y cursiva)* no se lee.
> - Las escenas coinciden con las de `screen-guide.md`.

---

## Escena 1 · Gancho (0:00 – 0:25)

Hasta ahora nuestros programas hablan, pero no escuchan. Todo lo que muestran lo escribimos nosotros en el código. [pausa]

Hoy eso cambia. Vamos a hacer un programa que te haga preguntas, tú le respondas con el teclado, y con tus respuestas arme tu propia página personal. Como cuando llenas tu perfil en una app nueva.

## Escena 2 · Entrada y salida (0:25 – 1:00)

En programación hay dos palabras que vas a escuchar siempre: **entrada** y **salida**.

La salida es lo que el programa te muestra. Eso ya lo sabemos hacer con `println`.

La entrada es lo contrario: lo que **tú** le das al programa. Lo que escribes con el teclado, por ejemplo. [pausa] Y para leer el teclado, Java tiene una herramienta que se llama `Scanner`. Algo así como "el que escanea" lo que escribes.

## Escena 3 · Preparamos el Scanner (1:00 – 2:00)

`Scanner` no viene activado por defecto. Hay que traerlo de la biblioteca de Java. Para eso, arriba de todo, antes de la clase, escribimos: `import java.util.Scanner;` [pausa] Es como decirle a Java: "oye, voy a necesitar el Scanner, tráemelo".

Ahora, dentro del `main`, creamos nuestro Scanner:

`Scanner teclado = new Scanner(System.in);`

Parece mucho, pero léelo así: "créame un Scanner nuevo, que se llame `teclado`, y que lea de `System.in`". `System.in` es la entrada del sistema, o sea, el teclado. [pausa] Y le puse "teclado" de nombre porque así se entiende solito qué hace.

## Escena 4 · Hacemos preguntas (2:00 – 3:30)

Ahora sí, la primera pregunta. Uso `print`, no `println`. ¿Te acuerdas de la diferencia? Con `print` el cursor se queda en la misma línea, entonces la persona responde justo al costado de la pregunta. Queda más bonito.

`System.out.print("¿Cómo te llamas? ");`

Y para guardar la respuesta: `String nombre = teclado.nextLine();` [pausa] `nextLine` lee **toda la línea** que escribas hasta que presiones Enter, y lo guarda como texto en la variable `nombre`.

Igual con el pasatiempo: pregunto con `print` y leo con `nextLine`.

Ahora la edad. La edad es un número, y quiero poder hacer cuentas con ella, así que no la quiero como texto. Para eso uso `nextInt`: `int edad = teclado.nextInt();` [pausa] `nextInt` lee un número entero.

Y ya que tenemos la edad, hagamos una cuenta: ¿cuántos años te faltan para los dieciocho? Dieciocho menos la edad. Fácil.

## Escena 5 · Armamos la página (3:30 – 4:30)

Ahora la salida. Con lo que aprendimos de concatenar, armamos la página: "Hola, soy", más el nombre, "y tengo", más la edad, "años". Luego el pasatiempo. Luego los años que faltan.

Y al final, un detalle de buena costumbre: `teclado.close();` Cerramos el Scanner porque ya no lo vamos a usar. Es como cerrar la llave del caño cuando terminas.

Vamos a probarlo. Run… [pausa] ¿Ves? El programa se queda esperando. Está esperando **mi** respuesta. Hago clic en la consola y escribo: Mateo. Enter. Jugar fútbol. Enter. Catorce. Enter. [pausa larga]

Y ahí está la página de Mateo. Con mis respuestas. Si lo vuelves a correr y respondes otra cosa, sale otra página. El mismo código sirve para cualquier persona. Eso es lo bacán de la entrada.

## Escena 6 · ¿Y si pongo letras? (4:30 – 5:15)

Ahora, hagamos travesuras. ¿Qué pasa si en la edad, en vez de un número, escribo "catorce" con letras?

Run… Mateo, fútbol, y en la edad: c-a-t-o-r-c-e. Enter. [pausa] Error. `InputMismatchException`. Suena feo, pero en español es: "esperaba un número y me diste otra cosa". El programa no sabe convertir esas letras en número.

Así que ojo: `nextLine` para textos, `nextInt` para enteros. Y quien use tu programa tiene que responder lo que corresponde. Más adelante vamos a ver cómo validar eso.

## Escena 7 · Te toca + cierre (5:15 – 6:00)

Te toca. Pausa el video, abre el código de inicio y completa las preguntas que faltan. Y de reto: agrega una pregunta más, por ejemplo tu comida favorita, y que salga en tu página.

[pausa larga]

Una última cosa antes de irnos. Prueba poner que tienes diecinueve años. [pausa] ¿Qué dice? "Me faltan menos un años para cumplir dieciocho". [pausa] Raro, ¿no? El programa no piensa, solo hace la cuenta.

Para arreglar eso, el programa necesita **tomar decisiones**: si ya tienes dieciocho o más, que diga otra cosa. Y eso es justo lo que vamos a aprender en la siguiente lección, con `if` y `else`. Nos vemos.
