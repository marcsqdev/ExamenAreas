import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion,base,altura,area,radio,generatriz;
        double Area,volumen;
    Scanner sc=new Scanner(System.in);
    do{
        System.out.println("1. Area del triangulo");
        System.out.println("2. Area del circulo");
        System.out.println("3. Area del cono");
        System.out.println("4. Area del cilindro");
        System.out.println("5. Volumen de la esfera");

        System.out.println("Escoge una opcion");
        opcion=sc.nextInt();

        if (opcion>=1 && opcion<=4){


            switch(opcion){
                case 1:
                    System.out.println("Introduce la base del triangulo");
                    base=sc.nextInt();
                    System.out.println("Introduce la altura del triangulo");
                    altura=sc.nextInt();

                    area=(base*altura)/2;

                    System.out.println("El area del triangulo es: "+area);
                case 2:

                    System.out.println("Introduce el radio del circulo");
                    radio=sc.nextInt();

                    Area=3.14*(radio*radio);
                    System.out.println("El area del circulo es: "+Area);
                case 3:
                    System.out.println("Introduce el radio del cono");
                    radio=sc.nextInt();
                    System.out.println("Introduce la generatriz del cono");
                    generatriz=sc.nextInt();

                    Area=3.14*radio*generatriz;

                    System.out.println("El area del cono es: "+Area);
                case 4:
                    System.out.println("Introduce el radio del cilindro");
                    radio=sc.nextInt();
                    System.out.println("Introduce la altura del cilindro");
                    altura=sc.nextInt();

                    Area= 2*radio*(radio*altura);

                    System.out.println("El area del cilindro es: "+Area);
                case 5:
                    System.out.println("Introduce el radio de la esfera");
                    radio=sc.nextInt();

                    volumen=(4/3)*3.14*radio;

                    System.out.println("El volumen de la esfera es: "+volumen);
                case 6:
                    System.out.println("Fin del programa");








            }

        }else
            System.out.println("La opcion introducida no corresponde con ninguna de las opciones");
    }while (opcion<4);


    }
}