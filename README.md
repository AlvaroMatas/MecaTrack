# MecaTrack
Aplicación multiplataforma para que los clientes de un taller sigan sus reparaciones y aprueben presupuestos, con panel de gestión para el mecánico

> Proyecto desarrollado como proyecto intermodular de Desarrollo de Aplicaciones Multiplataforma (DAM). Estado: en desarrollo.

## Funcionalidades

- Registro e inicio de sesión con dos roles: cliente y mecánico.
- Gestión de vehículos (matrícula, marca, modelo, año y kilómetros).
- Solicitud de reparación indicando síntomas y descripción del problema.
- Presupuesto preliminar generado a partir de un catálogo de averías, revisable por el mecánico.
- Aprobación o rechazo de presupuestos y de ampliaciones por parte del cliente.
- Seguimiento de la reparación mediante una línea de tiempo con sus estados.
- Notificaciones por email en cada cambio de estado.
- Historial de reparaciones por vehículo.

## Tecnologías

| Capa | Tecnología |
|---|---|
| Aplicación (móvil y escritorio) | Flutter / Dart |
| API REST | Java 21, Spring Boot 3, Spring Security (JWT) |
| Base de datos | MySQL 8, Flyway |
| Correo | Spring Mail, Mailtrap (pruebas) |
| Documentación de la API | springdoc-openapi (Swagger UI) |
| Entorno de desarrollo | Docker, Git, GitHub |

## Arquitectura

```
[App Flutter: móvil (cliente) y escritorio (mecánico)]
              |  HTTPS + JSON (JWT)
              v
[API Spring Boot: seguridad, presupuestos, estados, emails]
              |  JPA / Hibernate
              v
[MySQL]
```

## Requisitos previos

- JDK 21
- Flutter SDK
- Docker Desktop
- Git

## Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/[usuario]/mecatrack.git
cd mecatrack
```

### 2. Base de datos

```bash
docker run --name mecatrack-mysql -e MYSQL_ROOT_PASSWORD=[contraseña] -e MYSQL_DATABASE=mecatrack -p 3306:3306 -d mysql:8
```

### 3. Backend

```bash
cd backend
./mvnw spring-boot:run
```

La API quedará disponible en `http://localhost:8080` y la documentación en `http://localhost:8080/swagger-ui.html`.

### 4. Aplicación Flutter

```bash
cd app
flutter pub get
flutter run
```

## Estructura del proyecto

```
mecatrack/
├── backend/   API REST con Spring Boot
├── app/       Aplicación Flutter (móvil y escritorio)
├── docs/      Análisis, diagramas y manual de usuario
└── README.md
```

## Documentación

- [Análisis de requisitos](docs/analisis.pdf)
- [Diagrama de casos de uso](docs/casos_de_uso.png)
- [Diagrama entidad-relación](docs/er.png)
- [Manual de usuario](docs/manual_usuario.pdf)

## Autor

Álvaro Matas Adam · Alumno de Desarrollo de Aplicaciones Multiplataforma · IES El Grao

## Licencia

Proyecto académico. Uso educativo.
