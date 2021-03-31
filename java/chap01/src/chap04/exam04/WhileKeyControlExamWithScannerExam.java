package chap04.exam04;

import java.io.IOException;
import java.util.Scanner;

public class WhileKeyControlExamWithScannerExam {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        int speed = 0;
        int keyCode = 0;

        while(run){
            if(keyCode != 13 && keyCode != 10){
                System.out.println("====================");
                System.out.println("1.증속 | 2.감속 | 3.중지");
                System.out.println("====================");
                run = false;
            }

            System.in.read();
            System.out.println("\nkeyCode : ");

            if(keyCode == 49){ // 키보드의 1
                speed++;
                System.out.println("속도 : "+speed);
            }else if(keyCode == 50){ // 키보드의 2
                speed--;
                System.out.println("속도 : "+speed);
            }else if(keyCode == 51){ // 키보드 3
                run = false;
            }

        }
    }
}
