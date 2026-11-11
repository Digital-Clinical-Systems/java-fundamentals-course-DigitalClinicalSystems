# Lección 8 · Guía de pantalla

**Tema**: Proyecto final y errores comunes
**Duración objetivo**: 9 minutos
**Editor**: [OnlineGDB – Java](https://www.onlinegdb.com/online_java_compiler)
**Código que se construye en el video**: `completed-examples/lesson-08/Main.java`

Esta guía dice **qué se ve** en cada escena del guion (`voice-script.md`). Las escenas tienen los mismos números y tiempos.

---

## Antes de grabar

- [ ] OnlineGDB en Java, letra a 18 px (el archivo es largo), zoom del navegador al 125 %.
- [ ] **Pestaña 1**: el proyecto. Partir de la clase `Main` vacía con `import java.util.Scanner;` arriba.
- [ ] **Pestaña 2**: otra ventana de OnlineGDB con el mini programa del "salto fantasma" (ver escena 7, error 5) ya escrito.
- [ ] Respuestas que se usarán en la escena 6:
  - Cantidad: `3`
  - `Ana`: `16`, `18`, `17`
  - `Bruno`: `10`, `25` (inválida), `9`, `11`
  - `Carla`: `12.5`, `14`, `13`
- [ ] Sin nombres de autores, logos ni marcas en pantalla.

> Tip de edición: las escenas 2 a 5 son mucho código. Se puede escribir en tiempo real y acelerar a 2× en edición, dejando a velocidad normal solo las líneas que se explican.

---

## Escena 1 · Gancho (0:00 – 0:40)

- **En pantalla**: vista previa del resultado final en la consola (captura del reporte de la escena 6), con un desenfoque que se va quitando.
- **Texto en pantalla** (0:15): **"Proyecto final: Registro de estudiantes 🎓"**
- **Texto en pantalla** (0:30): lista de lo que se va a usar, cada ítem con el número de su lección:
  `Clases (6) · Encapsulación (7) · Arreglos (7) · Métodos (5) · Bucles (4) · if (4) · Scanner (3)`

## Escena 2 · La clase Estudiante (0:40 – 2:00)

- **Acciones**: escribir encima de `public class Main`:
  ```java
  class Estudiante {
      private String nombre;
      private double[] notas;

      public Estudiante(String nombre, double[] notas) {
          this.nombre = nombre;
          this.notas = notas;
      }

      public String getNombre() {
          return nombre;
      }

      // Cada estudiante sabe calcular su propio promedio
      public double calcularPromedio() {
          double suma = 0;
          for (int i = 0; i < notas.length; i++) {
              suma += notas[i];
          }
          return suma / notas.length;
      }

      public boolean estaAprobado() {
          return calcularPromedio() >= 11;
      }
  }
  ```
- **Anotaciones**:
  - `double[] notas` → **"un arreglo de notas (lección 7)"**.
  - `return calcularPromedio() >= 11;` → **"la comparación ya es true o false"**.

## Escena 3 · Pedimos los datos (2:00 – 3:15)

- **Acciones**: dentro de `Main`, antes del `main`:
  ```java
  // final: una constante, un valor que no cambia en todo el programa
  static final int CANTIDAD_NOTAS = 3;
  ```
  Y dentro del `main`:
  ```java
  Scanner teclado = new Scanner(System.in);

  System.out.println("=== REGISTRO DE ESTUDIANTES ===");
  System.out.print("¿Cuántos estudiantes vas a registrar? ");
  // Leemos todo con nextLine y lo convertimos: así evitamos saltos raros del Scanner
  int cantidad = Integer.parseInt(teclado.nextLine());

  if (cantidad <= 0) {
      System.out.println("No hay estudiantes para registrar.");
      teclado.close();
      return;
  }

  Estudiante[] salon = new Estudiante[cantidad];

  for (int i = 0; i < cantidad; i++) {
      System.out.println();
      System.out.print("Nombre del estudiante " + (i + 1) + ": ");
      String nombre = teclado.nextLine();

      double[] notas = new double[CANTIDAD_NOTAS];
      for (int j = 0; j < CANTIDAD_NOTAS; j++) {
          notas[j] = leerNota(teclado, j + 1);
      }

      salon[i] = new Estudiante(nombre, notas);
  }

  mostrarReporte(salon);
  teclado.close();
  ```
  (El editor marcará error en `leerNota` y `mostrarReporte` hasta escribirlos en las escenas 4 y 5. Es normal.)
- **Anotaciones**:
  - `Integer.parseInt(teclado.nextLine())` → **"texto → número (te explico en un rato ⏳)"**.
  - Sombrear el `for` de afuera en azul (**"por estudiante"**) y el de adentro en verde (**"por nota"**).

## Escena 4 · Validar la nota (3:15 – 4:00)

- **Acciones**: debajo del `main`, dentro de `Main`:
  ```java
  // Pide una nota y repite la pregunta hasta que esté entre 0 y 20
  public static double leerNota(Scanner teclado, int numero) {
      double nota = -1;
      while (nota < 0 || nota > 20) {
          System.out.print("  Nota " + numero + " (0 a 20): ");
          nota = Double.parseDouble(teclado.nextLine());
          if (nota < 0 || nota > 20) {
              System.out.println("  Esa nota no es válida. Inténtalo otra vez.");
          }
      }
      return nota;
  }
  ```
- **Anotaciones**:
  - `double nota = -1;` → **"empieza inválida para que entre al while"**.
  - `while (nota < 0 || nota > 20)` → **"mientras no exista, vuelve a preguntar"**.

## Escena 5 · El reporte (4:00 – 5:15)

- **Acciones**: debajo de `leerNota`:
  ```java
  // Muestra el promedio de cada estudiante, cuántos aprobaron y el mejor promedio
  public static void mostrarReporte(Estudiante[] salon) {
      System.out.println();
      System.out.println("========== REPORTE DEL SALÓN ==========");

      Estudiante mejor = salon[0];
      int aprobados = 0;

      for (int i = 0; i < salon.length; i++) {
          Estudiante e = salon[i];

          String estado;
          if (e.estaAprobado()) {
              estado = "Aprobado";
              aprobados++;
          } else {
              estado = "Desaprobado";
          }

          System.out.println(e.getNombre() + " -> promedio "
                  + String.format("%.1f", e.calcularPromedio()) + " (" + estado + ")");

          if (e.calcularPromedio() > mejor.calcularPromedio()) {
              mejor = e;
          }
      }

      System.out.println("---------------------------------------");
      System.out.println("Aprobados: " + aprobados + " de " + salon.length);
      System.out.println("Mejor promedio: " + mejor.getNombre()
              + " (" + String.format("%.1f", mejor.calcularPromedio()) + ")");
  }
  ```
- **Animación** (4:50): tres siluetas de estudiantes en fila; una corona 👑 empieza sobre la primera y salta a otra solo si su número es mayor.

## Escena 6 · ¡A probarlo! (5:15 – 5:50)

- **Acciones**: **Run** y responder con los datos preparados. Al poner `25` en Bruno, mostrar el mensaje de nota inválida.
- **Zoom** a la consola final:
  ```
  ========== REPORTE DEL SALÓN ==========
  Ana -> promedio 17.0 (Aprobado)
  Bruno -> promedio 10.0 (Desaprobado)
  Carla -> promedio 13.2 (Aprobado)
  ---------------------------------------
  Aprobados: 2 de 3
  Mejor promedio: Ana (17.0)
  ```
- **Texto en pantalla**: **"🎉 ¡Lo construiste tú!"**

## Escena 7 · Errores comunes (5:50 – 8:10)

Cada error se muestra con un título grande en la esquina (**Error 1/6**, **Error 2/6**…). Después de cada demostración, se deshace el cambio y se presiona **Run** para mostrar que vuelve a funcionar.

1. **Punto y coma y llaves**
   - Borrar el `;` de `int aprobados = 0;` → **Run** → zoom a `error: ';' expected`.
   - **Anotación**: **"Tip: abre { y ciérrala } de inmediato"**.
2. **`=` en vez de `==`**
   - Cambiar temporalmente `if (e.estaAprobado())` por `if (e.calcularPromedio() = 20)` → **Run** → zoom al error `incompatible types: double cannot be converted to boolean`.
   - **Anotación**: **"= guarda · == compara"**.
3. **Textos con `==`**
   - Diapositiva (sin ejecutar): `nombre == "Ana"` tachado en rojo y `nombre.equals("Ana")` en verde.
   - **Texto**: **"No siempre da error… por eso es peligroso"**.
4. **Salirte del arreglo**
   - En `mostrarReporte`, cambiar `i < salon.length` por `i <= salon.length` → **Run** con 1 estudiante → zoom a `ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1`.
   - **Anotación**: diagrama de cajas `0 1 2` con una caja punteada `3 ❌`.
5. **El salto fantasma del Scanner** (pestaña 2)
   - Mostrar este mini programa:
     ```java
     import java.util.Scanner;

     public class Main {
         public static void main(String[] args) {
             Scanner teclado = new Scanner(System.in);
             System.out.print("Edad: ");
             int edad = teclado.nextInt();
             System.out.print("Nombre: ");
             String nombre = teclado.nextLine();
             System.out.println("Nombre leído: [" + nombre + "]");
         }
     }
     ```
   - **Run**, escribir `14` + Enter. El programa termina sin dejar escribir el nombre: `Nombre leído: []`.
   - **Anotación**: dibujar el Enter `⏎` que se queda "flotando" después del `14` y cómo `nextLine` se lo lleva.
   - **Texto**: **"Solución: lee todo con nextLine() y convierte con Integer.parseInt()"**.
6. **La coma decimal** (pestaña 1)
   - **Run** y en una nota escribir `12,5` → zoom a `NumberFormatException: For input string: "12,5"`.
   - **Anotación**: **"Java usa punto: 12.5"**.

## Escena 8 · Buenas prácticas (8:10 – 8:35)

- **En pantalla**: diapositiva con cuatro tarjetas que aparecen una por una:
  - 🏷️ **Nombres claros**: `promedio` ✅ `x` ❌
  - 📐 **Sangría**: se ve qué va dentro de qué
  - 🔁 **Prueba seguido**: escribe un poco → Run
  - 🔍 **Lee el error**: te dice qué y en qué línea

## Escena 9 · Te toca + cierre del curso (8:35 – 9:00)

- **En pantalla**: tarjeta de pausa:
  > ⏸️ **PAUSA EL VIDEO**
  > Termina el proyecto: `calcularPromedio`, `estaAprobado` y el reporte
  > Reto: muestra el promedio general del salón
  > Compártelo con el botón **Share** de OnlineGDB
  > Código de inicio en la descripción 👇
- **Acción**: señalar el botón **Share** en la barra de OnlineGDB.
- **Cierre** (8:50): montaje rápido de 1 segundo por lección con la consola final de cada una (tarjeta → perfil → página → tablas → promedio → mascotas → refugio → registro).
- **Texto en pantalla final**: **"Sigue practicando 💪 · dev.java/learn"**

---

## Código final en pantalla

Debe coincidir con [`completed-examples/lesson-08/Main.java`](../../completed-examples/lesson-08/Main.java).

---

## Descripción para YouTube

```
Lección 8 · Proyecto final y errores comunes

Junta todo lo que aprendiste en un registro de estudiantes: una clase Estudiante con datos protegidos, un arreglo de objetos, validación de notas y un reporte con aprobados y el mejor promedio. Luego repasamos los 6 errores más comunes al empezar en Java y cómo solucionarlos.

▶ Practica aquí (gratis, sin registro):
OnlineGDB: https://www.onlinegdb.com/online_java_compiler
Código de inicio: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-08/Main.java
Solución: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-08/Main.java

📂 Curso completo: https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems
📚 Para seguir aprendiendo: https://dev.java/learn/

Capítulos:
0:00 El proyecto final
0:40 La clase Estudiante
2:00 Pedimos los datos
3:15 Validar la nota
4:00 El reporte
5:15 ¡A probarlo!
5:50 Errores comunes
8:10 Buenas prácticas
8:35 Te toca practicar

#JavaBeginners
```

---

## Checklist de publicación

- [ ] Audio sin ruido de fondo y a volumen parejo.
- [ ] Código y consola legibles en celular (usar zoom en cada error).
- [ ] Exportado en 1080p.
- [ ] Subido a YouTube como **No listado**.
- [ ] Enlace del video copiado en `course-plan.md` (Lección 8 → "Ver la lección").
