package command.stock;

public class StockTestDrive {
    public static void main(String[] args) {
        StockTrade stock = new StockTrade();
        BuyStockOrder bsc = new BuyStockOrder(stock);
        SellStockOrder ssc = new SellStockOrder(stock);
        Agent agent = new Agent();
        agent.placeOrder(bsc,100);
        agent.placeOrder(ssc,50);
        agent.sell();
    }
}
