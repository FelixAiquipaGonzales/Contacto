-- creacion de una nueva schema en la base de datos.--
-- SCHEMA: pl

-- DROP SCHEMA IF EXISTS pl ;

CREATE SCHEMA IF NOT EXISTS pl
    AUTHORIZATION postgres;
	
-- Procedemo a crear la tabla en el schema -- 

-- Table: pl.contactos

-- DROP TABLE IF EXISTS pl.contactos;

CREATE TABLE IF NOT EXISTS pl.contactos
(
    idc bigint NOT NULL,
    apellidopat character varying(30) COLLATE pg_catalog."default" NOT NULL,
    apellidomat character varying(30) COLLATE pg_catalog."default" NOT NULL,
    nombre character varying(40) COLLATE pg_catalog."default" NOT NULL,
    sexo character varying(1) COLLATE pg_catalog."default" NOT NULL,
    ruc character varying(11) COLLATE pg_catalog."default" NOT NULL,
    email character varying(50) COLLATE pg_catalog."default" NOT NULL,
    telefono character varying(18) COLLATE pg_catalog."default",
    CONSTRAINT contactos_pkey PRIMARY KEY (idc),
    CONSTRAINT contactos_contacto_key UNIQUE (apellidopat, apellidomat, nombre),
    CONSTRAINT contactos_email_key UNIQUE (email),
    CONSTRAINT contactos_ruc_key UNIQUE (ruc),
    CONSTRAINT contactos_sexo_check CHECK (sexo::text = ANY (ARRAY['M'::character varying, 'F'::character varying]::text[])),
    CONSTRAINT contactos_ruc_check CHECK (length(ruc::text) = 11)
)
