# dbForge

Antes de iniciar dbForge, activar los siguientes servicios en Xampp:

- MySQL
- Apache

Clic en una tabla de la base de datos → Ver la estructura de la tabla y scripts

### Crear diagrama automático

1. Database → Database diagram
    
    ![imagen1](./img/imagen1.png)
    
2. Arrastrar la base de datos al fondo blanco
- Reorganizar la dirección de una línea: Clic derecho → Reroute
- Guardar diagrama: File → Save (extensión .dbd)

### Añadir registros

1. Tools → New Data Generation…
    
    ![imagen2](./img/imagen2.png)
    
2. Database → Escoger la base de datos
3. Options:
    - Número de registros a añadir y truncate de los datos una vez generados
        
        ![imagen3](./img/imagen3.png)
        
    - Distribución de los datos de forma secuencial o aleatoria
        
        ![imagen4](./img/imagen4.png)
        
    - Incluir valores nulos, vacíos y seleccionar el país de los datos
        
        ![imagen5](./img/imagen5.png)
        
4. Open
5. Marcar casilla de la base de datos
6. Cambiar el tipo de generación de un campo → Clic en Generator
    
    ![imagen6](./img/imagen6.png)
    
    - Text File → Generar los valores definidos en un .txt

7. Clic en la flecha superior verde después de añadir los datos
    
    ![imagen7](./img/imagen7.png)
    
8. Marcar opción de Abrir script en el editor de dbForge
    
    ![imagen8](./img/imagen8.png)
    
9. Clic en Generate (si da error, deshabilitar las claves foráneas)

### Crear documentación

1. Tools → New Documentation…
    
    ![imagen9](./img/imagen9.png)
    
2. Añadimos la conexión
3. Marcamos las tablas y la base de datos a documentar
4. Generate → Seleccionas el formato → Generate

### Crear backup

1. Clic derecho en la base de datos
2. Backup and restore → Backup Database…
3. Backup Content → Seleccionar estructura que se guardara en el Backup
4. Options → General script options → Include CREATE DATABASE statement
5. Clic al botón de Backup