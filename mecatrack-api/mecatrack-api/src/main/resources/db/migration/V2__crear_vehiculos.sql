CREATE Table vehiculos(
    id BIGINT AUTO_INCREMENT primary key,
    matricula VARCHAR(10) NOT NULL UNIQUE,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) not null,
    anio int NOT NULL,
    kilometros int NOT NULL,
    usuario_id BIGINT NOT NULL,
    constraint fk_vehiculo_usuario FOREIGN KEY(usuario_id) REFERENCES usuario(id)
);