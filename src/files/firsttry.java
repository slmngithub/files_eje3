package files;

import java.io.*;

public class firsttry {
    public static void main (String[] args) throws IOException {
        String filepath="back.jpg";
        String copiapath="backcopia.jpg";
        File myfile = new File(filepath);
        File myfilecopia = new File(copiapath);
        try {
            FileInputStream filei= new FileInputStream(myfile);
            FileOutputStream jdid= new FileOutputStream(myfilecopia);
            int test=filei.read();
            while (test!= -1) {
                System.out.println(test);
                jdid.write(test);
                test = filei.read();
            }
            filei.close();
            jdid.close();
        } catch (FileNotFoundException f){
            System.out.println("no hay este archivo");
            System.err.println(f.getMessage());
            //f.printStackTrace();
        }

    }
}
