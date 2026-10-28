# Lección 6 · Guion de narración

**Tema**: Introducción a la POO: clases, objetos y constructores
**Duración objetivo**: 8 minutos (~980 palabras)
**Archivo de la práctica**: `starter-files/lesson-06/Main.java`

> **Cómo leer este guion**
> - Esta lección cambia la forma de pensar. Ve más despacio en las escenas 2 y 3: si se entiende "molde y objeto", lo demás sale solo.
> - `[pausa]` = respira un segundo. `[pausa larga]` = deja que se vea lo que pasa en pantalla.
> - Lo que está entre *(paréntesis y cursiva)* no se lee.
> - Las escenas coinciden con las de `screen-guide.md`.

---

## Escena 1 · Gancho (0:00 – 0:30)

¿Alguna vez tuviste una mascota virtual? De esas que tenías que darle de comer, jugar con ella, y si te olvidabas se ponía triste. [pausa]

Hoy vamos a crear una. Pero lo importante no es la mascota: es la forma en que la vamos a programar. Porque hoy empieza la **programación orientada a objetos**, que es justo lo que hace especial a Java.

## Escena 2 · Pensar en objetos (0:30 – 1:30)

Mira a tu alrededor. Todo lo que ves son objetos: tu celular, tu mochila, tu perro, si tienes uno.

Y todo objeto tiene dos cosas. **Cosas que tiene**: tu perro tiene un nombre, una edad, un color. Y **cosas que hace**: tu perro come, ladra, juega.

[pausa] La programación orientada a objetos es programar pensando así. En vez de tener un montón de variables sueltas por todos lados, las juntas con las acciones que van con ellas. Todo lo de la mascota, junto, en un solo lugar.

A las cosas que tiene les llamamos **atributos**. A las cosas que hace, **métodos**. Y esos ya los conoces de la lección pasada.

## Escena 3 · Clase y objeto (1:30 – 2:30)

Ahora, la idea más importante de hoy. Hay dos palabras que se confunden todo el tiempo: **clase** y **objeto**.

Piensa en un molde para hacer galletas. El molde tiene forma de estrella. [pausa] ¿El molde es una galleta? No. Es el molde. Pero con ese mismo molde puedes hacer diez, cincuenta, cien galletas. Y cada galleta es distinta: una puede tener chispas de chocolate, otra no; una puede estar más tostada…

Bueno: la **clase** es el molde. El **objeto** es la galleta. [pausa] Escribimos la clase `Mascota` una vez, y con ella fabricamos todas las mascotas que queramos. Cada una con su propio nombre y su propia energía.

## Escena 4 · Creamos la clase Mascota (2:30 – 3:30)

Vamos al código. Arriba de nuestra clase `Main`, escribimos otra clase: `class Mascota`, y abrimos llaves.

Adentro van los atributos. Lo que toda mascota **tiene**: un `String nombre`, un `String especie` para saber si es perro, gato, lo que sea; un `int energia` y un `int felicidad`.

[pausa] Fíjate que no les doy valor todavía. Porque esto es el molde. Todavía no hay ninguna mascota. Solo estamos diciendo: "toda mascota va a tener estas cuatro cosas".

## Escena 5 · El constructor (3:30 – 4:45)

Ahora, ¿cómo le damos valores cuando nace una mascota? Con un **constructor**.

El constructor es un método especial. Tiene dos detalles raros: se llama **igual que la clase**, `Mascota`, y no tiene tipo de retorno, ni siquiera `void`. Se ejecuta automáticamente cada vez que creamos una mascota nueva.

Nuestro constructor recibe el nombre y la especie. Y adentro escribimos: `this.nombre = nombre;`

[pausa] Esa línea confunde a todo el mundo, así que vamos despacio. Aquí hay dos "nombre". El de la derecha es el parámetro, el que nos mandan al crear la mascota. El de la izquierda, el que tiene `this.` adelante, es el atributo de **esta** mascota. `this` significa "esta". Entonces la línea dice: "el nombre de **esta** mascota es el nombre que me mandaron".

Lo mismo con la especie. Y la energía y la felicidad las ponemos en cincuenta, para que todas arranquen igual.

## Escena 6 · Lo que la mascota hace (4:45 – 5:45)

Ahora los métodos. Lo que la mascota **hace**.

`comer`: sube veinte de energía y dice "¡Ñam!". `jugar`: gasta quince de energía, pero sube veinticinco de felicidad. Y `mostrarEstado`, que muestra cómo está.

[pausa] ¿Notas algo distinto? Estos métodos **no tienen** `static`. Te dije que lo íbamos a entender, ¿te acuerdas? `static` significa que el método es de la clase en general, no de un objeto en particular. Y aquí queremos lo contrario: que cada mascota coma por su cuenta. Que cuando Toby come, suba la energía de Toby y no la de otra. Por eso, sin `static`.

## Escena 7 · Damos vida a las mascotas (5:45 – 7:15)

Ya tenemos el molde. Ahora fabriquemos galletas. Digo, mascotas.

En el `main`: `Mascota mascota1 = new Mascota("Toby", "Perro");`

La palabra clave aquí es `new`. "Nuevo". Es la que fabrica el objeto. Java usa el molde, ejecuta el constructor con "Toby" y "Perro", y nos entrega una mascota lista.

Creo otra: `Mascota mascota2 = new Mascota("Luna", "Gata");` Mismo molde, otro objeto.

Para usar sus métodos, escribimos el nombre del objeto, un **punto**, y el método: `mascota1.mostrarEstado()`. El punto es como decir "oye, Toby, muéstrame cómo estás".

Muestro el estado de las dos. Luego Toby juega y come. Luna solo come. Y muestro el estado otra vez.

Run… [pausa larga]

Mira. Al inicio las dos tenían cincuenta y cincuenta. Ahora Toby tiene cincuenta y cinco de energía y setenta y cinco de felicidad. Luna tiene setenta de energía, pero sigue en cincuenta de felicidad, porque con ella no jugamos. [pausa] Cada objeto guarda **sus propios datos**. Eso es lo poderoso.

## Escena 8 · Te toca + cierre (7:15 – 8:00)

Te toca. Pausa el video, abre el código de inicio y completa la clase: el constructor con `this`, el método `jugar` y el `mostrarEstado`. Después crea tu propia mascota, con el nombre que quieras.

Dato: si te sale "null jugó contigo", es que te falta el constructor. `null` significa "aquí no hay nada todavía".

Y de reto: agrega un método `dormir` que suba la energía en cuarenta.

[pausa larga]

Ahora, un problema. [pausa] Desde el `main`, yo podría escribir `mascota1.energia = 5000`. Y Java me deja. Una mascota con cinco mil de energía. O con menos cien. Eso no tiene sentido, ¿no?

En la siguiente lección vamos a **proteger** esos datos, y vamos a meter varias mascotas en un refugio. Nos vemos.
