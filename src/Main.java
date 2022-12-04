public class Main {

    public static void main(String[] args) {

        //Переменная для счета:
        int balance = 100;

        //Переменная для пополнения:
        int replenishment = 1000;

        //Переменная для бонуса:
        int bonus;

        if (replenishment > 1000) {
            bonus = replenishment / 100;
            balance = balance + replenishment + bonus;
            System.out.println("Спасибо за пополнение на сумму " + replenishment + " рублей!");
            System.out.println("Поздравляем! Ваш бонус составил: " + bonus + " рублей");
            System.out.println("Ваш баланс составляет: " + balance + " рублей");

        } else {
            balance = balance + replenishment;
            System.out.println("Спасибо за пополнение на сумму " + replenishment + " рублей!");
            System.out.println("Ваш баланс составляет: " + balance + " рублей");
            System.out.println("Напоминаем Вам, что сейчас проходит акция!");
            System.out.println("При пополнении баланса на сумму более 1000 рублей Вы получите бонус:");
            System.out.println("1 рубль за каждые 100 рублей пополнения!");
        }

    }
}