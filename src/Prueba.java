public class Prueba {
    public static void main (String[] args) throws FractionException {
        Fraccion f = new Fraccion(10 , 10);
        try {
            //System.out.println(f.multiplicar(20,0));
            //System.out.println(f.sumar(20,100));
            //System.out.println(f.restar(20,100));
            System.out.println(f.dividir(0,100));
        }catch (FractionException F){
            System.err.println(F.getMessage());
            //F.printStackTrace();

        }
    }
}
