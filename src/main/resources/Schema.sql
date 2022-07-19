CREATE DATABASE FacturacionSegundaEntregaValls ;

USE FacturacionSegundaEntregaValls ;

CREATE TABLE Cliente (
  idCliente INT NOT NULL,
  Apellido VARCHAR(45) NOT NULL,
  Nombre VARCHAR(45) NOT NULL,
  DNI VARCHAR(45) NOT NULL,
  PRIMARY KEY (idCliente)) ;

CREATE TABLE Producto (
 idProducto INT NOT NULL,
  DescProducto VARCHAR(80) NOT NULL,
  Valor DOUBLE NOT NULL,
  Cantidad INT NOT NULL,
  CodigoProducto INT NOT NULL,
  PRIMARY KEY (idProducto)) ;

CREATE TABLE Comprobante (
  idComprobante INT NOT NULL,
  Fecha DATE NOT NULL,
  Total DOUBLE NOT NULL,
  Cantidad INT NOT NULL,
  TipoComprobante VARCHAR(45) NOT NULL,
  PRIMARY KEY (idComprobante)) ;