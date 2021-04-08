package chap06.exam07;

public class OverrideExam {
    public static void main(String[] args) {
        
    }
}

class NumBox{
    private int num;

    public int getNum() {
        return this.num;
    }

    NumBox(int num){
        this.num = num;
    }

    @Override
    public boolean equals(Object obj){
        NumBox box = (NumBox)obj;
        return box.getNum() == this.num;
    }

    
}
