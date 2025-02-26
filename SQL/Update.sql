UPDATE  usuarios SET telefono = '222-333-444';
UPDATE  usuarios SET telefono = '555-666-777' WHERE nombre = 'NOMBRE3';
UPDATE  usuarios SET telefono = '888-666-777' WHERE nombre = 'NOMBRE4' AND telefono = '555-666-777';
UPDATE  usuarios SET telefono = '888-666-777' WHERE nombre = 'NOMBRE4' OR telefono = '555-666-777';
UPDATE  usuarios SET telefono = '888-666-999', email='nombre7@gmail.com' WHERE nombre = 'NOMBRE7';