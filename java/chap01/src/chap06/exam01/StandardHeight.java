package chap06.exam01;

import java.util.Scanner;

public class StandardHeight {
    final int MALE_STANDARD = 174;
    final int FEMALE_STANDARD = 161;
    Scanner sc = new Scanner(System.in);   

    public boolean run(){
       
        System.out.print("성별 (male,female): ");
        String gender = sc.next();

        System.out.print("키 : ");
        int height = sc.nextInt();

        String result = chkGender(gender,height);
        System.out.println(result);

        System.out.print("계속 하시겠습니까?(y,n)");
        return sc.next().equals("y")?true:false; // 입력값으로 true, false 반환
    }

    public String chkGender(String gender,int height){
        // String result = "성별: " + gender + ", 키: " + height + "cm,";
        String result = String.format("성별 : %s, 키: %dcm, \n",gender,height);
        
        if(gender.equals("male")){
            return result + chkHeight(height, MALE_STANDARD);
        }else if(gender.equals("female")){
            return result + chkHeight(height, FEMALE_STANDARD);
        }else{
            return "올바른 성별을 입력해주세요!";
        }
    }

    public String chkHeight(int height,int standard){
        if(height>standard){
            return "평균 이상";
        }else if(height==standard){
            return "평균";
        }else{
            return "평균 미만";
        }
    }
}
