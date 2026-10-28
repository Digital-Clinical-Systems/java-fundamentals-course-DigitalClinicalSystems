# Lección 2 · Guion de narración

**Tema**: Variables, tipos de datos y operadores
**Duración objetivo**: 8 minutos (~980 palabras)
**Archivo de la práctica**: `starter-files/lesson-02/Main.java`

> **Cómo leer este guion**
> - Tono de conversación, como si estuvieras jugando con un amigo y le explicaras cómo funciona el juego por dentro.
> - `[pausa]` = respira un segundo. `[pausa larga]` = deja que se vea lo que pasa en pantalla.
> - Lo que está entre *(paréntesis y cursiva)* no se lee.
> - Las escenas coinciden con las de `screen-guide.md`.

---

## Escena 1 · Gancho (0:00 – 0:30)

Cuando juegas, el juego se acuerda de un montón de cosas, ¿no? Tu nombre de jugador, tu nivel, cuánta vida te queda, cuántas monedas tienes… Y cada vez que te pegan, la vida baja. Cada vez que agarras una moneda, el número sube.

¿Cómo hace eso? [pausa] Con variables. Y hoy vamos a armar el perfil de nuestro propio personaje usando justamente eso.

## Escena 2 · ¿Qué es una variable? (0:30 – 1:30)

Imagínate una caja. Una caja con una etiqueta pegada que dice, por ejemplo, "vida". Adentro de la caja guardas un número: cien.

Eso es una variable. Un espacio en la memoria de la computadora que tiene un nombre y guarda un dato. [pausa]

Y lo bueno de las cajas es que puedes cambiar lo que hay adentro. Te pegan, sacas el cien y metes un sesenta y cinco. La etiqueta sigue siendo "vida", pero el valor cambió. Por eso se llama variable: porque puede variar.

En Java una variable se crea así: primero dices **qué tipo** de dato va a guardar, luego le pones **un nombre**, el signo igual y **el valor**. Y punto y coma al final, como siempre.

## Escena 3 · Tipos de datos (1:30 – 3:00)

Ahora, no todas las cajas guardan lo mismo. En Java tienes que decir qué tipo de cosa va adentro. Vamos con los cinco que más vas a usar.

*(se escribe la línea del String)*
Primero, el nombre del jugador. Un nombre es texto, y el texto en Java se llama `String`. Con S mayúscula, ojo. Y el texto siempre va entre comillas dobles. `String nombreJugador = "ShadowFox";`

*(se escribe la línea del char)*
Ahora el rango del jugador, que es una sola letra: B. Para un solo carácter existe `char`, y va entre comillas simples. Comillas simples, no dobles. Esa es la diferencia.

*(se escribe la línea del int)*
La experiencia: mil doscientos cincuenta puntos. Es un número entero, sin decimales, así que usamos `int`, que viene de "integer", entero en inglés.

*(se escribe la línea del double)*
La precisión: ochenta y siete punto cinco por ciento. Ese ya tiene decimales, así que va en un `double`. Y fíjate que el decimal se escribe con **punto**, no con coma. Java es gringo para eso.

*(se escribe la línea del boolean)*
Y por último: ¿el personaje tiene escudo? Sí o no. Para eso está `boolean`, que solo puede ser `true`, verdadero, o `false`, falso. Nada más.

[pausa] Texto, una letra, entero, decimal y verdadero o falso. Con esos cinco ya puedes hacer un montón.

## Escena 4 · Operadores: hacemos cuentas (3:00 – 5:00)

Ya tenemos los datos. Ahora hagamos que el programa calcule cosas por nosotros.

Digamos que cada nivel son cien puntos de experiencia. ¿En qué nivel estoy con mil doscientos cincuenta? Dividimos: `experiencia / 100`. [pausa] Eso da doce. ¿Doce y medio? No. Doce. Ya vamos a ver por qué.

¿Y cuántos puntos me sobran? Aquí entra un operador que seguro no conocías: el porcentaje, `%`. Pero en programación no significa porcentaje, significa **el resto de la división**. Mil doscientos cincuenta entre cien es doce, y sobran cincuenta. Eso es lo que te da el `%`: cincuenta.

Entonces, ¿cuánto me falta para subir de nivel? Cien menos lo que sobra: cincuenta. Listo.

*(se escribe el bloque de vida)*
Ahora la vida. Arrancamos con cien. Nos cae un golpe de treinta y cinco. Entonces escribo: `vida = vida - golpe;` [pausa] Esto se lee así: "a la caja vida, ponle lo que tenía menos el golpe". Y la caja ahora guarda sesenta y cinco.

*(se escribe el bloque de monedas)*
Las monedas: tengo cuarenta y agarro veinticinco. Podría escribir `monedas = monedas + 25`, pero hay un atajo: `monedas += 25`. Hace exactamente lo mismo, solo que más corto.

*(se escribe el ataque crítico)*
Y el ataque crítico, que es el doble del ataque normal. Para multiplicar se usa el asterisco: `ataque * 2`.

Entonces: más, menos, por con asterisco, entre con la barra, y el resto con el porcentaje. Esos son los operadores aritméticos.

## Escena 5 · Mostramos el perfil (5:00 – 6:15)

Ahora mostremos todo en pantalla. Ya conocemos `println`. Pero aquí hay algo nuevo: el signo más con textos **no suma, une**.

Si escribo `"Jugador: " + nombreJugador`, Java pega el texto "Jugador:" con lo que haya en la caja. [pausa] Y sale "Jugador: ShadowFox". A eso se le llama concatenar.

*(se escriben los println)*
Hago lo mismo con el nivel, la vida, las monedas… Y en esta línea, la de "te faltan tantos puntos para el nivel", fíjate que puse `nivel + 1` entre paréntesis. ¿Por qué? Porque si no pongo paréntesis, Java pega el texto con el doce y luego pega un uno, y te sale "121". [pausa] Con paréntesis primero hace la suma, y sale trece. Ese error es súper común, así que guárdalo.

Run… [pausa larga] Ahí está nuestro personaje completito.

## Escena 6 · Ojo con la división (6:15 – 6:50)

Ahora, lo que te prometí. ¿Por qué mil doscientos cincuenta entre cien dio doce y no doce punto cinco?

Porque cuando divides dos `int`, Java te da un `int`. Corta los decimales, sin redondear. Mira: siete entre dos da tres. [pausa] Pero si uno de los números tiene decimal, siete punto cero entre dos, ahí sí da tres punto cinco.

Para el nivel del juego eso nos conviene. Pero si algún día calculas un promedio y te sale raro, ya sabes dónde mirar.

## Escena 7 · Cómo poner nombres (6:50 – 7:20)

Un último detalle: los nombres de las variables. Tres reglas rápidas.

Uno: sin espacios. Si son dos palabras, la segunda empieza con mayúscula: `nombreJugador`. Eso se llama camelCase, porque parece las jorobas de un camello.

Dos: no pueden empezar con un número.

Y tres: Java distingue mayúsculas de minúsculas. `vida` y `Vida` son dos cajas distintas. Elige nombres que expliquen qué guardan: `vida` se entiende; `x`, no tanto.

## Escena 8 · Te toca + cierre (7:20 – 8:00)

Ahora te toca. Pausa el video, abre el código de inicio y crea **tu** personaje: ponle tu nombre de jugador, cambia los números y completa los cálculos que dicen `TODO`. Prueba qué pasa si le pones mil novecientos noventa y nueve de experiencia. ¿Qué nivel te sale?

[pausa larga]

¿Ya? Ahora sí tu programa recuerda cosas y hace cuentas. Pero todavía los datos los ponemos nosotros en el código.

En la siguiente lección vamos a hacer que el programa **te pregunte** a ti, y con tus respuestas arme tu propia página personal. Nos vemos.
