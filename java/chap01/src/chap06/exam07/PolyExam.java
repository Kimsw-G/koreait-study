package chap06.exam07;

public class PolyExam {
// 부모 -> 자식객체 가능
// 자식 -> 부모객체 불가능
    public static void main(String[] args) {
        Animal ani1 = new Cat();
        // Cat cat1 = new Animal(); // 이건 불가능!
        Cat cat = (Cat)ani1;

        
    }
}
