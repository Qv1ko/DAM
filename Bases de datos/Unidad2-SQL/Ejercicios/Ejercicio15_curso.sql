-- 2. Carga en la tabla CURSADAS las calificaciones correspondientes a los alumnos en cada uno de los módulos en la primera evaluación con un 6.
UPDATE cursadas SET nota1=6;

-- 3. Modifica la calificación del alumno número 4 en Desarrollo para que tenga un 5.
UPDATE cursadas SET nota1=5 WHERE numalumno=4 AND cmodulo="DES";

-- 4. Suma 1 punto a todas las calificaciones de Diseño.
UPDATE cursadas SET nota1=nota1+1 WHERE cmodulo="DIS";
    -- Nota aleatoria del 0 al 10 para el modulo de FOL.
    UPDATE cursadas SET nota1=FLOOR(RAND()*11) WHERE codMod="FOL";
    --Nota aleatoria del 5 al 10 para el modulo de RET.
    UPDATE cursadas SET nota1=FLOOR(RAND()*6)+5 WHERE cmodulo="RET";

-- 5. Escribe los días y las horas en las que se imparte Desarrollo. 
CREATE VIEW horario_des AS SELECT diasemana,numhora FROM horario WHERE cmodulo="DES";

-- 6. Escribe por cada hora del lunes, el nombre del módulo que se imparte, el nombre del profesor y la hora.
CREATE VIEW horario_lunes(numhora,nombreModulo,nombreProfesor) AS SELECT horario.numhora,modulos.nombre,profesores.nombre FROM horario INNER JOIN modulos ON horario.cmodulo=modulos.cmodulo INNER JOIN impartir ON modulos.cmodulo=impartir.cmodulo INNER JOIN profesores ON impartir.cprofesor=profesores.cprofesor WHERE horario.diasemana="Lunes" AND impartir.titular=1;

-- 7. Obtén un horario semanal que muestre día, hora, módulo, profesor ordenado por día y hora.
CREATE VIEW horario_semanal(diasemana,numhora,nombreModulo,nombreProferos) AS SELECT diasemana,numhora,modulos.nombre,profesores.nombre FROM horario INNER JOIN modulos ON horario.cmodulo=modulos.cmodulo INNER JOIN impartir ON modulos.cmodulo=impartir.cmodulo INNER JOIN profesores ON impartir.cprofesor=profesores.cprofesor GROUP BY diasemana,numhora;

-- 8. Obtén un listado con las calificaciones de los alumnos en FOL en la primera evaluación.
CREATE VIEW calificaciones_fol AS SELECT numalumno,nota1 FROM cursadas WHERE cmodulo="FOL";

-- 9. Realiza un listado con las calificaciones del alumno número 4 en la primera evaluación. Debe mostrarse el nombre de cada módulo y el nombre y apellidos del alumno.
CREATE VIEW clasificaciones_alumno4_eva1(Modulo,Nombre,Apellido,Nota) AS SELECT cursadas.cmodulo,alumnos.nombre,alumnos.apellidos,cursadas.nota1 FROM alumnos INNER JOIN cursadas ON alumnos.numalumno=cursadas.numalumno WHERE alumnos.numalumno=4;

-- 10. Realiza un listado de los alumnos que han aprobado el módulo de desarrollo en la primera evaluación.
CREATE VIEW aprobados_des_eva1(Nombre,Apellidos,Nota) AS SELECT alumnos.nombre,alumnos.apellidos,cursadas.nota1 FROM alumnos INNER JOIN cursadas ON alumnos.numalumno=cursadas.numalumno WHERE cursadas.nota1>=5;

-- 11. Realiza un listado que muestre cuantos alumnos han aprobado cada módulo en la primera evaluación.
CREATE VIEW modulos_aprobados_eva1(Nombre,Apellidos,Modulo) AS SELECT alumnos.nombre,alumnos.apellidos,modulos.nombre FROM alumnos INNER JOIN cursadas ON alumnos.numalumno=cursadas.numalumno INNER JOIN modulos ON cursadas.cmodulo=modulos.cmodulo WHERE nota1>=5

-- 12. Realiza un listado que obtenga el número de suspensos en cada módulo en la primera evaluación.
CREATE VIEW modulos_suspensos_eva1(Modulo,Suspensos) AS SELECT cmodulo,COUNT(nota1) FROM cursadas WHERE nota1<5 GROUP BY cmodulo;

-- 13. Realiza un listado con la calificación media de cada módulo en la primera evaluación.
CREATE VIEW media_eva1(Modulo,Nota) AS SELECT cmodulo,AVG(nota1) FROM cursadas GROUP BY cmodulo;