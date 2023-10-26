/* creación de la base de datos */

DROP DATABASE IF EXISTS alquiler_portatiles;
CREATE DATABASE alquiler_portatiles;

USE alquiler_portatiles;

/* creación de las tablas */

-- alumnos

CREATE OR REPLACE TABLE alumnos(
  id_alumno varchar(8) AUTO_INCREMENT,
  dni varchar(8),
  nombre varchar(20),
  apellidos varchar(48),
  curso varchar(96),
  aula varchar(4),
  turno varchar(8),
  -- estado_matricula enum(),
  -- foreign keys
  id_portatil varchar(8),
  id_cargador varchar(8),
  id_raton varchar(8),
  PRIMARY KEY (id_alumno)
);

CREATE OR REPLACE TABLE portatiles(
  id_portatil varchar(8),
  codigo varchar(8),
  marca varchar(20),
  modelo varchar(16),
  procesador varchar(20),
  memoria_ram varchar(16),
  dispositivo_almacenamiento varchar(20),
  capacidad_almacenamiento int(20),
  estado_alquiler varchar(20),
  -- foreign keys
  id_cargador varchar(8),
  id_raton varchar(8),
  id_almacen varchar(8),
  PRIMARY KEY (id_portatil)
);
