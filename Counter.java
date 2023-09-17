class Count{
    public static int cnt;

    int Contador(){
        return cnt++;
    }
}

public class Counter {
    public static void main(String[] args){
        Count cnt1 = new Count();
        Count cnt2 = new Count();
        Count cnt3 = new Count();
        Count cnt4 = new Count();
        System.out.println(cnt1.Contador());
        System.out.println(cnt2.Contador());
        System.out.println(cnt3.Contador());
        System.out.println(cnt4.Contador());
    }
    
}
