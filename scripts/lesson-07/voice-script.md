# Lección 7 · Guion de narración

**Tema**: Encapsulación, arreglos y cadenas
**Duración objetivo**: 8 minutos (~990 palabras)
**Archivo de la práctica**: `starter-files/lesson-07/Main.java`

> **Cómo leer este guion**
> - Son tres ideas en una lección. Marca bien el cambio de tema con las frases de transición.
> - `[pausa]` = respira un segundo. `[pausa larga]` = deja que se vea lo que pasa en pantalla.
> - Lo que está entre *(paréntesis y cursiva)* no se lee.
> - Las escenas coinciden con las de `screen-guide.md`.

---

## Escena 1 · Gancho (0:00 – 0:30)

La vez pasada terminamos con un problema. Desde cualquier parte del programa yo podía escribir "la energía de Toby es cinco mil", y Java ni se quejaba. [pausa]

Imagínate eso en un juego de verdad: cualquiera podría ponerse vida infinita o monedas infinitas. Hoy vamos a cerrar esa puerta. Y además vamos a juntar varias mascotas en un refugio, y aprender a buscarlas por su nombre.

## Escena 2 · Encapsulación: private (0:30 – 1:45)

La idea se llama **encapsulación**. Suena complicado, pero piensa en tu celular. Tú no le abres la batería con un desarmador para cargarlo, ¿no? Usas el cargador, por la entrada que el celular te da. [pausa] Lo de adentro está protegido; tú solo usas lo que el celular te permite.

En Java hacemos lo mismo con la palabra `private`. Le pongo `private` a los atributos de la mascota: `private String nombre`, `private int energia`.

Y ahora, si desde el `main` intento escribir `refugio[0].energia = 5000`… [pausa] Error: "energia has private access in Mascota". Java dice: "no, eso es privado, no lo puedes tocar desde afuera". Perfecto. Eso es justo lo que queríamos.

Pero claro, ahora tampoco lo puedo **leer**. Necesitamos una forma controlada de entrar.

## Escena 3 · Getters y setters (1:45 – 3:15)

Para eso existen los **getters** y los **setters**. "Get" es obtener, "set" es poner.

El getter es un método público que solo **devuelve** el dato. `public int getEnergia()`, y adentro `return energia;`. Así cualquiera puede **ver** la energía, pero no cambiarla.

El setter es un método público que **cambia** el dato. Pero con reglas. `public void setEnergia(int energia)`. Y adentro: si la energía que me mandan es menor a cero, guardo cero. Si es mayor a cien, guardo cien. Y si no, guardo lo que me mandaron.

[pausa] ¿Ves la diferencia? Antes cualquiera podía meter cualquier número. Ahora, para cambiar la energía, **tienes** que pasar por el setter. Y el setter es como el portero del colegio: revisa que todo esté en orden antes de dejarte pasar.

Y un detalle: en el constructor, en vez de guardar la energía directo, uso `setEnergia`. Así la regla se cumple desde que la mascota nace.

## Escena 4 · Arreglos: varias mascotas juntas (3:15 – 5:00)

Ahora, segundo tema. Ya no tenemos una mascota, tenemos un refugio. ¿Y si son tres mascotas? ¿Creo `mascota1`, `mascota2`, `mascota3`? ¿Y si llegan cien?

Para eso existen los **arreglos**, o arrays, como también les dicen. Un arreglo es una fila de cajas, todas del mismo tipo, una al lado de otra.

Lo creo así: `Mascota[] refugio = new Mascota[3];` Los corchetes significan "varias". Y el tres es cuántas cajas tiene la fila.

Ahora, atención, que esto confunde a todos: **las posiciones empiezan en cero**. [pausa] La primera caja es la cero, la segunda es la uno, la tercera es la dos. No hay posición tres en un arreglo de tres. Así que: `refugio[0]` es Toby, `refugio[1]` es Luna y `refugio[2]` es Rocky.

Y mira lo que pasa con los setters. A Luna le puse ciento cincuenta de energía, y a Rocky menos veinte. Pero el setter las arregla solito: Luna se queda en cien y Rocky en cero.

Para recorrer el arreglo, usamos el `for` que ya conocemos. Arranco en cero, y sigo mientras `i` sea menor que `refugio.length`. `length` es "largo": te dice cuántas cajas tiene el arreglo. Así, si mañana el refugio tiene cincuenta, el `for` sigue funcionando sin cambiar nada.

Adentro, saco la mascota de la posición `i` y muestro sus datos con los getters.

## Escena 5 · Cadenas: jugando con textos (5:00 – 6:15)

Tercer tema, cortito: los **textos**. A un `String` también le dicen **cadena**, porque es una cadena de letras.

Y los `String` traen sus propios métodos, listos para usar. Por ejemplo, `toUpperCase` lo convierte todo a mayúsculas. `length`, con paréntesis, te dice cuántas letras tiene.

Entonces en el `for` muestro el nombre en mayúsculas y cuántas letras tiene. Run… [pausa larga] Uno, TOBY, cuatro letras, ochenta. Dos, LUNA, cuatro letras, cien. Tres, ROCKY, cinco letras, cero.

Pobre Rocky. Démosle de comer, pero con el setter: su energía actual, que la saco con el getter, más sesenta. Run… [pausa] Sesenta. Así se cambia un dato privado: siempre por la puerta.

## Escena 6 · Buscar por nombre: equals (6:15 – 7:15)

Último truco: buscar una mascota por su nombre. Digamos que alguien escribe "luna", en minúsculas.

Recorro el refugio, y por cada mascota pregunto: ¿su nombre es igual a "luna"? [pausa] Y aquí hay una trampa. Con números comparamos con dos iguales, `==`. Pero **los textos no se comparan con** `==`. Puede que funcione a veces y otras no, y eso es lo peor que te puede pasar.

Los textos se comparan con `equals`. Y si no te importan las mayúsculas, con `equalsIgnoreCase`, que significa "igual, ignorando mayúsculas". Así "luna" y "Luna" cuentan como iguales.

Run… [pausa] "Encontramos a Luna en la posición uno". Posición uno, porque empezamos a contar desde cero, ¿te acuerdas?

## Escena 7 · Te toca + cierre (7:15 – 8:00)

Te toca. Pausa el video y abre el código de inicio. Completa el getter y el setter, agrega una tercera mascota al refugio, recórrelo con el `for` y busca a "luna".

Y de reto: muestra cuál es la mascota con **más** energía.

[pausa larga]

Ya tienes todas las piezas: variables, decisiones, bucles, métodos, clases, objetos y arreglos. [pausa]

En la siguiente lección, la última, las vamos a juntar en un proyecto de verdad: un registro de estudiantes que pide nombres y notas, saca promedios y te dice quién es el mejor del salón. Y además vamos a ver los errores que más se repiten cuando uno empieza, para que no te agarren desprevenido. Nos vemos.
