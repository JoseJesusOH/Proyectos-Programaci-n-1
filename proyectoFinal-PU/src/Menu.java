
import java.util.Locale;
import java.util.Scanner;

public class Menu {

    private final Calendario calendario;

    public Menu() {
        calendario = new Calendario();
    }

    public void desplegarMenu() {
        boolean continuar = true;
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        System.out.println("************************MENÚ PRINCIPAL************************");
        System.out.println("1. Registrar nueva cita");
        System.out.println("2. Eliminar cita");
        System.out.println("3. Mostrar información de una cita de un alumno en particular");
        System.out.println("4. Editar cita registrada");
        System.out.println("5. Mostrar calendario de citas");
        System.out.println("6. Lista de citas");
        System.out.println("7. Terminar operación");
        System.out.println("");
        while (continuar == true) {
            System.out.print("Teclee su opción: ");
            int opcionPrueba = teclado.nextInt();
            if (opcionPrueba >= 1 && opcionPrueba <= 7) {
                opcion = opcionPrueba;
                break;
            } else {
                System.out.println("Opción no válida, ingrese una del 1 al 7”.");
            }
        }
        System.out.println();
        switch (opcion) {
            case 1:
                registrarCita();
                break;
            case 2:
                eliminarCita();
                break;
            case 3:
                mostrarInformacionCitas();
                break;
            case 4:
                editarCita();
                break;
            case 5:
                mostrarCalendarioCitas();
                break;
            case 6:
                generarListaCitas();
                break;

            case 7:
                System.out.println("Tenga un buen dia :)");
                break;

        }
        teclado.nextLine();
    }

    private void registrarCita() {
        Scanner teclado = new Scanner(System.in);

        String nombreEstudiante, maestro, tipoClase = "", tipoPago;

        boolean sig = true;
        char confirmacion = 0;

        char confirmacionContinuar = 0;

        while (sig == true) {
            int dia = calendario.getSiguienteDisponible();
            if (dia == -1) {
                System.out.println("No hay clases disponibles");
                System.out.println("-------------------------------------------------");
                break;
            }
            System.out.print("Ingrese el nombre del estudiante: ");
            nombreEstudiante = teclado.nextLine();

            System.out.print("Maestro: ");
            maestro = teclado.nextLine();

            while (sig = true) {
                System.out.print("Tipo de clase: ");
                String tipoClasePrueba = teclado.nextLine();
                if (tipoClasePrueba.equalsIgnoreCase("Magia") || tipoClasePrueba.equalsIgnoreCase("Duelo") || tipoClasePrueba.equalsIgnoreCase("Canto") || tipoClasePrueba.equalsIgnoreCase("Lucha")) {
                    tipoClase = tipoClasePrueba;
                    break;
                } else {
                    System.out.println("Usted ha ingresado una clase Incorrecta O ha escrito una letra demas. \n Porfavor verifique su respuesta al ingresar");
                }
            }

            System.out.print("Tipo de pago: ");
            tipoPago = teclado.nextLine();

            System.out.println("-----------------Confirmación--------------------");
            System.out.println("Nombre del estudiante: " + nombreEstudiante);
            System.out.println("Maestro: " + maestro);
            System.out.println("Tipo de Clase: " + tipoClase);
            System.out.println("Tipo de Pago: " + tipoPago);
            System.out.println("Dia Asignado: " + (dia + 1));

            while (sig == true) {
                System.out.println("¿Confirmar el registro? (S/N)");
                char pruebaConfirmar = teclado.next().charAt(0);
                pruebaConfirmar = Character.toUpperCase(pruebaConfirmar);
                if (pruebaConfirmar == 'S' || pruebaConfirmar == 'N') {
                    confirmacion = pruebaConfirmar;
                    break;
                } else {
                    System.out.println("Escriba una opción valida (S/N)");
                }
            }
            if (confirmacion == 'S') {
                Cita cita = new Cita(nombreEstudiante, maestro, tipoClase, tipoPago);
                calendario.setCita(cita);
            } else {
                System.out.println("-------------------------------------------------");
            }
            while (sig == true) {
                System.out.println("¿Desea continuar con otra cita(s/n)?");
                char pruebaCita = teclado.next().charAt(0);
                pruebaCita = Character.toUpperCase(pruebaCita);
                if (pruebaCita == 'S' || pruebaCita == 'N') {
                    confirmacionContinuar = pruebaCita;
                    break;
                } else {
                    System.out.println("Escriba una opción valida (S/N)");
                }
            }
            if (confirmacionContinuar == 'S') {
                System.out.println("Ingrese los datos de la nueva cita");
                System.out.println("----------------------------------");
                teclado.nextLine();
            } else if (confirmacionContinuar == 'N') {
                break;
            }
        }
        desplegarMenu();
    }

    private void eliminarCita() {
        Scanner teclado = new Scanner(System.in);
        boolean sig = true;
        char confirmacionDesocupar = 0;
        char confirmacionLiberar = 0;
        calendario.mostrarCalendario();
        System.out.println();

        while (sig == true) {
            System.out.print("Ingrese el número de día: ");
            int posicion = teclado.nextInt();
            teclado.nextLine();
            if (calendario.getCita(posicion) == null) {
                System.out.println("Error en número de día no está asignado");
                while (sig == true) {
                    System.out.println("¿Desea liberar otra cita(s/n)?");
                    char pruebaCita = teclado.next().charAt(0);
                    pruebaCita = Character.toUpperCase(pruebaCita);
                    if (pruebaCita == 'S' || pruebaCita == 'N') {
                        confirmacionLiberar = pruebaCita;
                        break;
                    } else {
                        System.out.println("Escriba una opción valida (S/N)");
                    }
                }
                if (confirmacionLiberar == 'N') {
                    break;
                }
            } else {
                System.out.println("------------------Confirmación--------------------");
                System.out.println("Nombre del estudiante: " + calendario.getCita(posicion).getNombreEstudiante());
                System.out.println("Maestro: " + calendario.getCita(posicion).getMaestro());
                System.out.println("Tipo de Clase: " + calendario.getCita(posicion).getTipoClase());
                System.out.println("Tipo de Pago: " + calendario.getCita(posicion).getTipoPago());
                System.out.println("Dia Asignado: " + posicion);

                while (sig == true) {
                    System.out.println("¿Confirma que desea desocupar el día? (S/N)");
                    char pruebaDesocupar = teclado.next().charAt(0);
                    pruebaDesocupar = Character.toUpperCase(pruebaDesocupar);
                    if (pruebaDesocupar == 'S' || pruebaDesocupar == 'N') {
                        confirmacionDesocupar = pruebaDesocupar;
                        break;
                    } else {
                        System.out.println("Escriba una opción valida (S/N)");
                    }
                }
                if (confirmacionDesocupar == 'S') {
                    calendario.eliminarCita(posicion);
                }

                while (sig == true) {
                    System.out.println("¿Desea liberar otra cita(s/n)?");
                    char pruebaCita = teclado.next().charAt(0);
                    pruebaCita = Character.toUpperCase(pruebaCita);
                    if (pruebaCita == 'S' || pruebaCita == 'N') {
                        confirmacionLiberar = pruebaCita;
                        break;
                    } else {
                        System.out.println("Escriba una opción valida (S/N)");
                    }
                }
                if (confirmacionLiberar == 'N') {
                    break;
                }
            }
        }
        System.out.println();
        desplegarMenu();
    }

    private void mostrarInformacionCitas() {
        Scanner teclado = new Scanner(System.in);
        boolean sig;
        char confirmacionMuestra = 0;
        while (sig = true) {
            System.out.println("Porfavor Ingrese el Nombre del Estudiante; ");
            String nombreEstudiante = teclado.nextLine();
            if (calendario.getCita(nombreEstudiante)==null){
                 System.out.print("El estudiante proporcionado no esta registrado");
                System.out.print("----------------------------------------------");
                while (sig == true) {
                    System.out.println("¿Desea verificar la informacion de otro estudiante?(s/n)");
                    char pruebaMuestra = teclado.next().charAt(0);
                    pruebaMuestra = Character.toUpperCase(pruebaMuestra);
                    if (pruebaMuestra == 'S' || pruebaMuestra == 'N') {
                        confirmacionMuestra = pruebaMuestra;
                        break;
                    } else {
                        System.out.println("Escriba una opción valida (S/N)");
                    }
                }
                if (confirmacionMuestra == 'N') {
                    break;
                }
            }
            else{
                System.out.println("------------------Confirmación--------------------");
                System.out.println("Nombre del estudiante: " + calendario.getCita(nombreEstudiante).getNombreEstudiante());
                System.out.println("Maestro: " + calendario.getCita(nombreEstudiante).getMaestro());
                System.out.println("Tipo de Clase: " + calendario.getCita(nombreEstudiante).getTipoClase());
                System.out.println("Tipo de Pago: " + calendario.getCita(nombreEstudiante).getTipoPago());

                while (sig == true) {
                    System.out.println("¿Desea verificar la informacion de otro estudiante?(s/n)");
                    char pruebaMuestra = teclado.next().charAt(0);
                    teclado.nextLine();
                    pruebaMuestra = Character.toUpperCase(pruebaMuestra);
                    if (pruebaMuestra == 'S' || pruebaMuestra == 'N') {
                        confirmacionMuestra = pruebaMuestra;
                        break;
                    } else {
                        System.out.println("Escriba una opción valida (S/N)");
                    }
                }

                if (confirmacionMuestra == 'N') {
                    break;
                }
            }
            
            

        }
        desplegarMenu();
    }

    private void editarCita() {
        Scanner teclado = new Scanner(System.in);
        boolean sig = true;
        char confirmacionEditar = 0;
        char confirmacionAceptar = 0;
        calendario.mostrarCalendario();
        System.out.println();
        while (sig == true) {
            System.out.print("Ingrese el número de día: ");
            int posicion = teclado.nextInt();
            teclado.nextLine();
            if (calendario.getCita(posicion) == null) {
                System.out.println("Error en número de día no está asignado");
                while (sig == true) {
                    System.out.println("¿Desea actualizar los datos de otra cita?(S/N)");
                    char pruebaEditar = teclado.next().charAt(0);
                    pruebaEditar = Character.toUpperCase(pruebaEditar);
                    if (pruebaEditar == 'S' || pruebaEditar == 'N') {
                        confirmacionEditar = pruebaEditar;
                        break;
                    } else {
                        System.out.println("Escriba una opción valida (S/N)");
                    }
                }
                if (confirmacionEditar == 'N') {
                    break;
                }
            } else {
                System.out.println("------------------Confirmación--------------------");
                System.out.println("Nombre del estudiante: " + calendario.getCita(posicion).getNombreEstudiante());
                System.out.println("Maestro: " + calendario.getCita(posicion).getMaestro());
                System.out.println("Tipo de Clase: " + calendario.getCita(posicion).getTipoClase());
                System.out.println("Tipo de Pago: " + calendario.getCita(posicion).getTipoPago());
                System.out.println("Dia Asignado: " + posicion);
                while (sig == true) {
                    System.out.println("¿Desea Modificar los datos? (S/N)");
                    char pruebaEditar = teclado.next().charAt(0);
                    pruebaEditar = Character.toUpperCase(pruebaEditar);
                    if (pruebaEditar == 'S' || pruebaEditar == 'N') {
                        confirmacionAceptar = pruebaEditar;
                        break;
                    } else {
                        System.out.println("Escriba una opción valida (S/N)");
                    }
                }
                if (confirmacionAceptar == 'S') {
                    System.out.println("----------Editando a " + calendario.getCita(posicion).getNombreEstudiante() + "-------------");
                    teclado.nextLine();
                    System.out.print("Nombre de maestro (" + calendario.getCita(posicion).getMaestro() + ") : ");
                    String maestro = teclado.nextLine();
                    System.out.print("Tipo de pago (" + calendario.getCita(posicion).getTipoPago() + ") : ");
                    String tipoPago = teclado.nextLine();
                    System.out.println();
                    System.out.println("------------------Confirmación--------------------");
                    System.out.println("Nombre del estudiante: " + calendario.getCita(posicion).getNombreEstudiante());
                    System.out.println("Maestro: " + maestro);
                    System.out.println("Tipo de Clase: " + calendario.getCita(posicion).getTipoClase());
                    System.out.println("Tipo de Pago: " + tipoPago);
                    System.out.println("Dia Asignado: " + posicion);
                    while (sig == true) {
                        System.out.println("¿Desea Modificar los datos? (S/N)");
                        char pruebaEditar = teclado.next().charAt(0);
                        pruebaEditar = Character.toUpperCase(pruebaEditar);
                        if (pruebaEditar == 'S' || pruebaEditar == 'N') {
                            confirmacionAceptar = pruebaEditar;
                            break;
                        } else {
                            System.out.println("Escriba una opción valida (S/N)");
                        }
                    }
                    if (confirmacionAceptar == 'S') {
                        calendario.getCita(posicion).setMaestro(maestro);
                        calendario.getCita(posicion).setTipoPago(tipoPago);
                    } else {
                        System.out.println("-------------------------------------------------");
                    }
                }
                while (sig == true) {
                    System.out.println("¿Desea actualizar los datos de otra cita?(S/N)");
                    char pruebaEditar = teclado.next().charAt(0);
                    pruebaEditar = Character.toUpperCase(pruebaEditar);
                    if (pruebaEditar == 'S' || pruebaEditar == 'N') {
                        confirmacionEditar = pruebaEditar;
                        break;
                    } else {
                        System.out.println("Escriba una opción valida (S/N)");
                    }
                }
                if (confirmacionEditar == 'N') {
                    break;
                }
            }
        }
        System.out.println();
        desplegarMenu();

    }

    private void mostrarCalendarioCitas() {
        Scanner teclado = new Scanner(System.in);
        calendario.mostrarCalendarioDetalle();
        System.out.println("Presione la tecla enter para Continuar");
        teclado.nextLine();
        desplegarMenu();
    }

    private void generarListaCitas() {
        Scanner teclado = new Scanner(System.in);
        System.out.printf("%5s %25s %14s %21s %16s %n", "Dia", "Nombre de estudiante", "Maestro", "Tipo de clase", "Tipo de pago");
        System.out.printf("%s %23s %18s %18s %15s %n", "-------", "--------------------", "---------------", "---------------", "------------");
        calendario.generarListaCitas();
        System.out.println("Presione la tecla enter para Continuar");
        teclado.nextLine();
        desplegarMenu();
    }

}
