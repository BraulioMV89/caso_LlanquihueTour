Desarrollo Orientado a Objetos I

👤 Autor del proyecto

Nombre completo: Braulio Antonio Meriño Valdivia
Carrera: Desarrollo de aplicaciones
Sede: Campus Online
📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación Sumativa 1 de la asignatura Desarrollo Orientado a Objetos I. 
Se trata de un sistema orientado a objetos desarrollado en Java, cuyo objetivo es modelar y gestionar entidades, aplicando los principios de encapsulamiento, composición, herencia.

El proyecto fue desarrollado a partir del caso planteado de Llanquihue Tour, donde el problema es que la empresa no tiene método moderno
para gestionar tanto a usuarios como colaboradores y a través de este código se proporciona una solución estructurada, modular y reutilizable.

🧱 Estructura general del proyecto
📁 src/
├── app/         # Clase principal con el método main
├── model/       # Clases con la lógica de dominio (persona, colaborador, correo, rut, direccion)
├── util/        # Acá estarán las Validaciones

⚙️ Instrucciones para clonar y ejecutar el proyecto (Esta es la forma en la que yo aprendí a clonar repositorios) 

1. Crear una carpeta vacía, con el nombre del proyecto, en este caso Llanquihue Tour
1.2 Hacer clic derecho, dentro de la carpeta vacía, pulsar 'Abrir en Terminal' (PowerShell)

2. Clonar este repositorio:
	git clone https://github.com/BraulioMV89/caso_LlanquihueTour.git
3. Abrir la Carpeta Llanquihue tour, luego la carpeta src, luego en la carpeta 'app', abrir el main.java 
4. Ejecutar el método main.
5. El sistema instanciará los objetos predeterminados, validará cada objeto y mostrará los resultados formateados directamente en la consola.

La versión subida a GitHub, tiene solo una instancia con errores, para hacer prueba de uno de sus validadores.
