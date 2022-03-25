public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonus = service.calculate(10_000,20);
        System.out.println("ваш бонус составляет =" + bonus);
    }
}