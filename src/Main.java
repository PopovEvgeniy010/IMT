public
class Main {
    public static
    void main(String[] args) {
      BmiService service  = new BmiService();
        int weight = 80;
        double growth = service.calculate(weight);
        System.out.println((growth) + " Индекс массы тела");
    }
}