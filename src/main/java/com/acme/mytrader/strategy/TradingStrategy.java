package main.java.com.acme.mytrader.strategy;

import main.java.com.acme.mytrader.execution.ExecutionService;
import main.java.com.acme.mytrader.execution.ExecutionServiceImpl;
import main.java.com.acme.mytrader.price.PriceListener;
import main.java.com.acme.mytrader.price.PriceListenerImpl;
import main.java.com.acme.mytrader.price.PriceSource;
import main.java.com.acme.mytrader.price.PriceSourceImpl;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 */
/*  Creating new objects in TradingStrategy constructor and initiating Purchase if priceSource is not equal to null.*/ 

public class TradingStrategy {

    private PriceListener priceListener;
    private PriceSource priceSource;
    private ExecutionService executionService;

    public TradingStrategy(PriceSource priceSource){
        executionService = new ExecutionServiceImpl();
        priceListener = new PriceListenerImpl(executionService);
        this.priceSource = priceSource;
    }

    public void initiatePurchase(){
        if(null != priceSource){
            priceSource.addPriceListener(priceListener);
        }
    }

}
