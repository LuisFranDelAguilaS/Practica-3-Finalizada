import java.util.Scanner;
public class Mexicano {


    static Scanner sc = new Scanner(System.in);


    public static void main(String[] arg) {



       //String nombre, String ape1, String ape2, String nacD,String nacM,String nacA, String sexo, String entidad.
        int opcion=0;

        do {
            System.out.println("-Opciones que puedes realizar-");
            System.out.println("1-CURP");
            System.out.println("2- RFC. ");
            System.out.println("3-RFC y CURP");
            System.out.println("4-Salir");
            System.out.println("Cual opcion desea? : ");
            opcion = sc.nextInt();


            System.out.println("Todo los datos en MAYUSCUSCULAS");
            switch (opcion) {


                case 1:
                    System.out.println("CURP");
                    MexicanoCR persona=new MexicanoCR(CapturaEntrada.capturarCadena("Dame el nombre"),CapturaEntrada.capturarCadena("Dame el apellido Paterno"),CapturaEntrada.capturarCadena("Dame Apellido Materno"),CapturaEntrada.capturarCadena("Dame el dia en que naciste"),CapturaEntrada.capturarCadena("Dame en el mes que naciste (en numeros y incluyendo el 0)"), CapturaEntrada.capturarCadena("Dame el año de nacimiento"), CapturaEntrada.capturarCaracter("Dame tu sexo(M o F)"), CapturaEntrada.capturarCadena("Dame el estado (Todo junto y con Mayusculas donde corresponda, lo demas en minusculas )"));
                    persona.Curp(persona.getNombre(),persona.getApe1(), persona.getApe2(), persona.getNacD(), persona.getNacM(), persona.getNacA(),persona.getSexo(), persona.getEntidad());
                    break;

                case 2:
                    System.out.println("RFC");
                    MexicanoCR per=new MexicanoCR(CapturaEntrada.capturarCadena("Dame el nombre"),CapturaEntrada.capturarCadena("Dame el apellido Paterno"),CapturaEntrada.capturarCadena("Dame Apellido Materno"),CapturaEntrada.capturarCadena("Dame el dia en que naciste"),CapturaEntrada.capturarCadena("Dame en el mes que naciste (en numeros y incluyendo el 0)"), CapturaEntrada.capturarCadena("Dame el año de nacimiento"), CapturaEntrada.capturarCaracter("Dame tu sexo(M o F)"), CapturaEntrada.capturarCadena("Dame el estado (Todo junto y con Mayusculas donde corresponda, lo demas en minusculas)"));
                    per.RFC(per.getNombre(),per.getApe1(), per.getApe2(), per.getNacD(),per.getNacM(), per.getNacA());
                    break;

                case 3:
                    System.out.println("CURP Y RFC");
                    MexicanoCR persona2=new MexicanoCR(CapturaEntrada.capturarCadena("Dame el nombre"),CapturaEntrada.capturarCadena("Dame el apellido Paterno"),CapturaEntrada.capturarCadena("Dame Apellido Materno"),CapturaEntrada.capturarCadena("Dame el dia en que naciste"),CapturaEntrada.capturarCadena("Dame en el mes que naciste (en numeros y incluyendo el 0)"), CapturaEntrada.capturarCadena("Dame el año de nacimiento"), CapturaEntrada.capturarCaracter("Dame tu sexo(M o F)"), CapturaEntrada.capturarCadena("Dame el estado (Todo junto y con Mayusculas donde corresponda, lo demas en minusculas)"));
                    persona2.Curp(persona2.getNombre(),persona2.getApe1(), persona2.getApe2(), persona2.getNacD(), persona2.getNacM(), persona2.getNacA(),persona2.getSexo(), persona2.getEntidad());
                    persona2.RFC(persona2.getNombre(),persona2.getApe1(), persona2.getApe2(), persona2.getNacD(),persona2.getNacM(), persona2.getNacA());
                    break;

            }

        }while (opcion != 4);



    }


}
