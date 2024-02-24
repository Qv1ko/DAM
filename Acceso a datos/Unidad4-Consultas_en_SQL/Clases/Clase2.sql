-- Densidad de la población de las autonomías españolas
SELECT DISTINCT autonomia, p.poblacion / p.superficie as 'Densidad' FROM provincias p;