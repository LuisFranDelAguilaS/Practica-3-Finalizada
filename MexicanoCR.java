import java.util.Random;
public class MexicanoCR {

    String nombre;
    String ape1; //Primer Apellido
    String ape2; //Segundo Apellido
    String nacD; // Dia de nacimiento
    String nacM;// Mes de nacimiento
    String nacA; //Año de nacimiento
    char sexo;//Mujer/Hombre
    String entidad;



    public  MexicanoCR (String nombre, String ape1, String ape2, String nacD,String nacM,String nacA, char sexo, String entidad){


        setNombre(nombre);
        setApe1(ape1);
        setApe2(ape2);
        setNacD(nacD);
        setNacM(nacM);
        setNacA(nacA);
        setSexo(sexo);
        setEntidad(entidad);

    }

    // Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApe1(String ape1){
        this.ape1=ape1;
    }

    public void setApe2(String ape2){
        this.ape2 = ape2;
    }

    public void setNacD(String nacD){
        this.nacD = nacD;
    }

    public void setNacM(String nacM){
        this.nacM=nacM;

    }

    public void setNacA(String nacA){
        this.nacA=nacA;

    }
    public void setSexo(char sexo){
        this.sexo=sexo;

    }
    public void setEntidad(String entidad){
        this.entidad=entidad;

    //Getters
    }
    public String getNombre(){
        return nombre;
    }

    public String getApe1(){
        return ape1;
    }

    public String getApe2(){
        return ape2;
    }

    public String getNacD(){
        return nacD;
    }

    public String getNacM(){
        return nacM;

    }
    public String getNacA(){
        return nacA;

    }
    public char getSexo(){
        return sexo;

    }
    public String getEntidad(){
        return entidad;

    }

    //Metodo curp
    public void Curp (String nombre, String ape1, String ape2, String nacD,String nacM,String nacA, char sexo, String entidad) {



        char vocalP = 0;
        //String ape1M = ape1.substring(0,1)
        char ape1P= ape1.charAt(0);
        char ape2M = ape2.charAt(0);
        char nom = nombre.charAt(0);
        String nA = nacA.substring(2,4);
        char cosAp1 = 0;
        char cosAp2= 0;
        char cosNomb= 0;
        String abreE = "A";

        if (entidad.equals("Aguascalientes")){

                abreE = "AS";

            }

            else if (entidad.equals("BajaCalifornia")){

                abreE = "BC";

            }

            else if (entidad.equals("BajaCaliforniaSur")){

                abreE  = "BS";

            }

            else if (entidad.equals("Campeche")){

                abreE  = "CC";

            }

            else if (entidad.equals("Coahuila")){

                abreE  = "CL";

            }

            else if (entidad.equals("Colima")){

                abreE  = "CM";

            }

            else if (entidad.equals("Chiapas")){

                abreE  = "CS";

            }

            else if (entidad.equals("Chihuahua")){

                abreE  = "CH";

            }

            else if (entidad.equals("DistritoFederal")){

                abreE  = "DF";

            }

            else if (entidad.equals("Durango")){

                abreE  = "DG";

            }

            else if (entidad.equals("Guanajuato")){

                abreE = "GT";

            }

            else if (entidad.equals("Guerrero")){

                abreE  = "GR";

            }

            else if (entidad.equals("Hidalgo")){

                abreE  = "HG";

            }

            else if (entidad.equals("Jalisco")){

                abreE  = "JC";

            }

            else if (entidad.equals("Mexico")){

                abreE  = "MC";

            }

            else if (entidad.equals("Michoacan")){

                abreE  = "MN";

            }

            else if (entidad.equals("Morelos")){

                abreE  = "MS";

            }

            else if (entidad.equals("Nayarit")){

                abreE  = "NT";

            }

            else if (entidad.equals("NuevoLeon")){

                abreE  = "NL";

            }

            else if (entidad.equals("Oaxaca")){

                abreE = "OC";

            }

            else if (entidad.equals("Puebla")){

                abreE = "PL";

            }

            else if (entidad.equals("Queretaro")){

                abreE = "QT";

            }

            else if (entidad.equals("QuintanaRoo")){

                abreE= "QR";

            }

            else if (entidad.equals("SanLuisPotosi")){

                abreE = "SP";

            }

            else if (entidad.equals("Sinaloa")){

                abreE= "SL";

            }

            else if (entidad.equals("Sonora")){

                abreE= "SR";

            }

            else if (entidad.equals("Tabasco")){

                abreE = "TC";

            }

            else if (entidad.equals("Tamaulipas")){

                abreE = "TS";

            }

            else if (entidad.equals("Tlaxcala")){

                abreE = "TL";

            }

            else if (entidad.equals("Veracruz")){

                abreE = "VZ";

            }

            else if (entidad.equals("Yucatan")){

                abreE = "YN";

            }

            else if (entidad.equals("Zacatecas")){

                abreE = "ZS";

            }

            else if(entidad.equals("NacidoEnElExtranjero")){

                abreE = "NE";

            }


        for(int i=1; i<ape1.length();i++) {
            char pVocal = ape1.charAt(i);
            if (pVocal == 'A' || pVocal == 'E' || pVocal == 'I' || pVocal == 'O' || pVocal == 'U') {
                vocalP = pVocal;
                break;
            }
        }
            for (int i = 1; i < ape1.length(); i++) {
                char pCons = ape1.charAt(i);
                if (pCons != 'A' && pCons != 'E' && pCons != 'I' && pCons != 'O' && pCons != 'U') {
                    cosAp1 = pCons;
                    break;
                }
            }
            for (int j = 1; j < ape2.length(); j++) {
                char pCons = ape2.charAt(j);
                if (pCons != 'A' && pCons != 'E' && pCons != 'I' && pCons != 'O' && pCons != 'U') {
                    cosAp2 = pCons;
                    break;
                }
            }
            for (int j = 1; j < nombre.length(); j++) {
                char pCons = nombre.charAt(j);
                if (pCons != 'A' && pCons != 'E' && pCons != 'I' && pCons != 'O' && pCons != 'U') {
                    cosNomb = pCons;
                    break;
                }
            }
        Random random = new Random();

        char rC = (char) (random.nextInt(26) + 'a');
        char rC2 = (char) (random.nextInt(26) + 'a');
        char rC3 = (char) (random.nextInt(26) + 'a');

                    System.out.println("El curp es: " + ape1P + vocalP + ape2M + nom + nA + nacM + nacD + sexo + abreE + cosAp1 + cosAp2 + cosNomb+rC+rC2+rC3);

                }




    public void RFC(String nombre, String ape1, String ape2, String nacD,String nacM,String nacA) {

        char vocalP = 0;
        //String ape1M = ape1.substring(0,1)
        char ape1P = ape1.charAt(0);
        char ape2M = ape2.charAt(0);
        String nA = nacA.substring(2,4);
        char nom = nombre.charAt(0);

        for (int i = 1; i < ape1.length(); i++) {
            char pVocal = ape1.charAt(i);
            if (pVocal == 'A' || pVocal == 'E' || pVocal == 'I' || pVocal == 'O' || pVocal == 'U') {
                vocalP = pVocal;
                break;
            }
        }

        Random random = new Random();

        char rC = (char) (random.nextInt(26) + 'a');
        char rC2 = (char) (random.nextInt(26) + 'a');
        char rC3 = (char) (random.nextInt(26) + 'a');

        System.out.println("El RFC es: " + ape1P + vocalP + ape2M + nom + nA + nacM + nacD+ rC+rC2+rC3);


    }

}



