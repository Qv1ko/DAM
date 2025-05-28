-- 5. Establece sobre las columnas de notas de la tabla CURSADAS la restricción de que tome valores entre 0 y 10.
ALTER TABLE cursadas ADD CHECK(nota1<=10);
ALTER TABLE cursadas ADD CHECK(nota2<=10);
ALTER TABLE cursadas ADD CHECK(nota3<=10);
ALTER TABLE cursadas ADD CHECK(notafinal<=10);
ALTER TABLE cursadas ADD CHECK(notarecu<=10);
