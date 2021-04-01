package chap05.exam01.vending;

public class VendingMachineMission {
    public static void main(String[] args) {
        // 콜라 1000
        // 사이다 12000
        // 환타 1300

        int money = 4000; // 소지금액

        VendingMachine vm = new VendingMachine(money);

        // vm.printMenu();
        vm.run();
        
    }

}
