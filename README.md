# Todo List Manager API

- A todo list manager API.
- It is a challenger from this [repository](https://github.com/simplify-tec/desafio-junior-backend-simplify).

## Installation

### 1. Clone the project

```sh
git clone git@github.com:matheusdoedev/todo-list-manager-api.git
```

## How to run

### 1. Build

```sh
./mvnw clean package
```

#### How to run in Java 17 if your global version is 20

```sh
export JAVA_HOME="[Path to Java installtion]" && ./mvnw clean package

# with ASDF

export JAVA_HOME="$HOME/.asdf/installs/java/openjdk-17.0.2" && ./mvnw clean package
```

- The app will not work in Java version 20 because of an incompatibility with Lombok.

### 2. Run

```sh
java -jar target/api-v1.0.0.jar

# or

export JAVA_HOME="$HOME/.asdf/installs/java/openjdk-17.0.2" && java -jar target/api-v1.0.0.jar
```

## API Docs

- Access this path below to access Swagger documentation.

## Technologies

- Spring
- Spring Boot
- Spring MVC
- Spring Data JPA
- SpringDoc OpenAPI (Swagger)
- MySQL
- Lombok

```
http://localhost:8080/swagger-ui/index.html#/
```

## Contributing

1. Fork it (<git@github.com:matheusdoedev/pizza-army.git>)
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes following conventional commits pattern (`git commit -am 'feat: add some feature'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request
