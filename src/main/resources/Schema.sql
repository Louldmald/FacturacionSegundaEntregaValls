CREATE DATABASE FacturacionSegundaEntregaValls ;

USE FacturacionSegundaEntregaValls ;

CREATE TABLE Cliente (
  Apellido VARCHAR(45) NOT NULL,
  Nombre VARCHAR(45) NOT NULL,
  DNI INTEGER(45) NOT NULL,
  PRIMARY KEY (DNI)) ;

CREATE TABLE Producto (
  DescProducto VARCHAR(80) NOT NULL,
  Valor DOUBLE NOT NULL,
  Cantidad INT NOT NULL,
  CodigoProducto INT NOT NULL,
  PRIMARY KEY (CodigoProducto)) ;