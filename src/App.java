public class App {
    
    public static float n1, n2, n3, mf;
    public static String status;
    public static void main(String[] args) throws Exception {
        n1 = 5.6f;
        n2 = 7.5f;
        n3 = 4.9f;
        
        mf = (n1+n2+n3)/3;

        if(mf >= 7.0){
            status = "APROVADO";
        }
        else if(mf < 5.0){
            status = "REPROVADO";
        }
        else{
           status = "RECUPERAÇÃO" ;
        }


    }
}
