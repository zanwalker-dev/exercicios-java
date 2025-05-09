package classe;

public class AreaCirc {

    double raio;
    static final double PI = 3.14;

    AreaCirc(double raio) {
        this.raio = raio;
    }

    double getAreaCirc(){
        return Math.pow(raio,2) * PI;
    }
}
