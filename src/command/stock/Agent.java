package command.stock;

import javafx.util.Pair;
import java.util.LinkedList;
import java.util.Queue;

public class Agent {
    private Queue<Pair<Order, Integer>> m_ordersQueue = new LinkedList<>();

    public void placeOrder(Order order, int money) {
        order.execute(money);
        m_ordersQueue.add(new Pair<>(order, money));
    }

    public void sell() {
        System.out.println("Queue Size : " + m_ordersQueue.size());
        for (int i = 0; i <= m_ordersQueue.size(); i++) {
            Pair pair = m_ordersQueue.poll();
            if (pair.getKey() instanceof SellStockOrder) {
                System.out.println("매도 key : " + pair.getKey() + " / 매도 value : " + pair.getValue());
            } else {
                System.out.println("매수 key : " + pair.getKey() + " / 매수 value : " + pair.getValue());
            }
        }
    }
}