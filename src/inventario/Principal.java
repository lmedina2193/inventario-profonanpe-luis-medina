package inventario;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("INVENTARIO DE EQUIPOS - CASO PROFONANPE");
        System.out.println("Prototipo academico - Luis Medina Quispe - Datos de prueba");
        Inventario inventario = new Inventario();
        Scanner teclado = new Scanner(System.in);
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n1 Registrar | 2 Listar | 3 Buscar | 4 Asignar | 5 Estado | 0 Salir");
            try {
                if (!teclado.hasNextLine()) { break; }
                opcion = Integer.parseInt(teclado.nextLine().trim());
                switch (opcion) {
                    case 1:
                        System.out.print("Codigo: "); String codigo = teclado.nextLine();
                        System.out.print("Tipo (Laptop, PC, Monitor, etc.): "); String tipo = teclado.nextLine();
                        System.out.print("Marca: "); String marca = teclado.nextLine();
                        System.out.print("Modelo: "); String modelo = teclado.nextLine();
                        System.out.print("Serie: "); String serie = teclado.nextLine();
                        inventario.registrar(new Equipo(codigo, tipo, marca, modelo, serie));
                        System.out.println("Equipo registrado.");
                        break;
                    case 2:
                        if (inventario.cantidad() == 0) { System.out.println("No hay equipos registrados."); }
                        for (Equipo equipo : inventario.listar()) { System.out.println(equipo); }
                        System.out.println("Total de equipos: " + inventario.cantidad());
                        break;
                    case 3:
                        System.out.print("Codigo a buscar: ");
                        System.out.println(inventario.buscar(teclado.nextLine()));
                        break;
                    case 4:
                        System.out.print("Codigo: "); String codigoAsignar = teclado.nextLine();
                        System.out.print("Area: "); String area = teclado.nextLine();
                        System.out.print("Responsable: "); String responsable = teclado.nextLine();
                        inventario.asignar(codigoAsignar, area, responsable);
                        System.out.println("Asignacion registrada. Estado: En uso.");
                        break;
                    case 5:
                        System.out.print("Codigo: "); String codigoEstado = teclado.nextLine();
                        System.out.println("1 Disponible | 2 En uso | 3 Mantenimiento | 4 Baja");
                        int seleccion = Integer.parseInt(teclado.nextLine().trim());
                        String[] estados = {"Disponible", "En uso", "Mantenimiento", "Baja"};
                        if (seleccion < 1 || seleccion > 4) { throw new IllegalArgumentException("Estado no permitido."); }
                        inventario.cambiarEstado(codigoEstado, estados[seleccion - 1]);
                        System.out.println("Estado actualizado.");
                        break;
                    case 0:
                        System.out.println("Programa terminado.");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            } catch (NumberFormatException error) {
                System.out.println("Ingrese una opcion numerica.");
            } catch (IllegalArgumentException error) {
                System.out.println("Error: " + error.getMessage());
            } catch (java.util.NoSuchElementException error) {
                System.out.println("Entrada finalizada.");
                break;
            }
        }
        teclado.close();
    }
}
