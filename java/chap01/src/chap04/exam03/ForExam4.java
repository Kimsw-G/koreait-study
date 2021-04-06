package chap04.exam03;

public class ForExam4 {
    public static void main(String[] args) {
        String[] strArr = {"A","B","C","D","E"};

        Method.reverse(strArr);
        
        for (String string : strArr) {
            System.out.println(string);
        }
    }

}

class Method{
    static void reverse(String[] str){
        int len = str.length-1;
        for(int i=0;i<str.length/2;i++){
            String tmp = str[i];
            str[i] = str[len-i];
            str[len-i] = tmp;
        }
    }

   
}
