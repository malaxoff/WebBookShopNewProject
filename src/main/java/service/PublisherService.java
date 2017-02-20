package service;

import domain.PublisherEntity;

import java.util.List;

//Сервисный интерфейс

public interface PublisherService {

    public void addPublisher(PublisherEntity publisher);

    public List<PublisherEntity> listPublisherByWord();     /*

    public PublisherEntity PublisherByID();

    public PublisherEntity PublisherByName();         */

    public void removePublisher(Integer id);

//    public boolean isPublisherByID(Integer id);

}
