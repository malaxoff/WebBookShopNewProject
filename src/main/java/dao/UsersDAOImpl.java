package dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//     Реализация интерфейса доступа к данным таблицы "Пользователи"

@Repository
public class UsersDAOImpl implements UsersDAO {

    @Autowired
    private SessionFactory sessionFactory;


    public boolean isUserByLoginPassword(String login, String password){

              return  false;


    }
}
