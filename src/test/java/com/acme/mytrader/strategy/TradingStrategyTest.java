package test.java.com.acme.mytrader.strategy;

import main.java.com.acme.mytrader.price.PriceSourceImpl;
import main.java.com.acme.mytrader.strategy.TradingStrategy;

import org.junit.Test;

/* Creating class for Testing the code. While purchase, price of that stock is given as inputs to PriceSource*/

public class TradingStrategyTest {

	@Test
	public void testNothing() {
		PriceSourceImpl priceSource = new PriceSourceImpl();
		TradingStrategy tradingStrategy = new TradingStrategy(priceSource);
		tradingStrategy.initiatePurchase();
		priceSource.setPrice(45.17);
		priceSource.setPrice(23.89);
		priceSource.setPrice(14.45);
		priceSource.setPrice(67.34);
		priceSource.setPrice(10.67);
	}
}
