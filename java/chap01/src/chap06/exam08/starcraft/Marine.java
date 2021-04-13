package chap06.exam08.starcraft;

public class Marine extends Unit implements Bionic{
    
    public Marine(){
        currentHP = 20;
        maxHP = 40;
    }

    public int getCurrentHP() {
        return this.currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

}
