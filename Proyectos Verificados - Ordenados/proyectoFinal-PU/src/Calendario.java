
import java.util.Locale;


public class Calendario {

    private final Cita[] cita;

    public Calendario() {
        cita = new Cita[30];
    }

    public Cita getCita(int posicion) {
        return (cita[posicion - 1] == null) ? null : cita[posicion - 1];
    }

    public Cita getCita(String nombreEstudiante) {
        Cita citaVacia = new Cita();
        for (int i = 0; i < cita.length; i++) {
            if (getCita(i).getNombreEstudiante().equalsIgnoreCase(nombreEstudiante)) {
                return cita[i];
            }
            else{
                return null;
            }
        }
        return citaVacia;
    }

    public int getSiguienteDisponible() {
        for (int i = 0; i < 29; i++) {
            if (cita[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void setCita(Cita cita) {
        this.cita[getSiguienteDisponible()] = cita;
    }

    public void eliminarCita(int posicion) {
        cita[posicion - 1] = null;
    }

    public void mostrarCalendario() {

        ancho();
        anchoCasillas();
        for (int i = 0; i < cita.length; i++) {
            if (i <= 9) {
                if (i == 9) {
                    if (cita[i] == null) {
                        System.out.print("|   10     | ");
                    } else {
                        if (cita[i].getTipoClase().equalsIgnoreCase("Canto")) {
                            System.out.print("|  10   " + ("\u001B[31m" + "O" + "\u001B[0m") + "  | ");
                        } else if (cita[i].getTipoClase().equalsIgnoreCase("Magia")) {
                            System.out.print("|  10   " + ("\u001B[34m" + "O" + "\u001B[0m") + "  | ");
                        } else if (cita[i].getTipoClase().equalsIgnoreCase("Duelo")) {
                            System.out.print("|  10   " + ("\u001B[33m" + "O" + "\u001B[0m") + "  | ");
                        } else if (cita[i].getTipoClase().equalsIgnoreCase("Lucha")) {
                            System.out.print("|  10   " + ("\u001B[32m" + "O" + "\u001B[0m") + "  | ");
                        }
                    }
                } else {
                    if (cita[i] == null) {
                        System.out.print("|   " + (i + 1) + "      | ");
                    } else {
                        if (cita[i].getTipoClase().equalsIgnoreCase("Canto")) {
                            System.out.print("|  " + (i + 1) + "   " + ("\u001B[31m" + "O" + "\u001B[0m") + "   | ");
                        } else if (cita[i].getTipoClase().equalsIgnoreCase("Magia")) {
                            System.out.print("|  " + (i + 1) + "   " + ("\u001B[34m" + "O" + "\u001B[0m") + "   | ");
                        } else if (cita[i].getTipoClase().equalsIgnoreCase("Duelo")) {
                            System.out.print("|  " + (i + 1) + "   " + ("\u001B[33m" + "O" + "\u001B[0m") + "   | ");
                        } else if (cita[i].getTipoClase().equalsIgnoreCase("Lucha")) {
                            System.out.print("|  " + (i + 1) + "   " + ("\u001B[32m" + "O" + "\u001B[0m") + "   | ");
                        }
                    }
                }
            } else {
                break;
            }

        }
        System.out.println();
        anchoCasillas();
        ancho();
        anchoCasillas();
        for (int i = 10; i < cita.length; i++) {
            if (i >= 10 && i <= 19) {
                if (cita[i] == null) {
                    System.out.print("|  " + (i + 1) + "      | ");
                } else {
                    if (cita[i].getTipoClase().equalsIgnoreCase("Canto")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[31m" + "O" + "\u001B[0m") + "  | ");
                    } else if (cita[i].getTipoClase().equalsIgnoreCase("Magia")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[34m" + "O" + "\u001B[0m") + "  | ");
                    } else if (cita[i].getTipoClase().equalsIgnoreCase("Duelo")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[33m" + "O" + "\u001B[0m") + "  | ");
                    } else if (cita[i].getTipoClase().equalsIgnoreCase("Lucha")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[32m" + "O" + "\u001B[0m") + "  | ");
                    }
                }
            } else {
                break;
            }
        }
        System.out.println();
        anchoCasillas();
        ancho();
        anchoCasillas();
        for (int i = 20; i < cita.length; i++) {
            if (i >= 20 && i <= 29) {
                if (cita[i] == null) {
                    System.out.print("|  " + (i + 1) + "      | ");
                } else {
                    if (cita[i].getTipoClase().equalsIgnoreCase("Canto")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[31m" + "O" + "\u001B[0m") + "  | ");
                    } else if (cita[i].getTipoClase().equalsIgnoreCase("Magia")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[34m" + "O" + "\u001B[0m") + "  | ");
                    } else if (cita[i].getTipoClase().equalsIgnoreCase("Duelo")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[33m" + "O" + "\u001B[0m") + "  | ");
                    } else if (cita[i].getTipoClase().equalsIgnoreCase("Lucha")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[32m" + "O" + "\u001B[0m") + "  | ");
                    }
                }
            } else {
                break;
            }
        }
        System.out.println();
        anchoCasillas();
        ancho();
    }

    public void mostrarCalendarioDetalle() {
        String texto;
        String extraer;
        ancho();
        anchoCasillas();
        for (int i = 0; i < cita.length; i++) {
            if (i <= 9) {
                if (i == 9) {
                    if (cita[i] == null) {
                        System.out.print("|   10     | ");
                    } else {
                        if (cita[i].getTipoClase().equalsIgnoreCase("Canto")) {
                            System.out.print("|  10   " + ("\u001B[31m" + "O" + "\u001B[0m") + "  | ");
                        } else if (cita[i].getTipoClase().equalsIgnoreCase("Magia")) {
                            System.out.print("|  10   " + ("\u001B[34m" + "O" + "\u001B[0m") + "  | ");
                        } else if (cita[i].getTipoClase().equalsIgnoreCase("Duelo")) {
                            System.out.print("|  10   " + ("\u001B[33m" + "O" + "\u001B[0m") + "  | ");
                        } else if (cita[i].getTipoClase().equalsIgnoreCase("Lucha")) {
                            System.out.print("|  10   " + ("\u001B[32m" + "O" + "\u001B[0m") + "  | ");
                        }
                    }
                } else {
                    if (cita[i] == null) {
                        System.out.print("|   " + (i + 1) + "      | ");
                    } else {
                        if (cita[i].getTipoClase().equalsIgnoreCase("Canto")) {
                            System.out.print("|  " + (i + 1) + "   " + ("\u001B[31m" + "O" + "\u001B[0m") + "   | ");
                        } else if (cita[i].getTipoClase().equalsIgnoreCase("Magia")) {
                            System.out.print("|  " + (i + 1) + "   " + ("\u001B[34m" + "O" + "\u001B[0m") + "   | ");
                        } else if (cita[i].getTipoClase().equalsIgnoreCase("Duelo")) {
                            System.out.print("|  " + (i + 1) + "   " + ("\u001B[33m" + "O" + "\u001B[0m") + "   | ");
                        } else if (cita[i].getTipoClase().equalsIgnoreCase("Lucha")) {
                            System.out.print("|  " + (i + 1) + "   " + ("\u001B[32m" + "O" + "\u001B[0m") + "   | ");
                        }
                    }
                }
            } else {
                break;
            }

        }
        System.out.println();
        for (int i = 0; i < cita.length; i++) {
            if (i >= 0 && i <= 9) {
                if (cita[i] == null) {
                    System.out.print("|          | ");
                } else {
                    texto = cita[i].getMaestro().toUpperCase();
                    extraer = texto.substring(0, 3);
                    System.out.print("|   " + (extraer) + "    | ");
                }

            } else {
                break;
            }

        }
        System.out.println();
        anchoCasillas();
        ancho();
        anchoCasillas();
        for (int i = 10; i < cita.length; i++) {
            if (i >= 10 && i <= 19) {
                if (cita[i] == null) {
                    System.out.print("|  " + (i + 1) + "      | ");
                } else {
                    if (cita[i].getTipoClase().equalsIgnoreCase("Canto")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[31m" + "O" + "\u001B[0m") + "  | ");
                    } else if (cita[i].getTipoClase().equalsIgnoreCase("Magia")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[34m" + "O" + "\u001B[0m") + "  | ");
                    } else if (cita[i].getTipoClase().equalsIgnoreCase("Duelo")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[33m" + "O" + "\u001B[0m") + "  | ");
                    } else if (cita[i].getTipoClase().equalsIgnoreCase("Lucha")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[32m" + "O" + "\u001B[0m") + "  | ");
                    }
                }
            } else {
                break;
            }
        }
        System.out.println();
        for (int i = 10; i < cita.length; i++) {
            if (i >= 10 && i <= 19) {
                if (cita[i] == null) {
                    System.out.print("|          | ");
                } else {
                    texto = cita[i].getMaestro().toUpperCase();
                    extraer = texto.substring(0, 3);
                    System.out.print("|   " + (extraer) + "    | ");
                }

            } else {
                break;
            }

        }
        System.out.println();
        anchoCasillas();
        ancho();
        anchoCasillas();
        for (int i = 20; i < cita.length; i++) {
            if (i >= 20 && i <= 29) {
                if (cita[i] == null) {
                    System.out.print("|  " + (i + 1) + "      | ");
                } else {
                    if (cita[i].getTipoClase().equalsIgnoreCase("Canto")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[31m" + "O" + "\u001B[0m") + "  | ");
                    } else if (cita[i].getTipoClase().equalsIgnoreCase("Magia")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[34m" + "O" + "\u001B[0m") + "  | ");
                    } else if (cita[i].getTipoClase().equalsIgnoreCase("Duelo")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[33m" + "O" + "\u001B[0m") + "  | ");
                    } else if (cita[i].getTipoClase().equalsIgnoreCase("Lucha")) {
                        System.out.print("|  " + (i + 1) + "   " + ("\u001B[32m" + "O" + "\u001B[0m") + "  | ");
                    }
                }
            } else {
                break;
            }
        }
        System.out.println();
        for (int i = 19; i < cita.length; i++) {
            if (i >= 19 && i <= 29) {
                if (cita[i] == null) {
                    System.out.print("|          | ");
                } else {
                    texto = cita[i].getMaestro().toUpperCase();
                    extraer = texto.substring(0, 3);
                    System.out.print("|    " + (extraer) + "   | ");
                }

            } else {
                break;
            }

        }
        System.out.println();
        anchoCasillas();
        ancho();
    }

    public String baseSimple() {
        return ("------------ ");
    }

    public String rellenoSimple() {
        return ("|          | ");
    }

    public void ancho() {
        int n = 1;
        while (n <= 10) {
            System.out.print(baseSimple());
            n++;
        }
        System.out.println();
    }

    public void anchoCasillas() {
        int j = 1;
        while (j <= 10) {
            System.out.print(rellenoSimple());
            j++;
        }
        System.out.println();
    }

    public void generarListaCitas() {
        for (int i = 0; i < cita.length; i++) {
            if (!(cita[i] == null)) {
                System.out.format("%4d %s %-20s %s %-15s %s %-8s %s %-12s %n", (i + 1), "     ", cita[i].getNombreEstudiante(), "  ", cita[i].getMaestro(), "  ", cita[i].getTipoClase(), "         ", cita[i].getTipoPago());
            } else {
                System.out.format("%4d %s %-20s %n", (i + 1), "     ", "***Dia Disponible***");
            }

        }
    }

}
