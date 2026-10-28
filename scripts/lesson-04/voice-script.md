# Lección 4 · Guion de narración

**Tema**: Estructuras de control: decisiones y bucles
**Duración objetivo**: 10 minutos (~1 200 palabras)
**Archivo de la práctica**: `starter-files/lesson-04/Main.java`

> **Cómo leer este guion**
> - Es la lección más larga del curso. Mantén un ritmo tranquilo y aprovecha las pausas mientras se escribe el código.
> - `[pausa]` = respira un segundo. `[pausa larga]` = deja que se vea lo que pasa en pantalla.
> - Lo que está entre *(paréntesis y cursiva)* no se lee.
> - Las escenas coinciden con las de `screen-guide.md`.

---

## Escena 1 · Gancho (0:00 – 0:30)

¿Te acuerdas cómo terminó la lección pasada? Pusimos diecinueve años y el programa dijo: "Me faltan menos un años para cumplir dieciocho". [pausa] Un desastre.

El problema es que el programa hacía siempre lo mismo, sin importar la respuesta. Hoy le vamos a enseñar dos superpoderes: **decidir** y **repetir**. Y con eso tus programas ya se van a sentir de verdad inteligentes.

## Escena 2 · if y else: dos caminos (0:30 – 2:00)

Empecemos por decidir. Tú tomas decisiones todo el día: **si** llueve, llevo casaca; **si no**, no. [pausa] En Java es exactamente igual, solo que en inglés: `if` es "si" y `else` es "si no".

Entonces lo escribimos así: `if`, y entre paréntesis la condición: `edad >= 18`. Eso se lee "edad mayor o igual a dieciocho". Después abrimos llaves, y adentro va lo que pasa si eso es verdad: "Ya eres mayor de edad".

Cerramos llave, y escribimos `else`, con sus propias llaves. Adentro, lo que pasa si **no** es verdad: "Te faltan tantos años para cumplir dieciocho".

[pausa] Fíjate en las llaves. Todo lo que está entre las llaves del `if` es un bloque, y solo se ejecuta si la condición se cumple. Por eso es buena idea meter un poquito el código hacia adentro, con espacios. Así se ve clarito qué pertenece a qué.

Run. Pongo diecinueve. [pausa] "Ya eres mayor de edad". Run otra vez, pongo catorce. [pausa] "Te faltan cuatro años". Arreglado.

Rapidito, los comparadores que puedes usar: mayor `>`, menor `<`, mayor o igual, menor o igual, igual a igual, que se escribe con **dos** signos igual `==`, y diferente, que es `!=`. Ojo con el igual a igual: un solo `=` guarda un valor; dos `==` comparan. Eso confunde a todo el mundo al principio.

## Escena 3 · else if: varios caminos (2:00 – 4:00)

Pero a veces no hay solo dos caminos. Piensa en tu libreta de notas. Un dieciocho no es lo mismo que un catorce, y un catorce no es lo mismo que un once. Para eso existe `else if`: "si no, pero si…".

Vamos a pedir la nota y darle un mensaje distinto según el rango.

Primero, una protección: si la nota es menor a cero **o** mayor a veinte, esa nota no existe. Ese "o" se escribe con dos barritas verticales: `||`. Basta con que **una** de las dos cosas sea verdad para que entre. [pausa] Y si quisieras que se cumplan las **dos** cosas al mismo tiempo, usarías `&&`, que significa "y".

Luego: `else if (nota >= 18)`, "¡Logro destacado!". `else if (nota >= 14)`, "Muy bien". `else if (nota >= 11)`, "Aprobaste". Y un `else` final para todo lo demás.

Ahora, algo importante: Java revisa las condiciones **en orden**, de arriba hacia abajo, y entra en la **primera** que sea verdad. Las demás ya ni las mira. [pausa] Por eso, si saco un dieciséis, no entra en la de dieciocho, pero sí en la de catorce. Y ahí se queda. Aunque dieciséis también sea mayor que once, ya no llega hasta allá.

Probemos. Run… [pausa] Edad, cualquier cosa. Nota: quince. [pausa larga] "Muy bien, vas por buen camino". Pruebo con veinticinco… "Esa nota no existe". Bien, la protección funciona.

## Escena 4 · for: repetir un número de veces (4:00 – 6:15)

Ahora el segundo superpoder: repetir.

Imagina que quieres mostrar la tabla del siete. Podrías escribir diez `println`, uno por uno. Siete por uno, siete por dos… Funciona, pero ¿y si mañana quieres la tabla del ocho? ¿O del cien hasta el mil? [pausa] Nadie quiere escribir eso a mano. Para eso existen los bucles.

El primero es el `for`. Se usa cuando **sabes cuántas veces** quieres repetir algo. Tiene tres partes dentro del paréntesis, separadas por punto y coma:

Uno: dónde empiezo. `int i = 1`. Una variable contadora que arranca en uno.

Dos: hasta cuándo sigo. `i <= 10`. Mientras `i` sea menor o igual a diez, sigo dando vueltas.

Tres: qué hago al final de cada vuelta. `i++`, que significa "súmale uno a `i`".

Y adentro de las llaves, lo que se repite: el número, "por", `i`, "igual", y el resultado.

[pausa] Léelo como una vuelta a la cancha: arrancas en la vuelta uno, corres, sumas una vuelta, revisas si ya llegaste a diez… y así hasta terminar.

Run. Le pido la tabla del siete… [pausa larga] Y ahí están las diez líneas. Con tres líneas de código. Si pongo trece, sale la del trece. El mismo bucle.

## Escena 5 · while: repetir mientras algo pase (6:15 – 8:30)

El otro bucle es el `while`, que significa "mientras". Se usa cuando **no sabes** cuántas veces vas a repetir, pero sí sabes **hasta cuándo**.

Ejemplo de la vida real: quieres unas zapatillas que cuestan doscientos cincuenta soles. Ahorras treinta soles a la semana. ¿Cuántas semanas te demoras?

Podrías sacar la cuenta en la calculadora, sí. Pero dejemos que el programa lo haga semana por semana.

Tengo el precio, el ahorro semanal, lo que llevo ahorrado, que arranca en cero, y un contador de semanas, también en cero.

Y escribo: `while (ahorrado < precioZapatillas)`. **Mientras** lo ahorrado sea menor que el precio… sumo el ahorro de la semana, sumo una semana, y muestro cuánto llevo.

[pausa] Cuando lo ahorrado llega o pasa los doscientos cincuenta, la condición ya no se cumple y el bucle para solito.

Run… [pausa larga] Semana uno, treinta. Semana dos, sesenta… Semana nueve: doscientos setenta. Listo, nueve semanas.

Ahora un cuidado con el `while`. Si me olvido de esta línea, la que suma el ahorro, `ahorrado` se queda en cero **para siempre**. Y cero siempre es menor que doscientos cincuenta. [pausa] Entonces el bucle nunca termina. Eso se llama un **bucle infinito**. Si te pasa, tranquilo: detienes el programa con el botón **Stop** y revisas que algo dentro del bucle esté cambiando.

## Escena 6 · ¿for o while? (8:30 – 9:10)

Entonces, ¿cuándo uso cada uno?

Si sabes cuántas veces: diez multiplicaciones, cinco estudiantes, veinte niveles… usa `for`.

Si no sabes cuántas veces, pero sí cuándo parar: hasta juntar la plata, hasta que adivines el número, hasta que escribas "salir"… usa `while`.

## Escena 7 · Te toca + cierre (9:10 – 10:00)

Ahora te toca. Pausa el video, abre el código de inicio y completa los cuatro `TODO`: el `else` de la edad, los `else if` de la nota, el `for` de la tabla y el `while` del ahorro.

Y el reto: cambia el ahorro semanal a cuarenta y cinco soles. ¿Cuántas semanas te demoras ahora?

[pausa larga]

Ya. Con esto tu programa decide y repite. Pero ya habrás notado que el `main` se está poniendo largo, ¿no? Todo amontonado en un solo lugar.

En la siguiente lección vamos a aprender a ordenar el código en **métodos**: pedacitos con nombre que puedes usar las veces que quieras. Nos vemos.
