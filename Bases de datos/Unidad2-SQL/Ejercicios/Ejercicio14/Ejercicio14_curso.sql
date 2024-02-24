-- 6. Número de hora comprendido entre 1 y 6.
ALTER TABLE horario ADD CHECK(diasemana>=1 AND diasemana<=6);

-- 13. Establece que el valor para iniciar el campo auto incrementado sea 100.
ALTER TABLE prueba AUTO_INCREMENT=100;

-- 17. Insertar filas.
INSERT INTO prueba VALUES(1,"jueves"),(2,3),(4,6),(5,"domingo");

-- 18. Inserta una fila que contenga en E el color azul.
INSERT INTO prueba(e) VALUES("azul");

-- 19. Inserta una fila que contenga en E los colores azul, rojo, y negro.
INSERT INTO prueba(e) VALUES("azul,rojo,negro");

-- 20. Inserta una fila que contenga en E los colores negro, rojo, azul.
INSERT INTO prueba(e) VALUES("negro,rojo,azul");

-- 21. Inserta otra fila que contenga los colores azul y beige.
INSERT INTO prueba(e) VALUES("negro,beige");

-- 23. Añade a la tabla ALUMNOS una fila para el alumno Jorge Garcia Posadas que vive en Floranes 48, 4º E (Santander) y tiene el DNI 20564420C y número de alumno 11.
INSERT INTO alumno(nombre,apellidos,direccion,dni,numalumno) VALUES("Jorge","Garcia Posadas","Floranes 48, 4ºE","20564420C",11);

-- 24. Añade a la tabla ALUMNOS una fila para el alumno Pedro Álvarez Campos que vive en Julian Ceballos 35, 3º B (Torrelavega) y tiene el DNI 72147891 y número de alumno 16.
INSERT INTO alumno(nombre,apellidos,direccion,dni,numalumno) VALUES("Pedro","Álvarez Campos","Julian Ceballos 35, 3ºB","Torrelavega","72147891",16);

-- 27. Añade a la tabla TITULACIONES las filas necesarias.
INSERT INTO titulaciones(cprofesor,numtitulo,tipo,nombre) VALUES("A1",1,"Licenciado","Informática"),("A1",2,"Licenciado","Físicas"),("A2",1,"Licenciado","Informática"),
    ("A3",1,"Licenciado","Físicas"),("B2",1,"Diplomado","Relaciones Laborales"),("B2",2,"Licenciado","Economía"),("B1",1,"Diplomado","Empresariales");

-- 28. Establece en la tabla IMPARTIR que Manuel es titular en Diseño, Nuria es titular en desarrollo, Santiago es ayudante en desarrollo, María es titular en RET, Mercedes es titular en FOL y FCT.
INSERT INTO impartir(cprofesor,cmodulo,titular) VALUES("A1","DIS",true),("A2","DES",true),("A3","DES",false),("B1","RET",true),("B2","FOL",true),("B2","FCT",true);

-- 29. Establece en la tabla HORASIMPARTIDAS que Santiago trabaja las tres primeras horas del lunes y las tres primeras del Miércoles.
INSERT INTO horasimpartidas(cprofesor,dia,hora,cmodulo) VALUES("A3","Lunes","1","DES"),("A3","Lunes","2","DES"),("A3","Lunes","3","DES"),
    ("A3","Miercoles","1","DES"),("A3","Miercoles","2","DES"),("A3","Miercoles","3","DES");

-- 31. Carga los datos de la tabla CURSADAS. Para ello, inserta en la tabla CURSADAS una fila por cada fila del resultado del producto cartesiano entre las tablas alumnos y módulos.
INSERT INTO cursadas(numalumno,cmodulo) SELECT numalumno,cmodulo FROM alumnos CROSS JOIN modulos;

/* 32. Elimina de la tabla CURSADAS todas las filas que contienen el código del módulo Formación en Centros de Trabajo y las filas correspondientes a Raquel Bueno Garcia y a Luis Garcia Jimenez 
cursando el módulo de FOL. */
DELETE FROM cursadas WHERE cmodulo="FCT" AND numalumno IN (SELECT numalumno FROM alumnos WHERE (nombre="Raquel" AND apellidos="Bueno Garcia") OR (nombre="Luis" AND apellidos="Garcia Jimenez"));