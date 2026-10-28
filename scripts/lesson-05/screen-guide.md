# Lección 5 · Guía de pantalla

**Tema**: Métodos y parámetros
**Duración objetivo**: 7 minutos
**Editor**: [OnlineGDB – Java](https://www.onlinegdb.com/online_java_compiler) (alternativa para la práctica: [JDoodle](https://www.jdoodle.com/online-java-compiler))
**Código que se construye en el video**: `completed-examples/lesson-05/Main.java`

Esta guía dice **qué se ve** en cada escena del guion (`voice-script.md`). Las escenas tienen los mismos números y tiempos.

---

## Antes de grabar

- [ ] OnlineGDB en Java, letra a 20 px, zoom del navegador al 125 %.
- [ ] En el editor, dejar solo la clase `Main` con un `main` vacío.
- [ ] Dejar una línea en blanco **entre** `public class Main {` y `public static void main`, porque ahí se escriben los métodos.
- [ ] Sin nombres de autores, logos ni marcas en pantalla.

---

## Escena 1 · Gancho (0:00 – 0:30)

- **En pantalla**: el mismo bloque de cálculo de promedio copiado muchas veces, con scroll rápido hacia abajo.
  ```java
  double suma1 = 15 + 12 + 17;
  double promedio1 = suma1 / 3;
  if (promedio1 >= 11) { ... }
  double suma2 = 9 + 11 + 10;
  ...
  ```
- **Anotación**: contador en la esquina **"× 30 estudiantes"** y luego un ❌ grande.
- **Texto en pantalla** (0:25): **"Escríbelo UNA vez, úsalo MUCHAS"**

## Escena 2 · ¿Qué es un método? (0:30 – 1:30)

- **En pantalla**: diagrama de licuadora:

  ```
   🍌 fruta  ┐
             ├──▶ [ LICUADORA ] ──▶ 🥤 jugo
   🥛 leche  ┘
  parámetros        método        valor de retorno
  ```

- **Texto en pantalla** (1:10): **"Ya usaste métodos: `println()` · `nextInt()`"**

## Escena 3 · Un método simple (1:30 – 2:30)

- **Acciones**:
  1. Escribir **entre** `public class Main {` y el `main`:
     ```java
     // Método sin parámetros y sin retorno (void): solo hace algo
     public static void mostrarTitulo() {
         System.out.println("=== CALCULADORA DE PROMEDIO ===");
     }
     ```
  2. **Anotaciones** sobre la firma del método, con colores:
     - `public static` (gris) → **"por ahora, siempre"**
     - `void` (naranja) → **"no devuelve nada"**
     - `mostrarTitulo` (azul) → **"nombre = verbo"**
     - `()` (verde) → **"aquí van los parámetros (ninguno)"**
  3. Presionar **Run**: la consola sale vacía. **Anotación**: **"Guardaste la receta… pero no cocinaste"**.
  4. Escribir dentro del `main`:
     ```java
     mostrarTitulo();
     ```
  5. **Run**. Ahora aparece el título.
- **Anotación**: flecha curva desde `mostrarTitulo();` en el `main` hasta el método de arriba, y de vuelta.

## Escena 4 · Parámetros (2:30 – 3:30)

- **Acciones**:
  1. Debajo de `mostrarTitulo`, escribir:
     ```java
     // Método con un parámetro: recibe un dato y lo usa
     public static void saludar(String nombre) {
         System.out.println();
         System.out.println("Hola, " + nombre + ". Veamos cómo te fue.");
     }
     ```
  2. En el `main`, debajo de `mostrarTitulo();`:
     ```java
     saludar("Diego");
     ```
  3. **Run**.
- **Anotación**: animación donde el texto `"Diego"` viaja desde la llamada hasta el parámetro `nombre`.

## Escena 5 · Métodos que devuelven algo (3:30 – 5:15)

- **Acciones**:
  1. Debajo de `saludar`, escribir:
     ```java
     // Método con parámetros y retorno: calcula y DEVUELVE un resultado
     public static double calcularPromedio(double nota1, double nota2, double nota3) {
         double suma = nota1 + nota2 + nota3;
         return suma / 3;
     }
     ```
     - **Anotaciones**: recuadro en `double` (antes del nombre) → **"devuelve un double"**; recuadro en los tres parámetros → **"recibe 3 notas"**; resaltar `return` → **"aquí está el resultado"**.
  2. Debajo, escribir:
     ```java
     // Método que devuelve un texto según el promedio
     public static String obtenerEstado(double promedio) {
         if (promedio >= 11) {
             return "Aprobado";
         } else {
             return "Desaprobado";
         }
     }
     ```
  3. En el `main`, debajo de `saludar("Diego");`:
     ```java
     double promedioDiego = calcularPromedio(15, 12, 17);
     // String.format("%.1f", x) muestra el número con 1 decimal
     System.out.println("Promedio: " + String.format("%.1f", promedioDiego)
             + " -> " + obtenerEstado(promedioDiego));
     ```
     - **Anotación**: dibujo de un vaso 🥛 debajo de `calcularPromedio(...)` con la flecha hacia `promedioDiego`.
     - **Anotación** en `"%.1f"`: globo **"1 decimal"**.
  4. **Run**. Zoom a `Promedio: 14.7 -> Aprobado`.
- **Texto en pantalla**: tabla rápida:

  | Antes del nombre | Significa |
  |------------------|-----------|
  | `void` | no devuelve nada |
  | `double` | devuelve un decimal |
  | `String` | devuelve un texto |

## Escena 6 · La magia de reutilizar (5:15 – 6:15)

- **Acciones**:
  1. Agregar al final del `main`:
     ```java
     // Reutilizamos los mismos métodos con otros datos
     saludar("Camila");
     double promedioCamila = calcularPromedio(9, 11, 10);
     System.out.println("Promedio: " + String.format("%.1f", promedioCamila)
             + " -> " + obtenerEstado(promedioCamila));
     ```
  2. **Run**. Mostrar los dos resultados en la consola.
  3. Cuando el narrador dice "se aprueba con doce": resaltar el `11` dentro de `obtenerEstado` con un recuadro amarillo y el texto **"1 cambio = se corrige para todos"**. (No cambiar el código; es solo una anotación.)

## Escena 7 · Te toca + cierre (6:15 – 7:00)

- **En pantalla**: tarjeta de pausa:
  > ⏸️ **PAUSA EL VIDEO**
  > Completa `saludar`, `calcularPromedio` y `obtenerEstado`
  > Úsalos con otro estudiante
  > Reto: crea `esExcelente(promedio)` → `true` si es 18 o más
  > Código de inicio en la descripción 👇
- **Texto en pantalla final** (6:45): **"Siguiente: Programación Orientada a Objetos · Tu mascota virtual 🐶"**

---

## Código final en pantalla

Debe coincidir con [`completed-examples/lesson-05/Main.java`](../../completed-examples/lesson-05/Main.java).

---

## Descripción para YouTube

```
Lección 5 · Métodos y parámetros

Ordena tu código en métodos: bloques con nombre que reciben datos (parámetros), devuelven resultados (return) y se reutilizan. Arma una calculadora de promedio que sirve para cualquier estudiante.

▶ Practica aquí (gratis, sin registro):
JDoodle: https://www.jdoodle.com/online-java-compiler
OnlineGDB: https://www.onlinegdb.com/online_java_compiler
Código de inicio: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-05/Main.java
Solución: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-05/Main.java

📂 Curso completo: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems

Capítulos:
0:00 ¿Treinta veces lo mismo?
0:30 ¿Qué es un método?
1:30 Un método simple
2:30 Parámetros
3:30 Métodos que devuelven algo
5:15 La magia de reutilizar
6:15 Te toca practicar

#JavaBeginners
```

---

## Checklist de publicación

- [ ] Audio sin ruido de fondo y a volumen parejo.
- [ ] Código y consola legibles en celular.
- [ ] Exportado en 1080p.
- [ ] Subido a YouTube como **No listado**.
- [ ] Enlace del video copiado en `course-plan.md` (Lección 5 → "Ver la lección").
