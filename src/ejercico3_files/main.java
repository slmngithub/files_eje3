package ejercico3_files;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String [] arg){
        ArrayList<Empleado> emps=new ArrayList<>();


        emps.add(new Empleado("oussama" , 1033.25 , new TelefonoMovil(985231 , 1025.3)));
        emps.add(new Empleado("nabil" , 1133.25 , new TelefonoMovil(985232 , 1125.3)));
        emps.add(new Empleado("messi" , 1233.25 , new TelefonoMovil(985233 , 1225.3)));
        emps.add(new Empleado("mohamed" , 1333.25 , new TelefonoMovil(985234 , 1325.3)));
        emps.add(new Empleado("cr7" , 1433.25 , new TelefonoMovil(985235 , 1425.3)));
        GestorEmpleados ge1 = new GestorEmpleados("employee.data");
        ge1.guardaEmpleados(emps);
        ge1.muestraEmpleados();
        System.out.println("********************************");
        System.out.println(ge1.búsquedaEmployee("oussama"));
        System.out.println(ge1.búsquedaEmployee("lala"));
        ge1.generaFicheroMoviles("telephono.data");
        System.out.println("********************************");
        ge1.trabajarTodos();
        ge1.muestraEmpleados();


    }
}
