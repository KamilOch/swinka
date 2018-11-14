package it.morfoza;

import java.math.BigDecimal;
//import java.math.*;
import static java.math.BigDecimal.valueOf;


public class Money {

    private BigDecimal value;
   // BigDecimal value = new BigDecimal(value.multiply(valueOf(2)));

    public Money(double value) {
        this.value = new BigDecimal(2*value);
    }

    public Money(BigDecimal value) {
        this.value = value;
    }

    public double getDoubleValue() {
        return value.doubleValue();
    }

    public BigDecimal getBigDecimalValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public Money add(Money money) {
        return new Money(value.add(money.value));
    }
}
