package main.java.com.acme.mytrader.price;
/* Creating PriceListener interface*/
public interface PriceListener {
    void priceUpdate(String security, double price);
}
