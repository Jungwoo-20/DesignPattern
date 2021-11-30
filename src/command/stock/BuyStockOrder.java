package command.stock;

public class BuyStockOrder implements Order {
    private StockTrade stockTrade;

    public BuyStockOrder(StockTrade stockTrade) {
        this.stockTrade = stockTrade;
    }

    @Override
    public void execute(int money) {
        stockTrade.buy(money);
    }

}
