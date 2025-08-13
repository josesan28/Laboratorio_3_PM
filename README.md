# Lista de Tareas - Laboratorio 3 PM

Este proyecto es una aplicación Android desarrollada en **Kotlin** utilizando **Jetpack Compose** que permite gestionar una lista de tareas de forma simple e interactiva.

## ✨ Características

- **Agregar tareas** mediante un campo de texto y botón dedicado.
- **Marcar tareas como completadas** con un solo clic, aplicando un estilo tachado al texto.
- **Eliminar tareas** fácilmente mediante un botón de eliminación.
- **Interfaz reactiva** gracias al uso de `mutableStateListOf`, que actualiza la lista automáticamente.
- **Diseño moderno** usando Material 3 y Jetpack Compose.
- **Imagen de fondo personalizada** para una apariencia atractiva.

## 🛠 Tecnologías utilizadas

- **Kotlin**
- **Jetpack Compose**
- **Material 3**
- **Android Studio**
- **Gradle**

## 📷 Vista previa

La aplicación muestra:
1. Un título en la parte superior.
2. Campo de texto para escribir una nueva tarea.
3. Botón **Agregar tarea**.
4. Lista de tareas, cada una con:
   - Botón ✅ para marcar como completada.
   - Botón ❌ para eliminar.

## 📂 Estructura principal

- `MainActivity`: Inicializa la interfaz y configura el tema.
- `PantallaPrincipal`: Contenedor principal con título, fondo y lista de tareas.
- `ListaTareas`: Lógica para manejar la lista de tareas y agregar nuevas.
- `TaskItem`: Componente visual para mostrar cada tarea con sus botones de acción.
- `Task`: Data class que representa una tarea (`text`, `done`).

## 🚀 Ejecución

1. Clonar este repositorio:
   ```bash
   git clone https://github.com/usuario/repositorio.git

## Video del funcionamiento

Link: https://youtube.com/shorts/bxz02FK-Tes
