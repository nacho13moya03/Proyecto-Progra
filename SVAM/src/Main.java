/**
 * This is a backupe system for a company
 *
 * Please see the {@link github.com/nacho13moya03} link for true identity
 * @author Ignacio Moya
 *
 */
import javax.swing.*;


public class Main {


    private static Integer sede;
    public static Integer colab;
    public static Integer produc;
    public static Integer time;


    public static void main(String[] args) throws InterruptedException {


        Horario hora = new Horario();
        Sucursal suc = new Sucursal();
        Colaborador cola = new Colaborador();
        Producto prod = new Producto();

        suc.setSede1("Grecia");
        suc.setSede2("City Mall");
        suc.setSede3("Heredia");
        cola.setC01("Ignacio Moya");
        cola.setC02("Jhon Moya");
        cola.setC03("Steven Ocampo");
        cola.setC04("Juan Perez");
        cola.setC05("Pedro Alvarado");
        hora.setTemprano("8:00am - 1:00pm");
        hora.setTarde("1:00pm - 7:00pm");

        prod.setProd01("Neuro Norm");
        prod.setProd02("Strenolax");
        prod.setProd03("Eucalibon");
        prod.setProd04("Circulan");
        prod.setProd05("Guayacol");
        prod.setProd06("Acondicionador");

        JOptionPane.showMessageDialog(null,"Bienvenido al Sistema de Ventas Autonomo para Macrobioticas\n"+
        "En este sistema se van a realizar diversas interacciones para lograr el mejor rendimiento posible\n"+
        "Antes de continuar primero debes seleccionar la sede");
        System.out.println("Bienvenido al Sistema de Ventas Autonomo para Macrobioticas");
        System.out.println("En este sistema se van a realizar diversas interacciones para lograr el mejor rendimiento posible");
        System.out.println("De igual forma se va a interactuar con la consola a como con pestañas emergentes");
        System.out.println("Antes de continuar primero debes seleccionar la sede");
        Thread.sleep(1000);
        while (true){

            sede = Integer.parseInt(JOptionPane.showInputDialog(null, "Las sede disponibles son las siguientes"+"\n"+
                                                                    "1. Grecia" + "\n"+
                                                                    "2. City Mall" + "\n"+
                                                                    "3. Heredia"+ "\n"+
                                                                    "4. Salir"));
            if (sede == 1) {

                JOptionPane.showMessageDialog(null,"Bienvenido a la sede de "+suc.getSede1());
                JOptionPane.showMessageDialog(null,"En este apartado podras hacer las ventas para la sucursal de Grecia");
                JOptionPane.showMessageDialog(null,"Antes de continuar ingrese su codigo de vendedor");
                while (true) {
                    colab = Integer.parseInt(JOptionPane.showInputDialog(null, "Vendedor"));
                    if (colab == 1) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+cola.getC01());
                        break;
                    } else if (colab == 02) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+cola.getC02());
                        break;
                    } else if (colab == 03) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+"El vendedor es:"+cola.getC03());
                        break;
                    } else if (colab == 04) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+cola.getC04());
                        break;
                    } else if (colab == 05) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+cola.getC05());
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error, intentelo nuevamente");
                    }
                }
                while (true) {
                    time = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el horario en el cual el cliente esta realizando la compra" + "\n" +
                            "1. Temprano" + "\n" +
                            "2. Tarde"));
                    if (time == 1) {
                        JOptionPane.showMessageDialog(null, "El horario seleccionado es: " + hora.getTemprano());
                        break;
                    } else if (time == 2) {
                        JOptionPane.showMessageDialog(null, "El horario seleccionado es: " + hora.getTarde());
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, intente nuevamente");
                    }
                }
                while(true){
                    produc = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Producto #1: "+prod.getProd01()+
                    "\nProducto #2: "+prod.getProd02()+
                    "\nProducto #3: "+prod.getProd03()+
                    "\nProducto #4: "+prod.getProd04()+
                    "\nProducto #5: "+prod.getProd05()+
                    "\nProducto #6: "+prod.getProd06()+
                    "\nIngrese el producto que desea el cliente"));
                    if (produc == 1){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 2){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 3){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 4){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 5){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 6){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "Error, intente nuevamente");
                    }
                }
            } else if(sede == 2){
                System.out.println("Bienvenido a la sede de "+suc.getSede2());
                JOptionPane.showMessageDialog(null,"Bienvenido a la sede de "+suc.getSede2());
                JOptionPane.showMessageDialog(null,"En este apartado podras hacer las ventas para la sucursal de Grecia");
                JOptionPane.showMessageDialog(null,"Antes de continuar ingrese su codigo de vendedor");
                while (true) {
                    colab = Integer.parseInt(JOptionPane.showInputDialog(null, "Vendedor"));
                    if (colab == 1) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+cola.getC01());
                        break;
                    } else if (colab == 02) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+cola.getC02());
                        break;
                    } else if (colab == 03) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+"El vendedor es:"+cola.getC03());
                        break;
                    } else if (colab == 04) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+cola.getC04());
                        break;
                    } else if (colab == 05) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+cola.getC05());
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error, intentelo nuevamente");
                    }
                }
                while (true) {
                    time = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el horario en el cual el cliente esta realizando la compra" + "\n" +
                            "1. Temprano" + "\n" +
                            "2. Tarde"));
                    if (time == 1) {
                        JOptionPane.showMessageDialog(null, "El horario seleccionado es: " + hora.getTemprano());
                        break;
                    } else if (time == 2) {
                        JOptionPane.showMessageDialog(null, "El horario seleccionado es: " + hora.getTarde());
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, intente nuevamente");
                    }
                }
                while(true){
                    produc = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Producto #1: "+prod.getProd01()+
                    "\nProducto #2: "+prod.getProd02()+
                    "\nProducto #3: "+prod.getProd03()+
                    "\nProducto #4: "+prod.getProd04()+
                    "\nProducto #5: "+prod.getProd05()+
                    "\nProducto #6: "+prod.getProd06()+
                    "\nIngrese el producto que desea el cliente"));
                    if (produc == 1){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 2){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 3){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 4){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 5){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 6){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "Error, intente nuevamente");
                    }
                }
            } else if(sede == 3){
                JOptionPane.showMessageDialog(null,"Bienvenido a la sede de "+suc.getSede3());
                JOptionPane.showMessageDialog(null,"En este apartado podras hacer las ventas para la sucursal de Grecia");
                JOptionPane.showMessageDialog(null,"Antes de continuar ingrese su codigo de vendedor");
                while (true) {
                    colab = Integer.parseInt(JOptionPane.showInputDialog(null, "Vendedor"));
                    if (colab == 1) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+cola.getC01());
                        break;
                    } else if (colab == 02) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+cola.getC02());
                        break;
                    } else if (colab == 03) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+"El vendedor es:"+cola.getC03());
                        break;
                    } else if (colab == 04) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+cola.getC04());
                        break;
                    } else if (colab == 05) {
                        JOptionPane.showMessageDialog(null,"El vendedor es: "+cola.getC05());
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error, intentelo nuevamente");
                    }
                }
                while (true) {
                    time = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el horario en el cual el cliente esta realizando la compra" + "\n" +
                            "1. Temprano" + "\n" +
                            "2. Tarde"));
                    if (time == 1) {
                        JOptionPane.showMessageDialog(null, "El horario seleccionado es: " + hora.getTemprano());
                        break;
                    } else if (time == 2) {
                        JOptionPane.showMessageDialog(null, "El horario seleccionado es: " + hora.getTarde());
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrecto, intente nuevamente");
                    }
                }
                while(true){
                    produc = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Producto #1: "+prod.getProd01()+
                    "\nProducto #2: "+prod.getProd02()+
                    "\nProducto #3: "+prod.getProd03()+
                    "\nProducto #4: "+prod.getProd04()+
                    "\nProducto #5: "+prod.getProd05()+
                    "\nProducto #6: "+prod.getProd06()+
                    "\nIngrese el producto que desea el cliente"));
                    if (produc == 1){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 2){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 3){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 4){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 5){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else if (produc == 6){
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "Error, intente nuevamente");
                    }
                }
            }else if(sede == 4){
                JOptionPane.showMessageDialog(null,"Gracias por preferirnos");
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Error, intentelo de nuevo");
            }
                }

    }
}