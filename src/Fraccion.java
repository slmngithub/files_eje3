

public class Fraccion {
    int a;
    int b;
    public Fraccion(int a, int b) throws FractionException {
        this.a=a;
        if (b==0){
            throw new FractionException("El denominador cero es 0");
        }
        else {
            this.b=b;
        }

    }
    public String toString(){
        return a + "/" + b;
    }
    public Fraccion sumar(int A, int B) throws FractionException {
        int nuevoB=this.b*B;
        int nuevoA = (this.a*B)+(this.b*A);

        return simplify(nuevoA,nuevoB);
    }
    public Fraccion restar(int A, int B) throws FractionException {
        int nuevoB=this.b*B;
        int nuevoA = (this.a*B)-(this.b*A);
        return simplify(nuevoA,nuevoB);
    }

    public Fraccion multiplicar(int A, int B) throws FractionException {
        int nuevoB=this.b*B;
        int nuevoA = this.a*A;
        return simplify(nuevoA,nuevoB);
    }
    public Fraccion dividir(int A, int B) throws FractionException {
        if (A==0 || B==0){
            throw new FractionException("El denominador del división cero es 0");
        }
        int nuevoB=this.b/B;
        int nuevoA = this.a/A;
        return simplify(nuevoA,nuevoB);
    }
    private Fraccion simplify(int A, int B) throws FractionException {
        int min = Math.min(Math.abs(A), Math.abs(B));
        for (int i = min; i > 1; i--) {
            if (A % i == 0 && B % i == 0) {
                A /= i;
                B /= i;
                break;
            }
        }
        return new Fraccion(A,B);

    }



}
