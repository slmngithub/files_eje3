package ejercico3_files;

import java.util.ArrayList;
import java.util.List;

public class main2 {
    public static void main(String [] arg){
        ArrayList<Empleado> emps=new ArrayList<>();


        emps.add(new Empleado("aaaa" , 1111.11 , new TelefonoMovil(101010 , 9999.99)));
        emps.add(new Empleado("bbbb" , 2222.22 , new TelefonoMovil(202020 , 8888.88)));
        emps.add(new Empleado("cccc" , 3333.33 , new TelefonoMovil(303030, 7777.77)));
        emps.add(new Empleado("dddd" , 4444.44 , new TelefonoMovil(404040 , 6666.6666)));
        emps.add(new Empleado("eeee" , 5555.555 , new TelefonoMovil(505050 , 1234.56)));
        GestorEmpleados2 ge2 = new GestorEmpleados2("employee.data");
        ge2.guardaEmpleados(emps);
        ge2.muestraEmpleados();
        System.out.println("********************************");
        System.out.println(ge2.búsquedaEmployee("aaaaa"));
        System.out.println(ge2.búsquedaEmployee("lala"));
        ge2.generaFicheroMoviles("telephono.data");
        System.out.println("********************************");
        ge2.trabajarTodos();
        ge2.muestraEmpleados();


    }
}

