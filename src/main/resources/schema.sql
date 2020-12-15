CREATE TABLE categoria
(
 id INT NOT NULL,
 nombre varchar(245) NOT NULL ,
 PRIMARY KEY (id)
);


CREATE TABLE producto
(
 id INT NOT NULL,
 nombre varchar(245) NOT NULL,
 precio NUMERIC, 
 imagen  varchar(245), 
 categoria_id INT,
 PRIMARY KEY (id)
);

-----------------------------------------------------------------
-- BASE DE DATOS DE CALIDAD
------------------------------------------------------------------
-- TABLA DE CONFIGURACION
CREATE TABLE public.configuracion (
	id_configuracion int2 NOT NULL,
	configuracion varchar(64) NOT NULL,
	valor varchar(2048) NOT NULL,
	fecha_creacion timestamptz NOT NULL
);
-- TABLA DE FOLIOS
CREATE TABLE public.folio (
	id_folio int8 NOT NULL,
	"Folio_Custom" bpchar(21) NOT NULL,
	reactivaciones int2 NULL,
	id_dispositivo varchar(50) NOT NULL,
	id_muestra int4 NOT NULL,
	"Tipo_Incidente" varchar(300) NOT NULL,
	colonia varchar(100) NOT NULL,
	sector varchar(50) NOT NULL,
	telefono varchar(50) NOT NULL,
	domicilio varchar(8000) NOT NULL,
	operador varchar(150) NOT NULL,
	"Ruta_Audio" varchar(256) NOT NULL,
	fecha_folio timestamptz NOT NULL,
	fecha_creacion timestamptz NOT NULL,
	CONSTRAINT folio_pkey PRIMARY KEY (id_folio)
);


