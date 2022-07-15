package dio.pacotes.java;


//assinatura e um parâmetro
public class Quadrilatero {
    public static void main(double lado) {

        System.out.println("Àrea do quadrado: " +lado * lado );

    }

    //assinatura  2 parâmetros
    public  static void area(double lado1, double lado2){
        System.out.println("Área do retângulo: " +lado1 * lado2);

    }

    //assinatura e 3 parâmentros
     public  static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio: "+((baseMaior+baseMenor) * altura) / 2);

    }
    public  static void area(float diagonal1, float diagonal2 ){
        System.out.println("Área do losango: "+(diagonal1 * diagonal2) / 2);

    }
}

































