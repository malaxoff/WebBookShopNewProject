package dao;

import domain.PublisherEntity;
import java.util.List;

//     Интерфейс доступа к данным таблицы "Издательство"

public interface PublisherDAO {

    public void addPublisher(PublisherEntity publisher);

    public List<PublisherEntity> listPublisherByWord();     /*

    public PublisherEntity PublisherByID();

    public PublisherEntity PublisherByName();         */

    public void removePublisher(Integer id);

//    public boolean isPublisherByID(Integer id);

}