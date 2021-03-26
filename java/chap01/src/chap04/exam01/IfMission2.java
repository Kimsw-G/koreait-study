package chap04.exam01;

import java.util.HashMap;
import java.util.Scanner;

public class IfMission2 {
    // Female avg h : 163
    // Male avg h : 175
    public static void main(String[] args) {
        HashMap<String,Integer> hash = new HashMap<String,Integer>();
        final int FEMALE_H = 163;
        final int MALE_H = 175;
        String gender = "남";
        int height = 176;
        
        hash.put("남", MALE_H);
        hash.put("여", FEMALE_H);
        /////////////////////
        // Scanner s = new Scanner(System.in,"UTF-8");
        // System.out.print("성별 입력 : ");
        // gender = s.nextLine();
        // System.out.print("키 입력 : ");
        // height = s.nextInt();
        // System.out.println(gender);

        // System.out.print("");

        // if(gender.equals("남")){ // gender가 남자일때
        //     compareHeight(height, gender);
        // }else if(gender.equals("여")){ // gender가 여자일때
        //     compareHeight(height, gender);
        // }else{
        //     System.out.println("올바른 성별을 입력해 주세요");
        // }
        /////////////////
        if(height < hash.get(gender)){
            System.out.println(gender + "자 평균 미만");
        }else if(height == hash.get(gender)){
            System.out.println(gender + "자 평균");
        }else{
            System.err.println(gender + "자 평균 초과");
        }
    }

    public static void compareHeight(int height,String gender){
        HashMap<String,Integer> hash = new HashMap<String,Integer>();

        if(height > hash.get(gender) ){
            System.out.println("평균 초과");
        }else if(height == hash.get(gender)){
            System.out.println("평균");
        }else{
            System.out.println("평균 미만");
        }
    }
}
