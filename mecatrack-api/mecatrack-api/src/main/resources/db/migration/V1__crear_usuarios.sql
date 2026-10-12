create table usuario(
    id      bigint AUTO_INCREMENT primary key,
    email   varchar(150) not NULL UNIQUE,
    password    VARCHAR(255) NOT NULL,
    nombre  VARCHAR(100) NOT NULL,
    rol     VARCHAR(20) not NULL,
    fecha_alta  TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP
);