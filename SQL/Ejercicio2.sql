DROP TABLE productos;
CREATE TABLE  productos (
    id NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre VARCHAR2(100) NOT NULL,
    descripcion VARCHAR2(100) ,
    precio NUMBER(8,2) NOT NULL CHECK (precio >= 0),
    stock NUMBER DEFAULT 0 NOT NULL,
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    descuento NUMBER CHECK (descuento BETWEEN 0 AND 100),
    estado VARCHAR2(10) DEFAULT 'activo' CHECK (estado IN ('activo','inactivo'))
);
