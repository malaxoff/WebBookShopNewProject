package service;


import dao.UsersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//Реализация сервисного интерфейса

@Service
public class UserServiceImpl {


    @Autowired
    private UsersDAO usersDAO;

    @Transactional
    public boolean isUserByLoginPassword(String login, String password){



        return      usersDAO.isUserByLoginPassword(login, password);

    }
}
