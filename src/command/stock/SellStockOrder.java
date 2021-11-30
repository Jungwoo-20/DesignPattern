package command.stock;

public class SellStockOrder implements Order {
    private StockTrade stockTrade;
    public SellStockOrder(StockTrade stockTrade) {
        this.stockTrade = stockTrade;
    }

    @Override
    public void execute(int money) {
        stockTrade.sell(money);
    }

}
