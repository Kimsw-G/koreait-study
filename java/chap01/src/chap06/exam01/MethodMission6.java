package chap06.exam01;

public class MethodMission6 {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            getScoreSystem();
        }
    }

    public static void getScoreSystem(){
        int score = getRandomScore(50,100);

        char gradeChar = getGradeChar(score);
        char gradeSign = getGradeSign(score);

        System.out.printf("%d점 : %c%c\n",score,gradeChar,gradeSign);
    }

    public static int getRandomScore(int min,int max){ // min ~ max 사이의 숫자
        return (int)(Math.random()*(max-min+1))+min;
    }

    public static char getGradeChar(int score){
        switch(score/10){
            case 10: case 9: return 'A';
            case 8: return 'B';
            case 7: return 'C';
            case 6: return 'D';
            default: return 'E';
        }
    }

    public static char getGradeSign(int score){
        if(score == 100){
            return '+';
        }
        switch(score%10){
            case 9: case 8: return '+';
            case 3: case 2: case 1: case 0: return '-';
            default: return ' ';
        }
    }
    

}
