# Fundamentos de Java para Principiantes

Curso en video de ~1 hora para aprender a programar en Java desde cero, pensado para estudiantes de secundaria (12 a 17 años) que nunca han programado. Llega hasta las bases de la Programación Orientada a Objetos (POO): clases, objetos, constructores y encapsulación.

> **No tienes que instalar nada.** Todo se hace desde el navegador con editores online gratuitos.

📄 **Plan completo del curso (lecciones, videos y prácticas): [`course-plan.md`](course-plan.md)**

---

## Configuración (2 minutos)

1. Abre tu navegador (Chrome, Firefox, Safari o Edge).
2. Entra a **[OnlineGDB – Java](https://www.onlinegdb.com/online_java_compiler)**. No necesitas cuenta.
   - Alternativa: [JDoodle – Java](https://www.jdoodle.com/online-java-compiler).
3. Abre el código de inicio de la lección en la carpeta [`starter-files`](starter-files) y presiona el botón **Raw** (o el ícono de copiar) para copiarlo.
4. Borra el código de ejemplo del editor, pega el tuyo y presiona **Run**.
5. Completa los pasos marcados con `TODO`. Cuando termines, compara con la solución en [`completed-examples`](completed-examples).

Todos los programas están en un único archivo llamado `Main.java` con una clase `public class Main`. Así funcionan tal cual en OnlineGDB, JDoodle o Replit.

> **Tip:** si el programa te hace preguntas (lecciones 3, 4 y 8), escribe tu respuesta en la consola de abajo y presiona **Enter**. En JDoodle, activa la opción **Interactive** antes de presionar **Execute**.

---

## Lecciones

| # | Lección | Duración | Práctica |
|---|---------|----------|----------|
| 1 | ¿Qué es programar? Tu primer programa en Java | 5 min | [Tarjeta de presentación](starter-files/lesson-01/Main.java) |
| 2 | Variables, tipos de datos y operadores | 8 min | [Perfil de jugador](starter-files/lesson-02/Main.java) |
| 3 | Entrada y salida: tu programa te pregunta | 6 min | [Mi página personal](starter-files/lesson-03/Main.java) |
| 4 | Estructuras de control: decisiones y bucles | 10 min | [Notas, tablas y ahorro](starter-files/lesson-04/Main.java) |
| 5 | Métodos y parámetros | 7 min | [Calculadora de promedio](starter-files/lesson-05/Main.java) |
| 6 | Introducción a la POO: clases, objetos y constructores | 8 min | [Mascota virtual](starter-files/lesson-06/Main.java) |
| 7 | Encapsulación, arreglos y cadenas | 8 min | [Refugio de mascotas](starter-files/lesson-07/Main.java) |
| 8 | Proyecto final y errores comunes | 9 min | [Registro de estudiantes](starter-files/lesson-08/Main.java) |

Los enlaces a los videos están en [`course-plan.md`](course-plan.md).

---

## Estructura de carpetas

```
/
├── README.md                 <- Estás aquí: configuración y guía rápida
├── course-plan.md            <- Plan del curso: lecciones, videos y enlaces de práctica
├── starter-files/            <- Código de inicio para cada práctica (con pasos TODO)
│   ├── lesson-01/Main.java
│   └── ...
├── completed-examples/       <- Soluciones completas para comparar
│   ├── lesson-01/Main.java
│   └── ...
└── scripts/                  <- Material de grabación de cada video
    ├── lesson-01/
    │   ├── voice-script.md   <- Guion de narración (lo que se dice)
    │   └── screen-guide.md   <- Guía de pantalla (lo que se muestra, paso a paso)
    └── ...
```

---

## Para quien graba los videos

Cada lección tiene dos archivos en [`scripts`](scripts):

- **`voice-script.md`**: el guion de la voz en off, dividido en escenas con tiempos aproximados.
- **`screen-guide.md`**: qué se muestra en pantalla en cada escena, qué se escribe en el editor, el texto en pantalla, las anotaciones y la descripción lista para YouTube.

Reglas de grabación:

- Grabar el código **solo en editores online** (OnlineGDB o JDoodle), con la letra aumentada para que se lea en celular.
- Voz en off, sin cámara.
- Subir los videos a YouTube como **no listados**.
- No incluir nombres de autores, logos ni marcas propias en los videos ni en el código.

---

## Si quieres ejecutar el código en tu computadora (opcional)

No es necesario para el curso. Si ya tienes Java (JDK 17 o superior):

```bash
cd completed-examples/lesson-01
java Main.java
```

---

Equivocarte es parte de aprender a programar. Lee el mensaje de error, cambia una cosa a la vez y vuelve a probar.
