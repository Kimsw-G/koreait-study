package chap06.exam08.starcraft;

public class StarMain {
    public static void main(String[] args) {
        Medic medic1 = new Medic();
        Marine marine1 = new Marine();
        Medic medic2 = new Medic();
        Tank tank1 = new Tank();

        medic1.printHP();
        medic2.printHP();
        marine1.printHP();
        tank1.printHP();

        medic1.heal(medic2);
        medic1.heal(medic1);
        medic1.heal(marine1);
        medic1.heal(tank1);

        medic1.printHP();
        medic2.printHP();
        marine1.printHP();
        tank1.printHP();
    }
}
