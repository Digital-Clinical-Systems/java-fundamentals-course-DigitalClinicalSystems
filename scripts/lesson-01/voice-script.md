# Lección 1 · Guion de narración

**Tema**: ¿Qué es programar? Tu primer programa en Java
**Duración objetivo**: 5 minutos (~620 palabras)
**Archivo de la práctica**: `starter-files/lesson-01/Main.java`

> **Cómo leer este guion**
> - Habla como si le explicaras a tu primo o a un amigo del cole, no como si leyeras un libro.
> - `[pausa]` = respira un segundo. `[pausa larga]` = deja que se vea lo que pasa en pantalla.
> - Lo que está entre *(paréntesis y cursiva)* no se lee: es lo que ocurre en pantalla en ese momento.
> - Las escenas coinciden con las de `screen-guide.md`.

---

## Escena 1 · Gancho (0:00 – 0:25)

Oye, una pregunta rápida. [pausa] ¿Cuántas apps abriste hoy? WhatsApp, TikTok, algún juego… Todas, absolutamente todas, alguien las escribió. Línea por línea.

Y lo que te quiero mostrar hoy es que ese "alguien" puedes ser tú. En unos cinco minutos vas a tener tu primer programa funcionando. Sin instalar nada.

## Escena 2 · ¿Qué es programar? (0:25 – 1:20)

Primero, ¿qué es programar? Es darle instrucciones a una computadora. Pero instrucciones bien clarito, paso por paso, porque la compu no adivina nada.

Piénsalo así: si le dices a alguien "prepárame un pan con palta", esa persona ya sabe qué hacer. Pero si se lo dices a un robot, tienes que decirle: agarra el pan, ábrelo, saca la palta, córtala, ponla encima… [pausa] Todo. Si te saltas un paso, el robot se queda parado.

Bueno, eso es un programa: una lista de instrucciones que la computadora lee **de arriba hacia abajo**, en orden. Y esas instrucciones se escriben en un lenguaje que la compu entiende. Hay varios: Python, JavaScript… y el que vamos a usar nosotros: Java.

## Escena 3 · ¿Por qué Java? (1:20 – 1:50)

¿Y por qué Java? Porque está en todos lados. Minecraft en su versión original está hecho en Java. Muchas apps de Android, sistemas de bancos, de tiendas… Java.

Y algo que me gusta: Java es bien ordenado. Te obliga a escribir las cosas de forma clara, y eso hace que aprendas buenas costumbres desde el inicio.

## Escena 4 · Abrimos el editor (1:50 – 2:30)

Ya, vamos a la práctica. Abre tu navegador y entra a OnlineGDB. El enlace está en la descripción del video. [pausa]

Aquí, arriba a la derecha, donde dice "Language", fíjate que esté elegido Java. [pausa] Y listo. No te pide cuenta, no te pide instalar nada. Este es tu editor: aquí arriba escribes el código y aquí abajo, en la consola, ves lo que hace tu programa.

## Escena 5 · Las partes del programa (2:30 – 3:20)

Ya viene un código escrito. Vamos por partes, sin miedo.

*(se resalta `public class Main`)*
Esta línea, `public class Main`, es como la carpeta donde vive tu programa. Se llama Main, que en inglés significa "principal".

*(se resalta `public static void main`)*
Esta otra es súper importante: `main`. Es la puerta de entrada. Cuando presionas Run, Java busca esta línea y empieza a leer desde aquí. Las palabras de adelante las vamos a entender más adelante, por ahora tranqui.

*(se resalta `System.out.println`)*
Y esta es la instrucción que hace la magia: `System.out.println`. Sirve para mostrar un texto en la consola. El texto va entre comillas, y al final… punto y coma. [pausa] Ese punto y coma es como el punto final de una oración en Java. Ojo con eso.

Presiono Run… [pausa larga] Y ahí está. Nuestro programa habló.

## Escena 6 · Tu tarjeta de presentación (3:20 – 4:20)

Ahora hagámoslo nuestro. Vamos a hacer una tarjeta de presentación.

Copio la línea y cambio el texto: "Nombre: Valeria". Otra: "Colegio: tercero de secundaria". Otra más: "Me gusta: dibujar y el vóley". [pausa] Run. ¿Ves? Cada `println` es una línea nueva, y salen en el mismo orden en que las escribí.

Ahora un truquito. Si uso `print`, sin el "ln", el texto **no** salta de línea. Entonces escribo `print("Mi frase: ")` y abajo un `println` con la frase. Run… [pausa] Y salen juntitas en la misma línea.

Y esto de acá, con dos barritas, es un comentario. Java lo ignora por completo. Es una nota para ti o para quien lea tu código después.

A ver, ¿qué pasa si me olvido el punto y coma? *(se borra el `;`)* Run… [pausa] Error. Pero mira, te dice la línea y te dice qué falta. No te asustes con los errores rojos, te están ayudando.

## Escena 7 · Te toca + cierre (4:20 – 5:00)

Ahora te toca a ti. [pausa] Pausa el video, abre el código de inicio que está en la descripción y arma tu propia tarjeta: tu nombre, tu grado, algo que te guste y una frase tuya. Cuando termines, vuelve.

[pausa larga]

¿Ya? Bacán. Acabas de escribir tu primer programa en Java. En serio, ya programaste.

En la siguiente lección vamos a aprender a guardar datos en el programa, con algo que se llaman variables. Y lo vamos a hacer armando el perfil de un personaje de videojuego. Nos vemos ahí.
