# Sprint 0 Evidence

## Sprint Goal

Iniciar el repositorio y verificar su funcionalidad con una fresh run, realizar documentación del proceso y proponer un nuevo flujo.

## Repository baseline

- Repo: https://github.com/iPeterMoon/orderflow-luma
- Initial commit: "Initial commit"
- Fresh clone verified by: Denise García

## Baseline execution

- Tests: Todos los tests pasaron correctamente.
- Artifact: Se generaron los jar de ambos proyectos (notifications-lambda y orders-api) `notifications-lambda/target/notifications-lambda-0.1.0-SNAPSHOT.jar` y `orders-api/target/orders-api-0.1.0-SNAPSHOT.jar`
- Endpoint: Corrimos el proyecto de la api y el endpoint de health funcionó, devolviendo status: UP, también creamos una orden con POST, {"id":1001,"customerId":"team-demo","total":150.00,"status":"CREATED"}

## Value Stream

- AS-IS: `value-stream/as-is.md`
- TO-BE: `value-stream/to-be.md`

## Incremento demostrable

El incremento de este sprint solo fue la reproducción del repo con un fresh clone

## PR / pipeline / deployment / infraestructura

N/A — todavía no corresponde a este Sprint.

## Decisión y trade-off

- Decisión: Decidimos hacer una imagen de docker para centralizar la reproducción de tests y de compilación del proyecto
- trade-off: Probablemente la compilación y la ejecución de los tests sea más tardada debido a esto, pero la utilizamos para tener algo centralizado y comprobable de que funciona realmente.

## Demo mínima reproducible

```bash
git clone https://github.com/iPeterMoon/orderflow-luma
cd orderflow-luma
mvn clean test
mvn package
mvn -pl orders-api spring-boot:run
```

## Contribuciones del equipo

- Pedro Luna - contribución verificable: Creación del repositorio e invitación a los demás integrantes.
- Denise García — contribución verificable: Fresh clone y tests, documentación de clases.
- Juan Pablo Olivarría — contribución verificable: Formato de archivos.
- Norma Beltran — contribución verificable: Documentación de clases

## Mini Definition of Done

- [x] Repo y commit baseline identificables
- [x] Fresh clone verificado
- [x] Build/tests, artifact y endpoint reproducibles
- [x] AS-IS, TO-BE y Working Agreement completos
- [x] Decisión/trade-off defendible

## Retro: Keep / Change / Next experiment

- **Keep:** Comunicación continua y reuniones presenciales.
- **Change:** Por ahora no se identifican cambios importantes de algo que haya fallado.
- **Next experiment:** Reuniones en línea

## Uso de IA

- Herramienta:
- Prompt relevante:
- Qué verificamos/cambiamos:
