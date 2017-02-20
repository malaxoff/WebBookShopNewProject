package dao;

import domain.BooksEntity;
import java.util.List;


//     Интерфейс доступа к данным таблицы "Книги"


public interface BookDAO {

    public void addBook(BooksEntity book);

    public List<BooksEntity> listBooksByWord();

    public BooksEntity BookByID(Integer id);

    public String BookNameByID(Integer id);

    public boolean isBookByID(Integer id);

    public void removeBookByID(Integer id);     // для удаления неправильно заведенных книг, которых не было в продаже


}
