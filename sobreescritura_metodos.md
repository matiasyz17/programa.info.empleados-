# Sobreescritura de Métodos en Java

## ¿Qué es la Sobreescritura de Métodos?

yo entendi que la sobreescritura (override) es el mecanismo mediante el cual una clase hija redefine un método heredado de una clase padre, proporcionando una implementación diferente.

Ejemplo conceptual

Supongamos una clase base:

### Características  

- Requiere herencia.
- El método debe tener el mismo nombre.
- Debe tener los mismos parámetros.
- Permite el polimorfismo.

---

## Ejemplo de Sobreescritura de Métodos

```java
class Animal {

    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal miPerro = new Perro();

        miPerro.hacerSonido();
    }
}
```

### Salida

```text
El perro ladra
```

---

# Parámetros Posicionales en Java

En Java los parámetros se pasan de forma posicional, es decir, respetando el orden en que fueron definidos.

## Ejemplo

```java
public class Main {

    public static void presentar(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        presentar("Milan", 18);
    }
}
```

### Salida
la sobreescritura (override) es el mecanismo mediante el cual una clase hija redefine un método heredado de una clase padre, proporcionando una implementación diferente.

Ejemplo conceptual

Supongamos una clase base:
```text
Nombre: Milan
Edad: 18
```

---

# Parámetros Nombrados

.

## Ejemplo

```java
class Persona {

    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

public class Main {

    public static void presentar(Persona persona) {
        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Edad: " + persona.edad);
    }

    public static void main(String[] args) {

        Persona persona = new Persona(
            "Milan",
            18
        );

        presentar(persona);
    }
}
```

### Salida

```text
Nombre: Milan
Edad: 18
```

---


---

