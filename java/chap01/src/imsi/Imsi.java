package imsi;

public class Imsi {
    public static void main(String[] args) {
        
        OUTER:
        for(int i=0; i<5; i++){
            System.out.println("i : " + i);
            for(int j=0; j<5;j++){
                System.out.println("j : " + j);
                if(j==3) break OUTER;
            }
            System.out.println("3");
        }

    }
}
