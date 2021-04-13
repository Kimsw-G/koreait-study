package chap06.exam08.starcraft;

public class Medic extends Unit implements Bionic{
    
    public Medic(){
        currentHP = 20;
        maxHP = 40;
    }

    public int getCurrentHP() {
        return this.currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public void heal(Unit unit){
        if(unit instanceof Bionic && this != unit){
            System.out.println("체력을 회복했습니다.");
            unit.currentHP = unit.maxHP;
        }else{
            System.out.println("치료가 불가능합니다!");
        }
    }

    
}
