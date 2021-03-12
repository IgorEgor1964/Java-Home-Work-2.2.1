public class Main {
    public static void main(String[] args) {
        int amount = 3000; //Стоимость билета
        int count = 20; // за каждые 20 рублей, потраченные на билет, начисляется 1 миля
        int bonus = amount / count; // бонус в милях
        System.out.print(bonus);
        System.out.print("миль");
    }
}
