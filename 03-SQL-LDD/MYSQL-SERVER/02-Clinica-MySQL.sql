-- Crear la base de datos
CREATE DATABASE Clinica;

-- Usar la base de datos creada
USE Clinica;

-- Crear la tabla Doc (Doctor)
CREATE TABLE Doc (
    IdDoc INT PRIMARY KEY, 
    Especialidad VARCHAR(20), 
    Edad INT, 
    Nombre VARCHAR(30), 
    Apellido1 VARCHAR(30), 
    Apellido2 VARCHAR(20)
);

-- Crear la tabla Paciente
CREATE TABLE Paciente (
    IdPaciente INT PRIMARY KEY, 
    Nombre VARCHAR(20), 
    Apellido1 VARCHAR(20), 
    Apellido2 VARCHAR(20), 
    Edad INT, 
    Peso INT, 
    Altura INT
);

-- Crear la tabla Atencion
CREATE TABLE Atencion (
    IdAtencion INT PRIMARY KEY, 
    Diagnostico VARCHAR(100), 
    Fecha DATE, 
    IdDoc INT, 
    IdPaciente INT, 
    FOREIGN KEY (IdDoc) REFERENCES Doc(IdDoc),
    FOREIGN KEY (IdPaciente) REFERENCES Paciente(IdPaciente)
);
