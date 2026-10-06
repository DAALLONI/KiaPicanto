package main;

import base.*;
import complements.*;

public class Main {
    public static void main(String[] args) {
        // 1. Creamos el Kia Picanto base
        KiaPicanto car = new ZenithAT();

        System.out.println("=== Kia Picanto - Patrón Decorator ===");
        System.out.println("Configuración inicial:");
        System.out.println("Descripción: " + car.getDescription());
        System.out.printf("Precio: $%,.0f%n%n", car.cost());

        // 2. Agregamos un accesorio: rines de aluminio
        car = new AluminumRin14A(car);

        // 3. Agregamos otro accesorio sobre el anterior
        car = new ParkingSensor(car);

        // 4. Agregamos un tercer accesorio
        car = new CargoNet(car);

        System.out.println("Configuración con accesorios:");
        System.out.println("Descripción: " + car.getDescription());
        System.out.printf("Precio final: $%,.0f%n", car.cost());
    }
}
