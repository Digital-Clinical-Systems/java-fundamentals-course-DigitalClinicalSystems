# Lección 2 · Guía de pantalla

**Tema**: Variables, tipos de datos y operadores
**Duración objetivo**: 8 minutos
**Editor**: [OnlineGDB – Java](https://www.onlinegdb.com/online_java_compiler) (alternativa para la práctica: [JDoodle](https://www.jdoodle.com/online-java-compiler))
**Código que se construye en el video**: `completed-examples/lesson-02/Main.java`

Esta guía dice **qué se ve** en cada escena del guion (`voice-script.md`). Las escenas tienen los mismos números y tiempos.

---

## Antes de grabar

- [ ] OnlineGDB en Java, letra a 20 px, zoom del navegador al 125 %.
- [ ] En el editor, dejar solo esto (sin el comentario grande de OnlineGDB):

  ```java
  public class Main {
      public static void main(String[] args) {

      }
  }
  ```

- [ ] Tener a mano el archivo de la solución para copiar los comentarios exactos.
- [ ] Sin nombres de autores, logos ni marcas en pantalla.

---

## Escena 1 · Gancho (0:00 – 0:30)

- **En pantalla**: ilustración genérica de un HUD de videojuego (barra de vida, contador de monedas, nivel). Sin capturas de juegos reales.
- **Anotación**: la barra de vida baja de 100 a 65 y el contador de monedas sube de 40 a 65 mientras se narra.
- **Texto en pantalla** (0:20): **"¿Cómo recuerda todo esto el juego? → Variables"**

## Escena 2 · ¿Qué es una variable? (0:30 – 1:30)

- **En pantalla**: diapositiva con una caja dibujada con la etiqueta `vida` y el número `100` adentro.
- **Acción**: animación en la que el `100` sale de la caja y entra un `65`; la etiqueta no cambia.
- **Texto en pantalla** (1:00): **"Variable = caja con nombre que guarda un dato"**
- **Al final de la escena**: aparece la anatomía de una variable con colores:

  ```
  int      vida    =   100   ;
  (tipo)  (nombre)    (valor)
  ```

## Escena 3 · Tipos de datos (1:30 – 3:00)

- **En pantalla**: el editor.
- **Acciones**: escribir una línea por cada tipo mientras se narra, con su comentario:

  ```java
  String nombreJugador = "ShadowFox"; // String: texto, entre comillas dobles
  char rango = 'B';                   // char: un solo carácter, entre comillas simples
  int experiencia = 1250;             // int: número entero
  double precision = 87.5;            // double: número con decimales (se usa punto)
  boolean tieneEscudo = true;         // boolean: solo true o false
  ```

- **Anotaciones**:
  - En `String`: círculo sobre la **S mayúscula** y sobre las comillas dobles.
  - En `char`: círculo sobre las comillas simples `' '`.
  - En `double`: círculo sobre el **punto** de `87.5` con el texto **"punto, no coma"**.
- **Texto en pantalla** (2:50): tabla resumen en una esquina:

  | Tipo | Guarda | Ejemplo |
  |------|--------|---------|
  | `String` | texto | `"ShadowFox"` |
  | `char` | 1 carácter | `'B'` |
  | `int` | entero | `1250` |
  | `double` | decimal | `87.5` |
  | `boolean` | verdadero/falso | `true` |

## Escena 4 · Operadores (3:00 – 5:00)

- **Acciones**: escribir debajo, bloque por bloque:

  ```java
  int nivel = experiencia / 100;        // 1250 / 100 = 12 (división entera)
  int expSobrante = experiencia % 100;  // % da el resto de la división: 50
  int expParaSubir = 100 - expSobrante; // 50
  ```

  - **Anotación** en el `%`: globo **"% = lo que SOBRA de la división"** y una mini cuenta en pantalla: `1250 ÷ 100 = 12, sobra 50`.

  ```java
  int vida = 100;
  int golpe = 35;
  vida = vida - golpe;                  // la caja "vida" ahora guarda 65
  ```

  - **Anotación**: flecha de derecha a izquierda sobre el `=` con el texto **"primero calcula la derecha, luego guarda en la izquierda"**.

  ```java
  int monedas = 40;
  monedas += 25;                        // atajo de: monedas = monedas + 25

  int ataque = 18;
  int ataqueCritico = ataque * 2;       // 36
  ```

- **Texto en pantalla** (4:45): fila de operadores grandes: **`+` `-` `*` `/` `%`** con su nombre debajo (suma, resta, multiplicación, división, resto).

## Escena 5 · Mostramos el perfil (5:00 – 6:15)

- **Acciones**: escribir los `println`:

  ```java
  // Con textos, el + une (concatena)
  System.out.println("=== PERFIL DEL JUGADOR ===");
  System.out.println("Jugador: " + nombreJugador + " (rango " + rango + ")");
  System.out.println("Nivel: " + nivel);
  System.out.println("Te faltan " + expParaSubir + " puntos para el nivel " + nivel + 1);
  ```

  1. Escribir la última línea **sin paréntesis** a propósito y presionar **Run**.
  2. Mostrar que la consola dice `...para el nivel 121`. **Anotación**: círculo rojo sobre `121`.
  3. Agregar los paréntesis: `(nivel + 1)` y presionar **Run**. Ahora dice `13`. **Anotación**: círculo verde.
  4. Agregar el resto de líneas:

  ```java
  System.out.println("Vida después del golpe: " + vida);
  System.out.println("Monedas: " + monedas);
  System.out.println("Ataque crítico: " + ataqueCritico);
  System.out.println("Precisión: " + precision + "%");
  System.out.println("¿Tiene escudo? " + tieneEscudo);
  ```

  5. **Run**. Mantener la consola visible 3 segundos.
- **Texto en pantalla**: **"Con textos, + significa UNIR"**

## Escena 6 · Ojo con la división (6:15 – 6:50)

- **Acciones**: agregar al final:

  ```java
  // Dato curioso: int / int corta los decimales
  System.out.println();
  System.out.println("7 / 2 = " + (7 / 2) + ", pero 7.0 / 2 = " + (7.0 / 2));
  ```

- **Run**. Zoom a la consola: `7 / 2 = 3, pero 7.0 / 2 = 3.5`.
- **Texto en pantalla**: **"int ÷ int = int (sin decimales)"**

## Escena 7 · Cómo poner nombres (6:50 – 7:20)

- **En pantalla**: diapositiva con dos columnas:

  | ✅ Bien | ❌ Mal |
  |--------|-------|
  | `nombreJugador` | `nombre jugador` (tiene espacio) |
  | `vida2` | `2vida` (empieza con número) |
  | `vida` y `Vida` son distintas | `x`, `a1`, `cosa` (no dicen nada) |

- **Anotación**: dibujar "jorobas" sobre las mayúsculas de `nombreJugador` con el texto **"camelCase 🐪"**.

## Escena 8 · Te toca + cierre (7:20 – 8:00)

- **En pantalla**: tarjeta de pausa:
  > ⏸️ **PAUSA EL VIDEO**
  > Crea tu personaje: cambia los datos y completa los `TODO`
  > Reto: ¿qué nivel sale con 1999 de experiencia?
  > Código de inicio en la descripción 👇
- Volver al editor con el programa completo y la consola visible.
- **Texto en pantalla final** (7:45): **"Siguiente: Tu programa te pregunta · Scanner 💬"**

---

## Código final en pantalla

Debe coincidir con [`completed-examples/lesson-02/Main.java`](../../completed-examples/lesson-02/Main.java).

---

## Descripción para YouTube

```
Lección 2 · Variables, tipos de datos y operadores

Arma el perfil de tu personaje de videojuego: guarda su nombre, nivel, vida y monedas en variables y haz que Java haga las cuentas por ti.

▶ Practica aquí (gratis, sin registro):
JDoodle: https://www.jdoodle.com/online-java-compiler
OnlineGDB: https://www.onlinegdb.com/online_java_compiler
Código de inicio: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-02/Main.java
Solución: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-02/Main.java

📂 Curso completo: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems

Capítulos:
0:00 ¿Cómo recuerda todo el juego?
0:30 ¿Qué es una variable?
1:30 Tipos de datos
3:00 Operadores: hacemos cuentas
5:00 Mostramos el perfil
6:15 Ojo con la división
6:50 Cómo poner nombres
7:20 Te toca practicar

#JavaBeginners
```

---

## Checklist de publicación

- [ ] Audio sin ruido de fondo y a volumen parejo.
- [ ] Código y consola legibles en celular.
- [ ] Exportado en 1080p.
- [ ] Subido a YouTube como **No listado**.
- [ ] Enlace del video copiado en `course-plan.md` (Lección 2 → "Ver la lección").
