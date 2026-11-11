# Fundamentos de Java para Principiantes

## Resumen del Curso

Este curso de 1 hora te lleva desde "nunca he programado" hasta tu primer programa con clases y objetos en Java. Son 8 lecciones cortas en video: cada una explica una idea, la muestra con un ejemplo que tiene que ver con tu día a día (tu nota del cole, tu personaje de videojuego, tu mascota virtual) y te deja una pausa para que tú mismo lo programes. **¡No requiere descargas!** Solo abre tu navegador web.

**Duración total**: ~61 minutos
**Público objetivo**: Estudiantes de 12 a 17 años sin experiencia en programación
**Prerrequisitos**: Ninguno
**Herramientas necesarias**: **¡Solo tu navegador web!** (Chrome, Firefox, Safari, Edge)
**Editor online recomendado**: [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) (gratis y sin registro). Alternativa: [JDoodle](https://www.jdoodle.com/online-java-compiler).

**📂 Repositorio de Código Fuente**: [https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems)

## Secuencia de la Lección

Cada práctica tiene un **código de inicio** (`starter-files`) con pasos marcados como `TODO` y una **solución** (`completed-examples`) para comparar. Todos los programas están en un solo archivo `Main.java`, así funcionan tal cual en cualquier editor online.

<!-- Al publicar cada video, reemplazar el enlace PENDIENTE de "Ver la lección" por el enlace no listado de YouTube. -->

### Lección 1: ¿Qué es programar? Tu primer programa en Java (5 minutos)
- **Descripción**: Descubre qué es un programa, dónde se usa Java y escribe tu primera tarjeta de presentación en la consola.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=PENDIENTE-L1)
- **Conclusiones clave**: Un programa es una lista de instrucciones que se ejecutan de arriba hacia abajo; todo empieza en `main`; `System.out.println("Hola");` muestra texto; los comentarios (`//`) son notas para personas.
- **Empieza a programar**: [Abrir OnlineGDB](https://www.onlinegdb.com/online_java_compiler) + [código de inicio](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-01/Main.java) · [Solución](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-01/Main.java)
👈 **¡No necesitas registrarte!**

### Lección 2: Variables, tipos de datos y operadores (8 minutos)
- **Descripción**: Guarda los datos de tu personaje de videojuego en variables y calcula su nivel, su vida y sus monedas.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=PENDIENTE-L2)
- **Conclusiones clave**: `int`, `double`, `String`, `boolean` y `char`; declarar es `int vida = 100;`; operadores `+ - * / %`; `7 / 2` da `3` porque es división entera; `+` también une textos.
- **Práctica**: [Abrir JDoodle](https://www.jdoodle.com/online-java-compiler) + [código de inicio](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-02/Main.java) · [Solución](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-02/Main.java)
👈 **¡No es necesario registrarse!**

### Lección 3: Entrada y salida: tu programa te pregunta (6 minutos)
- **Descripción**: Usa `Scanner` para que el programa te haga preguntas y arme tu página personal con tus respuestas.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=PENDIENTE-L3)
- **Conclusiones clave**: `import java.util.Scanner;`; `teclado.nextLine()` lee texto y `teclado.nextInt()` lee un entero; cierra el `Scanner` al terminar.
- **Práctica**: [Abrir OnlineGDB](https://www.onlinegdb.com/online_java_compiler) + [código de inicio](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-03/Main.java) · [Solución](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-03/Main.java)
👈 **¡Inicio inmediato!**

### Lección 4: Estructuras de control: decisiones y bucles (10 minutos)
- **Descripción**: Haz que el programa decida qué mensaje darte según tu nota, muestre cualquier tabla de multiplicar y calcule en cuántas semanas juntas para unas zapatillas.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=PENDIENTE-L4)
- **Conclusiones clave**: `if (nota >= 11) { }`, `else if` y `else`; `&&` (y) y `||` (o); `for (int i = 1; i <= 10; i++) { }` cuando sabes cuántas veces repetir; `while (ahorrado < precio) { }` cuando repites hasta que algo cambie.
- **Práctica**: [Abrir OnlineGDB](https://www.onlinegdb.com/online_java_compiler) + [código de inicio](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-04/Main.java) · [Solución](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-04/Main.java)
👈 **¡No necesitas registrarte!**

### Lección 5: Métodos y parámetros (7 minutos)
- **Descripción**: Ordena tu código en métodos y arma una calculadora de promedio que puedes reutilizar con cualquier estudiante.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=PENDIENTE-L5)
- **Conclusiones clave**: `public static void saludar(String nombre) { }` hace algo; `public static double calcularPromedio(...)` devuelve un valor con `return`; un método se escribe una vez y se usa muchas veces.
- **Práctica**: [Abrir JDoodle](https://www.jdoodle.com/online-java-compiler) + [código de inicio](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-05/Main.java) · [Solución](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-05/Main.java)
👈 **¡Inicio inmediato!**

### Lección 6: Introducción a la POO: clases, objetos y constructores (8 minutos)
- **Descripción**: Crea el molde de una mascota virtual y dale vida a dos mascotas distintas que comen, juegan y muestran su estado.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=PENDIENTE-L6)
- **Conclusiones clave**: La clase es el molde y el objeto es lo que fabricas con él; `class Mascota { String nombre; }`; el constructor y `this` dan los valores iniciales; `new Mascota("Toby", "Perro")` crea un objeto.
- **Práctica**: [Abrir OnlineGDB](https://www.onlinegdb.com/online_java_compiler) + [código de inicio](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-06/Main.java) · [Solución](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-06/Main.java)
👈 **¡No necesitas registrarte!**

### Lección 7: Encapsulación, arreglos y cadenas (8 minutos)
- **Descripción**: Protege los datos de tus mascotas con `private`, guárdalas en un arreglo (array) y búscalas por su nombre.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=PENDIENTE-L7)
- **Conclusiones clave**: Atributos `private` + getters y setters con reglas; `Mascota[] refugio = new Mascota[3];`; las posiciones empiezan en 0; los textos se comparan con `equals`, no con `==`.
- **Práctica**: [Abrir OnlineGDB](https://www.onlinegdb.com/online_java_compiler) + [código de inicio](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-07/Main.java) · [Solución](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-07/Main.java)
👈 **¡Inicio inmediato!**

### Lección 8: Proyecto final y errores comunes (9 minutos)
- **Descripción**: Construye un registro de estudiantes que pide nombres y notas, calcula promedios y encuentra al mejor del salón. Luego repasa los errores que más se repiten cuando uno empieza.
- **Enlace**: [Ver la lección](https://www.youtube.com/watch?v=PENDIENTE-L8)
- **Conclusiones clave**: Una clase `Estudiante` con datos privados y métodos propios; un arreglo de objetos; lee el mensaje de error antes de cambiar el código; prueba tu programa después de cada cambio pequeño.
- **Proyecto final**: [Abrir OnlineGDB](https://www.onlinegdb.com/online_java_compiler) + [código de inicio](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-08/Main.java) · [Solución](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/completed-examples/lesson-08/Main.java)
👈 **¡Guarda y comparte!** (en OnlineGDB, botón **Share**)

## Recursos adicionales

- **Código fuente completo**: [Repositorio de GitHub](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems)
- **Guiones y guías de grabación**: carpeta [`/scripts`](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/tree/main/scripts)
- **Todas las actividades prácticas**:

| Número de lección | Actividad | Empezar a programar |
|-------------------|-----------|---------------------|
| 1 | Tarjeta de presentación | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) · [Código](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-01/Main.java) |
| 2 | Perfil de jugador | [JDoodle](https://www.jdoodle.com/online-java-compiler) · [Código](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-02/Main.java) |
| 3 | Mi página personal | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) · [Código](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-03/Main.java) |
| 4 | Notas, tablas y ahorro | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) · [Código](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-04/Main.java) |
| 5 | Calculadora de promedio | [JDoodle](https://www.jdoodle.com/online-java-compiler) · [Código](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-05/Main.java) |
| 6 | Mascota virtual | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) · [Código](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-06/Main.java) |
| 7 | Refugio de mascotas | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) · [Código](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-07/Main.java) |
| 8 | Registro de estudiantes | [OnlineGDB](https://www.onlinegdb.com/online_java_compiler) · [Código](https://github.com/Digital-Clinical-Systems/java-fundamentals-course-DigitalClinicalSystems/blob/main/starter-files/lesson-08/Main.java) |

- **¿Quieres seguir aprendiendo?** [Documentación oficial de Java (Oracle)](https://docs.oracle.com/javase/tutorial/) · [Dev.java, el sitio de aprendizaje de Java](https://dev.java/learn/)
- Compartir: #JavaBeginners

**¡Gracias por completar el curso!**

---

## 👥 Elaboración

Universidad Peruana de Ciencias Aplicadas
Carrera de Ingeniería de Software
Período 202620
1ASI0729 Desarrollo de Aplicaciones Open Source
NRC [Número de NRC]

**Nombre del equipo**: Digital Clinical Systems
**Líder del equipo**: [Nombres y Apellidos]
**Integrantes del equipo**:
- Johan Giovani Huaman Cuba
- [Nombres y Apellidos]
- [Nombres y Apellidos]
- [Nombres y Apellidos]

**Fecha de entrega**: [Fecha]
