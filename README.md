# Developer Programming Exercise

## User Story

As a trader I want to be able to monitor stock prices such that when they breach a trigger level orders can be executed automatically.

## Exercise

Given the following interface definitions (provided)

```
public interface ExecutionService {
    void buy(String security, double price, int volume);
    void sell(String security, double price, int volume);
}
```

```
public interface PriceListener {
    void priceUpdate(String security, double price);
}
```

```
public interface PriceSource {
    void addPriceListener(PriceListener listener);
    void removePriceListener(PriceListener listener);
}
```

Develop a basic implementation of the PriceListener interface that provides the following behaviour: --done

1. Connects to a PriceSource instance --done
1. Monitors price movements on a specified single stock (e.g. "IBM") --taken as input 
1. Executes a single "buy" instruction for a specified number of lots (e.g. 100) as soon as the price of that stock is seen to be below
a specified price (e.g. 55.0). Don’t worry what units that is in. 

Given Input:
input price is given as (45.17)(23.89)(14.45)(67.34)(10.67)

output taken:
Stock IBM of 100 units for amount 4517.0 has been bought successfully
Stock IBM of 100 units for amount 2389.0 has been bought successfully
Stock IBM of 100 units for amount 1445.0 has been bought successfully
Stock IBM of 100 units for amount 1067.0 has been bought successfully

### Considerations

* Please "work out loud" and ask questions
* This is not a test of your API knowledge so feel free to check the web as reference
* There is no specific solution we are looking for

### Some libraries already available:

* Java 8
* JUnit 4
* Mockito
* EasyMock
* JMock


