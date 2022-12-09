public
class BmiService {
    double calculate(int weihgt) {
        double growth = 1.83 * 1.83;
                double IMT = weihgt / growth;
        return (IMT);
    }
}


