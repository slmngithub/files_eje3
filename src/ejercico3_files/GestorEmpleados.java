package ejercico3_files;

import java.io.*;
import java.util.ArrayList;

public class GestorEmpleados {
    private String filename;
    public GestorEmpleados(String filename){
        this.filename=filename;
    }
    public void guardaEmpleados(ArrayList<Empleado> emps){
        ObjectOutputStream rgst=null;
        try {
            rgst= new ObjectOutputStream( new FileOutputStream("C:\\Users\\ik012982i9\\IdeaProjects\\excepcions\\src\\ejercico3_files\\"+ filename));

            for (int i=0 ; i<emps.size();i++){
                rgst.writeObject(emps.get(i));

            }
            rgst.writeObject(null);

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        finally {
            try {
                if (rgst != null) {
                    rgst.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    public void muestraEmpleados() {
        ObjectInputStream rgst = null;
        try {
            rgst = new ObjectInputStream(new FileInputStream("C:\\Users\\ik012982i9\\IdeaProjects\\excepcions\\src\\ejercico3_files\\"+ filename ));
            Empleado emp;
            while ((emp=(Empleado) rgst.readObject())!=null){
                System.out.println(emp);
                System.out.println("===============================================");
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        finally {
            try {
                if (rgst != null) {
                    rgst.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    public String búsquedaEmployee(String name){
        ObjectInputStream rgst = null;
        try {
            rgst = new ObjectInputStream(new FileInputStream("C:\\Users\\ik012982i9\\IdeaProjects\\excepcions\\src\\ejercico3_files\\"+ filename ));
            Empleado emp;
            while ((emp=(Empleado) rgst.readObject())!=null){
                if (emp.getNombre().equals(name)){
                    return emp.toString();
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        finally {
            try {
                if (rgst != null) {
                    rgst.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
        return null;
    }
    public void generaFicheroMoviles(String filename1){
        ObjectInputStream rgst = null;
        ObjectInputStream tlf = null;
        ObjectOutputStream telefonos=null;
        try {
            rgst= new ObjectInputStream( new FileInputStream("C:\\Users\\ik012982i9\\IdeaProjects\\excepcions\\src\\ejercico3_files\\"+ filename ));
            telefonos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\ik012982i9\\IdeaProjects\\excepcions\\src\\ejercico3_files\\"+ filename1));
            Empleado emp;
            while ((emp=(Empleado) rgst.readObject())!=null){
                telefonos.writeObject(emp.getTelefono() );
                emp.setSalarios(0);
            }
            telefonos.writeObject(null);


            /**para mostrar los movilies ==>>*/
             tlf = new ObjectInputStream(new  FileInputStream("C:\\Users\\ik012982i9\\IdeaProjects\\excepcions\\src\\ejercico3_files\\"+ filename1));
            TelefonoMovil tm;
            while ((tm= (TelefonoMovil) tlf.readObject())!=null){
                System.out.println(tm);
                System.out.println("===============================================");
            }


        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());

        } catch (IOException e) {
            System.err.println(e.getMessage());

        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());

        }
        finally {
            try {
                if (rgst != null) {
                    rgst.close();
                }
                if (telefonos != null) {
                    telefonos.close();
                }
                if (tlf != null) {
                    tlf.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    public void trabajarTodos(){
        ObjectInputStream rgst = null;
        ArrayList <Empleado>  copy=new ArrayList<>();
        try {
            rgst= new ObjectInputStream( new FileInputStream("C:\\Users\\ik012982i9\\IdeaProjects\\excepcions\\src\\ejercico3_files\\"+ filename ));
            Empleado emp;
            while ((emp=(Empleado) rgst.readObject())!=null){
                emp.trabajo();
                copy.add(emp);
            }
            guardaEmpleados(copy);

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
        finally {
            try {
                if (rgst != null) {
                    rgst.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }



    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

}
