public class DodawanieLib {

    public static String dodaj(String a, String b){
    	int ai = Integer.parseInt(a);
    	int bi = Integer.parseInt(b);
        if(ai <= 100001 && bi <= 1000) {
        	return String.valueOf(ai+bi);
        }
        return "you're a wizard harry";
    }

}
