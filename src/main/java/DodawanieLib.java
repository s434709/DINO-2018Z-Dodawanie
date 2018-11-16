public class DodawanieLib {

    public static String dodaj(String a, String b){

        if(a.equals("0") && b.equals("0")){
            return "0";
        }else{
            return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
        }


    }

}
