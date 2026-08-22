# Value Stream TO-BE — Sprint 0

Propongan el flujo objetivo, indiquen qué automatizarían primero y justifiquen la decisión con evidencia del AS-IS.

**Flujo objetivo**
-
Para el flujo objetivo del proyecto se propone lo siguiente
- Antes de empezar a trabajar revisar si hay nuevos cambios para actualizar el proyecto local
- Realizar cambios en rama aparte (estrategia de branching pendiente)
- Realizar los tests de la manera que se indique posteriormente (posiblemente docker)
- Hacer pull request y avisar por el grupo para que ayuden a revisar la actualización
- Si todo está bien, realizar el merge y continuar.

**Fricciones**
- 
En el commit inicial y con el fresh clone y los tests del proyecto se presentaron las siguientes fricciones:
- **Instalación de dependencias:** El equipo tuvo problemas ya que no tenían maven instalado en su equipo
- **Cambios no avistados:** Un miembro del equipo hizo cambios y subió un commit sin ver que ya estaba un commit atrasado.

**Afecciones**
-
- **Dependencias:** Para poder correr las pruebas del proyecto tuvimos que esperar un buen tiempo.
- **Cambios:** Pueden causar conflictos o merges que se pueden evitar.

**Soluciones**
-
Para estas fricciones se presentaron las siguientes soluciones:
- **Estandarización y Dockerización:** Se planea hacer una imagen de docker con todas las dependencias del proyecto
- **Avisos:** Configurar un hook en discord para obtener avisos de cuando se suben cambios al repositorio, también es de ayuda la aplicación de github desktop que usan unos integrantes del equipo, ya te avisa cuando tienes cambios sin guardar.