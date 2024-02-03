# Configuración de Yii2 y CRUD

1. Entramos en GitLab
2. Activamos el servicio de Apache y PHP
3. Creamos un proyecto nuevo en GitLab
4. Entrar en la carpeta `htdocs/proyecto`
5. Ejecutar en la terminal el siguiente comando → `composer create-project --prefer-dist yiisoft/yii2-app-basic .`
6. Ejecutar en la terminal los siguientes comandos → `git init`, `git remote add origin “url”`, `git add .`, `git commit -m “Proyecto instalado”` y `git push`
7. Desde NetBeans, creamos un nuevo proyecto
    1. Choose Project:
        - Categoría: `PHP` → Proyecto: `PHP Application with Existing Sources`
    2. Name and Location:
        - Seleccionamos la ruta de la carpeta `htdocs/proyecto`
        - Escribimos el nombre del proyecto
        - Version `PHP 7.2`
    3. Run configuration:
        - Archivo index → `web/index.php`, dentro del proyecto
    4. Hacemos clic en Finish
8. En la barra superior de NetBeans, cambiamos el icono del planeta por el icono de `Google Chrome` para poner este navegador como por defecto
9. Hacemos clic en el icono de play de la barra superior de NetBeans o escribimos en la URL `http://localhost/proyecto/web/`
10. Configurar la aplicación
    1. En el archivo `config/db.php` modificamos la siguiente línea:
        - `'dsn' => 'mysql:host=localhost;dbname=yii2basic',` → `'dsn' => 'mysql:host=localhost;dbname=basededatos',`
    2. En el archivo `config/web.php` modificamos la siguiente línea: 
        - `'id' => 'basic',` → `'id' => 'basededatos',`
    3. Después de la línea anterior añadimos las siguientes líneas:
        
        ```php
        'name' => 'Nombre de la web',
        'language' => 'es-ES',
        ```
        
    4. Quitamos el comentario del siguiente bloque de código y modificamos `'showScriptName' => false,` por `'showScriptName' => true,`
        
        ```php
        'urlManager' => [
          'enablePrettyUrl' => true,
          'showScriptName' => true,
          'rules' => [
          ],
        ],
        ```
        
    5. Añadimos el siguiente bloque de código después de `components`
        
        ```php
        'container' => [
          'definitions' => [
            \yii\widgets\LinkPager::class => \yii\bootstrap4\LinkPager::class,
          ],
        ],
        ```
        
11. Guardamos los cambios y ejecutamos en la terminal los siguientes comandos: `git add .`, `git commit -m “Aplicación configurada”` y `git push`
12. Crear modelo de una tabla
    1. En la URL del navegador escribimos `http://localhost/yii/web/gii`
    2. Hacemos clic en el botón `Start` de Model Generator
    3. En el selector del nombre de la tabla seleccionamos el nombre de la tabla a generar
    4. Hacemos clic en `Preview` → `Generate`
13. Crear CRUD de una tabla
    1. Model Class → `app\models\Tabla`
    2. Controller Class → `app\controllers\TablaController`
    3. Hacemos clic en `Preview` → `Generate`
14. Desde NetBeans, accedemos a `views` → `layouts` → `main.php`
    1. Copiamos la siguiente línea: `['label' => 'Home', 'url' => ['/site/index']],` y la pegamos debajo modificándola `['label' => 'Tabla', 'url' => ['/tabla/index']],`
15. Guardamos los cambios y ejecutamos en la terminal los siguientes comandos: `git add .`, `git commit -m “mensaje”` y `git push`

---

Añadir `backup.sql` de la base de datos en una carpeta `data`

---

Instalar extensiones:

1. Añade la extension a `composer.json`
2. Ejecuta en la terminal el siguiente comando → `composer update`