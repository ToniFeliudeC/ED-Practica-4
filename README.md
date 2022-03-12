#   ED Practica 4

## Primera versión en rama master

Primero hemos creado el repositorio en local, y añadido todos los archivos del proyecto a la staging area, mediante los siguientes comandos en el bash de git.

1. ```git init```
2. ```git add``` .

Una vez **todos** los archivos están en el staging area, aplicamos el comando git commit, con la descripción del mismo.

+ ```git commit -m "build"```

Creamos la arama **main** y pusheamos todo del repositorio local al remoto.

1. ```git remote add origin https://github.com/ToniFeliudeC/ED-Practica-4.git```
2. ```git branch -M main```
3. ```git push -u origin main```

## Refactorizaciones

1. Creamos una nueva rama en la que desarrollaremos nuevas versiones, funciones etc.
    + ```git branch "develop"```
    + ```git checkout develop``` (Para cambiar de la main a "develop")

2. Modificamos y refactorizamos los archivos que deseemos, y los añadimos al staging area para poder comittearlos y pushearlos, como anteriormente.
    + ```git add .```
    + ```git commit -m [descripcionCommit]```
    + ```git push```(Si es la primera vez que hacemos push desde una rama habría que especificar el directorio remoto, sinó basta "git push")

3. Para fusionar la branch "develop" y la branch "main" nos hemos de mover a la branch "main" mediante al comando "checkout" para posteriormente hacerle un merge con develop, de la siguiente manera:
    + ```git checkout main```
    + ```git merge develop```
