public class Main {

    public static void main(String[] args) {

        int balance = 100;
        int transfer = 10500;
        int bonusRub = transfer / 100*1;
        int limit = 1000;
        int current;
        if (transfer >= 1000) {
            current = balance + transfer + bonusRub;
        } else {
            current = balance + transfer;
        }

        System.out.println("Ваш баланс в рублях равен =" + current);
    }
}
