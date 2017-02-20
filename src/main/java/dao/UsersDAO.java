package dao;

//     Интерфейс доступа к данным таблицы "Пользователи"

public interface UsersDAO {

    public boolean isUserByLoginPassword(String login, String password);

}
