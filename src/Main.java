public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int balance = 100;
        int replenishment = 1100;
        int bonusLimit = 100;
        int bonusFr = 1000;
        int newBonus = replenishment / bonusLimit;

        if (replenishment >= bonusFr) {
            balance = balance + replenishment + newBonus;
        } else {
            balance = balance + replenishment;
        }

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        System.out.println("Баланс: " + balance + " руб.");
        System.out.println("Начислено бонусов " + newBonus + " руб.");


    }
}
