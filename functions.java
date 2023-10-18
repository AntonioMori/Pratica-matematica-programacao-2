import java.util.Scanner;

public class functions {
 
    //escrever
    public static String write(String text ){
        System.out.println(text);
        return text;
    }

    public static void writeG(String msg,Object value) {
        System.out.println(msg + value);
    }

   //entrad

 //crie uma função que calcula e retorna o valor de y para uma função de 2º grau 
// f(x) = 3x² + 2x + 1. use a função em um for para calcular 10 coordenadas de pontos (com valores de x e y). imprima os valores dos pontos.
    
    public static Float function(float x){
        float y = 3*x*x + 2*x + 1;
        return y;
    }

    public static void calcula(int times, int valorX){

        for(int i=0;i< times ;i++){
            int repeticao = i+1;
            System.out.println(repeticao+" - x: " + valorX + " y: " + function(valorX));
            valorX += 1;
        };
        

    }


    //f(x, a, b, c) = ax² + bx + c.
    public static float function_2(int x, int a, int b, int c){
        int resultado = a*x*x +b*x + c;
        return resultado;
        
    }

    public static void calcula2(int times,int x, int a, int b, int c){
        write("Os valores escolhidos são: x:" + x + " a: "+a+" b: "+b+" c: " + c + "\n");
        
        for(int i =0; i<times;i++){
            int repeticao = i+1;
            System.out.println(repeticao+" - x: " + x + " y: " + function_2(x,a,b,c));
            x += 1;



        }



    }
}
