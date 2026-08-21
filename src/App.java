import java.util.Scanner;

public class App {
    //esta es la entrada a mi programa 
    public static void main(String[] args) throws Exception { 
        System.out.println("buenas noches");
        int a = 10, b=3;
        System.out.println( a + b);
        System.out.println( a - b);
        System.out.println( a * b);
        System.out.println( a / b);
        System.out.println( a % b);

        // operadores logicos

        boolean mayorDeEdad = true;
        boolean tienenCarnet = false;

        System.out.println(mayorDeEdad && tienenCarnet ); // false - ambos deben ser true
        System.out.println(mayorDeEdad || tienenCarnet ); // true - al menos uno true
        System.out.println(!mayorDeEdad ); // false - niega el valor 

        Scanner sc = new Scanner(System.in);

        System.out.print("cual es tu base?");
        int base = sc.nextInt();

        System.out.print("cual es tu altura?");
        int altura = sc.nextInt();
        
        System.out.println("el area del triangulo es: " + base  * altura  );


        System.out.print ("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print ("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.print ("Nota 33: ");
        double nota3 = sc.nextDouble();



        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("tu promedio es : " + promedio );
        

        System.out.print("cual es tu nota " );
        int nota = sc.nextInt();



        if ( nota >= 90 ) {
        System.out.println("aprobado " );
        

        System.out.println("reprobado");

        System.out.println("bueno");

        System.out.println("excelente");

        









        

     





    }

    
        
               
        
    
}


