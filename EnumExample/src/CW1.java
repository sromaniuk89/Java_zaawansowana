public class CW1 {
    public static void main(String[] args) {
        Firm firm = new Firm();

        System.out.println(firm.calculateMonthCosts());
        System.out.println(firm.calculateYearCosts());

        System.out.println(firm.calculateFirmCost(Time.DAY));
    }
}
