package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    public static Double squareRoot(Double value) {
        Double answer = Math.sqrt(value);
        return answer;
    }

    public static Double square(Double value) {
        Double answer = value * value;
        return answer;
    }

    public static Double[] squareRoots(Double... value) {
        for(int y = 0; y < value.length; y++){
            value[y] = Math.sqrt(value[y]);
        }
        return value;
    }

    public static Double[] squares(Double... values) {
        for (int x = 0; x < values.length; x++) {
            values[x] = values[x] * values[x];
        }
        return values;
    }

    public static Double add(Double value1, Double value2) {
       Double value = value1 + value2;
        return value;
    }

    public static Double subtract(Double value1, Double value2) {
        Double value = value1 - value2;
        return value;
    }


    public static Double divide(Double divisor, Double dividend) {
        double value = divisor / dividend;
        return value;
    }
}
