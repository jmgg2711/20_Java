public class DemoCaracteres {
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            System.out.print(i + 'A' + " ");
        }
        System.out.println();

        for(int j = 0; j < 10; j++){
            System.out.print(j + "A" + " ");
        }
        System.out.println();
        
        for(int h = 'A'; h < 'Z'; h++){
            System.out.print(h + " ");
        }
        System.out.println();

        char c;
        for(int h = 'A'; h < 'Z'; h++){
            c = (char)h;
            System.out.print(c + " ");
        }
    }
}
