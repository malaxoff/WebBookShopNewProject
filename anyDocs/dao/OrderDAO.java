package dao;

import domain.OrdersEntity;

import java.util.List;

//     Интерфейс доступа к данным таблицы "Заказ"

public interface OrderDAO {

    public void addOrder(OrdersEntity order);

    public List<OrdersEntity> listOrdersByUserID(Integer id);

    public OrdersEntity OrderByID();

    public void removeOrder(Integer id);

    public boolean isOrderByID(Integer id);


}
