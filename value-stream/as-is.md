# Value Stream AS-IS — Sprint 0

Documenten el flujo real desde el commit baseline hasta una ejecución verificable: trabajo, esperas, handoffs, feedback y fricciones observadas.

Se descargó la carpeta zip del proyecto inicial
Se creo el proyecto en github bajo el nombre orderflow-devops
Se inicializó el proyecto de git desde la computadora con los siguientes comandos

```bash
git init
git remote add origin git@github.com:iPeterMoon/orderflow-devops.git
git branch -M main
git add .
git commit -m "initial commit"
git push -u origin main
```

Los integrantes del equipo clonaron el repositorio pero no lograron correrlo ya que les faltaban dependencias (Maven) decidieron esperarse a tener sus laptops personales para trabajar desde ahí y clonar el repositorio desde ahí en lugar de las computadoras del instituto.

Una vez con acceso a su computadora,clonaron el repositorio, instalaron maven y corrieron el programa con "mvn clean test", el programa compiló y pasó los tests correctamente.