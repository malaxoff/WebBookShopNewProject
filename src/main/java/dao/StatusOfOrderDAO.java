package dao;


import domain.StatusOfOrderEntity;


//     Интерфейс доступа к данным таблицы "Статус заказа"


public interface StatusOfOrderDAO {

    public void addPublisher(StatusOfOrderEntity status);    // не понадобится, если не изменится логика работы

    public String StatusNameByID();

    public boolean isStatusByID(Integer id);


}
