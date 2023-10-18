import java.util.Scanner;

public class principal{

    public static void main(String[] args) {
        //saudacao
        functions.write("Olá, por favor responda as perguntas a seguir");
        
        //entrada char inicial
        Scanner sc = new Scanner(System.in);
        functions.write("Por favor digite um valor tipo char: ");
        char charA = sc.next().charAt(0);
        
        //transforma char em int
        int number = Character.getNumericValue(charA);
        functions.writeG("Você digitou o inteiro:", number);

        //transforma int em double
        double doubleNumber = number;
        functions.writeG("Voce digitou o double: ", doubleNumber);

        //transforma double em float
        float floatNumber = (float) doubleNumber;
        functions.writeG("Você digitou o float: ", floatNumber);

        functions.write("\nCalculando a primeira função ( f(x) = 3x² + 2x + 1 ) \nDigite quantas vezes deseja repetir a função: ");
        int times = sc.nextInt();

        functions.write("Digite o valor de x: ");
        int valorX = sc.nextInt();

        functions.calcula(times, valorX);

        //segunda função
        functions.write("\nCalculando a segunda função ( f(x, a, b, c) = ax² + bx + c ) \nDigite quantas vezes deseja repetir a função: ");
        int times2 = sc.nextInt();

        functions.write("Digite o valor de x: ");
        int x2 = sc.nextInt();

        functions.write("Digite o valor de a: ");
        int a = sc.nextInt();

        functions.write("Digite o valor de b: ");
        int b = sc.nextInt();

        functions.write("Digite o valor de c: ");
        int c = sc.nextInt();

        functions.calcula2(times2, x2, a , b, c);







        sc.close();


    }


}