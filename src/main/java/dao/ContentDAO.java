package dao;

import domain.ContentOfOrderEntity;


import java.util.List;

//     Интерфейс доступа к данным таблицы "Список заказа"



public interface ContentDAO {

    public void addContent(ContentOfOrderEntity content);

    public List<ContentOfOrderEntity> listContentByOrderID(Integer id);

}
