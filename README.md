
# Download progress bar
La aplicación desarrollada utiliza el lenguaje de programación Java para implementar la funcionalidad en dispositivos móviles con sistema operativo Android. Esta aplicación tiene como objetivo principal mostrar en tiempo real el progreso de descarga de un archivo mediante una barra de progreso.

Para lograr esto, se ha implementado un hilo secundario encargado de manejar la descarga del archivo y notificar al hilo principal sobre el progreso actual. La barra de progreso se actualiza en tiempo real mediante la implementación de un listener que recibe las notificaciones del hilo secundario y actualiza la interfaz de usuario de acuerdo al progreso de descarga.

Además, se han implementado mecanismos para garantizar la estabilidad y seguridad de la aplicación, incluyendo la detección y manejo de errores en la descarga del archivo, y la gestión de excepciones en la actualización de la barra de progreso.

[Video demostración funcional](https://user-images.githubusercontent.com/46347629/212753119-04d8a817-0d9f-48a0-bb4b-de9ac9d959f9.mp4)