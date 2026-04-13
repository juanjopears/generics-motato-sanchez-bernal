package ui;

import model.Ciudadano;
import model.Estudiante;
import model.Producto;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Ciudadano> listaCiudadanos = new ArrayList<>();
    private static List<Estudiante> listaEstudiantes = new ArrayList<>();
    private static List<Producto> listaProductos = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n=== SISTEMA DE GESTIÓN ===");
            System.out.println("1. Gestionar Ciudadanos");
            System.out.println("2. Gestionar Estudiantes");
            System.out.println("3. Gestionar Productos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    menuCiudadanos();
                    break;
                case 2:
                    menuEstudiantes();
                    break;
                case 3:
                    menuProductos();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }

    private static void menuCiudadanos() {
        int opcion;
        do {
            System.out.println("\n=== GESTIÓN DE CIUDADANOS ===");
            System.out.println("1. Agregar ciudadano");
            System.out.println("2. Obtener ciudadano por índice");
            System.out.println("3. Buscar ciudadano");
            System.out.println("4. Eliminar ciudadano");
            System.out.println("5. Mostrar todos");
            System.out.println("6. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarCiudadano();
                    break;
                case 2:
                    obtenerCiudadanoPorIndice();
                    break;
                case 3:
                    buscarCiudadano();
                    break;
                case 4:
                    eliminarCiudadano();
                    break;
                case 5:
                    mostrarCiudadanos();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    private static void agregarCiudadano() {
        System.out.print("Ingrese cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        
        Ciudadano ciudadano = new Ciudadano(cedula, nombre, apellido);
        listaCiudadanos.add(ciudadano);
        System.out.println("Ciudadano agregado exitosamente.");
    }

    private static void obtenerCiudadanoPorIndice() {
        System.out.print("Ingrese índice: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        
        try {
            Ciudadano ciudadano = listaCiudadanos.get(indice);
            System.out.println("Ciudadano encontrado: " + ciudadano);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void buscarCiudadano() {
        System.out.print("Ingrese cédula a buscar: ");
        String cedula = scanner.nextLine();
        
        Ciudadano encontrado = null;
        for (Ciudadano c : listaCiudadanos) {
            if (c.buscar(cedula)) {
                encontrado = c;
                break;
            }
        }
        
        if (encontrado != null) {
            System.out.println("Ciudadano encontrado: " + encontrado);
        } else {
            System.out.println("Ciudadano no encontrado.");
        }
    }

    private static void eliminarCiudadano() {
        System.out.print("Ingrese cédula del ciudadano a eliminar: ");
        String cedula = scanner.nextLine();
        
        Ciudadano eliminado = null;
        for (int i = 0; i < listaCiudadanos.size(); i++) {
            if (listaCiudadanos.get(i).buscar(cedula)) {
                eliminado = listaCiudadanos.remove(i);
                break;
            }
        }
        
        if (eliminado != null) {
            System.out.println("Ciudadano eliminado: " + eliminado);
        } else {
            System.out.println("Ciudadano no encontrado.");
        }
    }

    private static void mostrarCiudadanos() {
        for (int i = 0; i < listaCiudadanos.size(); i++) {
            System.out.println(i + ": " + listaCiudadanos.get(i));
        }
    }

    private static void menuEstudiantes() {
        int opcion;
        do {
            System.out.println("\n=== GESTIÓN DE ESTUDIANTES ===");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Obtener estudiante por índice");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Mostrar todos");
            System.out.println("6. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    obtenerEstudiantePorIndice();
                    break;
                case 3:
                    buscarEstudiante();
                    break;
                case 4:
                    eliminarEstudiante();
                    break;
                case 5:
                    mostrarEstudiantes();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    private static void agregarEstudiante() {
        System.out.print("Ingrese código: ");
        Integer codigo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese carrera: ");
        String carrera = scanner.nextLine();
        
        Estudiante estudiante = new Estudiante(codigo, nombre, apellido, carrera);
        listaEstudiantes.add(estudiante);
        System.out.println("Estudiante agregado exitosamente.");
    }

    private static void obtenerEstudiantePorIndice() {
        System.out.print("Ingrese índice: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        
        try {
            Estudiante estudiante = listaEstudiantes.get(indice);
            System.out.println("Estudiante encontrado: " + estudiante);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void buscarEstudiante() {
        System.out.print("Ingrese código a buscar: ");
        Integer codigo = scanner.nextInt();
        scanner.nextLine();
        
        Estudiante encontrado = null;
        for (Estudiante e : listaEstudiantes) {
            if (e.buscar(codigo)) {
                encontrado = e;
                break;
            }
        }
        
        if (encontrado != null) {
            System.out.println("Estudiante encontrado: " + encontrado);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    private static void eliminarEstudiante() {
        System.out.print("Ingrese código del estudiante a eliminar: ");
        Integer codigo = scanner.nextInt();
        scanner.nextLine();
        
        Estudiante eliminado = null;
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).buscar(codigo)) {
                eliminado = listaEstudiantes.remove(i);
                break;
            }
        }
        
        if (eliminado != null) {
            System.out.println("Estudiante eliminado: " + eliminado);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    private static void mostrarEstudiantes() {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            System.out.println(i + ": " + listaEstudiantes.get(i));
        }
    }

    private static void menuProductos() {
        int opcion;
        do {
            System.out.println("\n=== GESTIÓN DE PRODUCTOS ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Obtener producto por índice");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar todos");
            System.out.println("6. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    obtenerProductoPorIndice();
                    break;
                case 3:
                    buscarProducto();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    mostrarProductos();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }

    private static void agregarProducto() {
        System.out.print("Ingrese código: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        
        Producto producto = new Producto(codigo, nombre, precio);
        listaProductos.add(producto);
        System.out.println("Producto agregado exitosamente.");
    }

    private static void obtenerProductoPorIndice() {
        System.out.print("Ingrese índice: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        
        try {
            Producto producto = listaProductos.get(indice);
            System.out.println("Producto encontrado: " + producto);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void buscarProducto() {
        System.out.print("Ingrese código a buscar: ");
        String codigo = scanner.nextLine();
        
        Producto encontrado = null;
        for (Producto p : listaProductos) {
            if (p.buscar(codigo)) {
                encontrado = p;
                break;
            }
        }
        
        if (encontrado != null) {
            System.out.println("Producto encontrado: " + encontrado);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void eliminarProducto() {
        System.out.print("Ingrese código del producto a eliminar: ");
        String codigo = scanner.nextLine();
        
        Producto eliminado = null;
        for (int i = 0; i < listaProductos.size(); i++) {
            if (listaProductos.get(i).buscar(codigo)) {
                eliminado = listaProductos.remove(i);
                break;
            }
        }
        
        if (eliminado != null) {
            System.out.println("Producto eliminado: " + eliminado);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void mostrarProductos() {
        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.println(i + ": " + listaProductos.get(i));
        }
    }
}
