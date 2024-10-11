public class Main {
    public static void main(String[] args) {

        int balance = 100;           // Объявляете переменные для входных данных и
        int replenishment = 1100;   // параметров программы: начального счёта,
        int bonusLimit = 100;      // суммы пополнения и тп
        int bonusFr = 1000;
        int newBonus = replenishment/bonusLimit;

        if (replenishment >= bonusFr) {
            balance = balance + replenishment + newBonus;
        } else {
            balance = balance + replenishment;
        }
        System.out.println("Баланс: " + balance + " руб.");                 // Условным оператором проверяете, превысила ли
        System.out.println("Начислено бонусов " + newBonus + " руб.");      // сумма пополнения порог, и для этих двух разных
                                                                            // сценариев рассчитываете сумму бонуса и выводите
                                                                            // на экран.

    }
}
