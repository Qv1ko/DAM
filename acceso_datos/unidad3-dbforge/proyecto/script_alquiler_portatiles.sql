﻿/* creación de la base de datos */

DROP DATABASE IF EXISTS alquiler_portatiles;
CREATE DATABASE alquiler_portatiles;

USE alquiler_portatiles;

/* creación de las tablas */

-- alumnos

CREATE OR REPLACE TABLE alumnos(
  id_alumno integer AUTO_INCREMENT,
  dni varchar(8),
  nombre varchar(24),
  apellidos varchar(48),
  curso varchar(96),
  aula varchar(4),
  turno varchar(8),
  estado_matricula varchar(16),
  id_portatil integer,
  id_cargador integer,
  id_raton integer,
  PRIMARY KEY (id_alumno)
);

-- portátiles

CREATE OR REPLACE TABLE portatiles(
  id_portatil integer AUTO_INCREMENT,
  codigo varchar(4),
  marca varchar(24),
  modelo varchar(24),
  procesador varchar(24),
  memoria_ram integer(4),
  dispositivo_almacenamiento varchar(24),
  capacidad_almacenamiento integer(8),
  estado_alquiler varchar(24),
  id_cargador integer,
  id_raton integer,
  id_almacen integer,
  PRIMARY KEY (id_portatil)
);

-- aplicaciones instaladas

CREATE OR REPLACE TABLE aplicaciones_instaladas(
  id_aplicacion integer AUTO_INCREMENT,
  aplicacion varchar(32),
  id_portatil integer,
  PRIMARY KEY (id_aplicacion)
);

-- cargadores

CREATE OR REPLACE TABLE cargadores(
  id_cargador integer AUTO_INCREMENT,
  codigo varchar(4),
  potencia integer(8),
  estado_alquiler varchar(24),
  id_almacen integer,
  PRIMARY KEY (id_cargador)
);

-- ratones

CREATE OR REPLACE TABLE ratones(
  id_raton integer AUTO_INCREMENT,
  codigo varchar(4),
  marca varchar(24),
  modelo varchar(24),
  tipo_conector varchar(8),
  estado_alquiler varchar(24),
  id_almacen integer,
  PRIMARY KEY (id_raton)
);

-- almacenes

CREATE OR REPLACE TABLE almacenes(
  id_almacen integer AUTO_INCREMENT,
  aula varchar(4),
  capacidad integer(4),
  PRIMARY KEY (id_almacen)
);

/* creación de restricciones */

-- restricciones de alumnos

ALTER TABLE alumnos
  ADD CONSTRAINT uk_dni
  UNIQUE KEY (dni),

  ADD CONSTRAINT fk_alumnos_portatiles
  FOREIGN KEY (id_portatil)
  REFERENCES portatiles(id_portatil),

  ADD CONSTRAINT fk_alumnos_cargadores
  FOREIGN KEY (id_cargador)
  REFERENCES cargadores(id_cargador),

  ADD CONSTRAINT fk_alumnos_ratones
  FOREIGN KEY (id_raton)
  REFERENCES ratones(id_raton);

-- restricciones de portátiles

ALTER TABLE portatiles
  ADD CONSTRAINT uk_codigo
  UNIQUE KEY (codigo),

  ADD CONSTRAINT fk_portatiles_cargadores
  FOREIGN KEY (id_cargador)
  REFERENCES cargadores(id_cargador),

  ADD CONSTRAINT fk_portatiles_ratones
  FOREIGN KEY (id_raton)
  REFERENCES ratones(id_raton),

  ADD CONSTRAINT fk_portatiles_almacenes
  FOREIGN KEY (id_almacen)
  REFERENCES almacenes(id_almacen);

-- restricciones de aplicaciones instaladas

ALTER TABLE aplicaciones_instaladas
  ADD CONSTRAINT uk_aplicacion_portatil
  UNIQUE KEY (aplicacion, id_portatil),

  ADD CONSTRAINT fk_aplicaciones_portatiles
  FOREIGN KEY (id_portatil)
  REFERENCES portatiles(id_portatil);

-- restricciones de cargadores

ALTER TABLE cargadores
  ADD CONSTRAINT uk_codigo
  UNIQUE KEY (codigo),

  ADD CONSTRAINT fk_cargadores_almacenes
  FOREIGN KEY (id_almacen)
  REFERENCES almacenes(id_almacen);

-- restricciones de ratones

ALTER TABLE ratones
  ADD CONSTRAINT uk_codigo
  UNIQUE KEY (codigo),

  ADD CONSTRAINT fk_ratones_almacenes
  FOREIGN KEY (id_almacen)
  REFERENCES almacenes(id_almacen);

ALTER TABLE almacenes
  ADD CONSTRAINT uk_aula
  UNIQUE KEY (aula);
