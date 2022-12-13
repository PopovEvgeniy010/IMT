public
class Main {
    public static
    void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 100;
        double growth = 1.83 * 1.83;
        double IMT = service.calculate(weight, growth);
        System.out.println((IMT) + " Индекс массы тела");
    }
}