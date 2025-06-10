import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Bienvenido al conversor de medidas");
        System.out.println("Selecciona el la opción que necesites");
        System.out.println("1.- Km a Milla");
        System.out.println("2.- L a Galones");
        System.out.println("3.- Gr a Onzas");
        System.out.println("4.- Cm a pulgadas");
        int op = scanner.nextInt();
        switch (op){
            case 1:
                System.out.println("Ingresarlos Km a convertir");
                int conv = scanner.nextInt();
                System.out.println("Los Km a milla son: " + ConvertirKmaMillas(conv));
                break;
            case 2:
                System.out.println("Ingresarlos L a convertir");
                int conv1 = scanner.nextInt();
                System.out.println("Los L a galon son: " + ConvertirLaGl(conv1));
                break;
            case 3:
                System.out.println("Ingresarlos centrimetros a convertir");
                int conv2 = scanner.nextInt();
                System.out.println("Los gr a onzas son: " + ConvertirGraOz(conv2));
                break;
            case 4:
                System.out.println("Ingresarlos centrimetros a convertir");
                int conv3 = scanner.nextInt();
                System.out.println("Los cm a pulgadas son: " + ConvertirCmaPl(conv3));
                break;

        }
    }
    public static double ConvertirKmaMillas(int km){
        double milla = km * 0.621371;
        return milla;
    }

    public static double ConvertirLaGl(int litros){
        double galones = litros * 0.2641732;
        return galones;
    }

    public static double ConvertirGraOz(int gramos){
        double onzas = gramos * 0.03527396;
        return onzas;
    }

    public static double ConvertirCmaPl(int cm){
        double pulgadas = cm * 0.393701;
        return pulgadas;
    }

}