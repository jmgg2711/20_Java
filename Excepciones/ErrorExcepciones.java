package Excepciones;
public class ErrorExcepciones {
    public static void main(String[] args){
        int num[] = {1,2,3};
        try{
            
            System.out.println(num[1]);
        } catch (Exception e){
            System.out.println("Algo anda mal!!!");
        }
        

    }
}
