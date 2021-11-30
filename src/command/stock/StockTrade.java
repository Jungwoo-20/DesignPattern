package command.stock;

public class StockTrade {
    public void buy(int money) {
        System.out.printf("매수 주문이 체결되었습니다. 매수 금액은 %d원 입니다.\n", money);
    }

    public void sell(int money) {
        System.out.printf("매도 주문이 체결되었습니다. 매도 금액은 %d원 입니다.\n", money);
    }
}
