public class Argumentos {
    public static void main(String[] args){
        int valArgs = args.length;

        System.out.println("Total de argumentos: " + valArgs);

        for(int argIn = 0; argIn < args.length; argIn++){
            System.out.print(args[argIn] + " ");
        }
        
    }
}
