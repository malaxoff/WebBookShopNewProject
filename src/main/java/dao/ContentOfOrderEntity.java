package dao;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 20.02.17
 * Time: 15:55
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "CONTENT_OF_ORDER", schema = "SYSTEM", catalog = "")
@Entity
public class ContentOfOrderEntity {
    private int id;

    @javax.persistence.Column(name = "ID", nullable = false, insertable = true, updatable = true, length = 20, precision = 0)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int orderId;

    @javax.persistence.Column(name = "ORDER_ID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    private int bookId;

    @javax.persistence.Column(name = "BOOK_ID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    private int amountOfEachBook;

    @javax.persistence.Column(name = "AMOUNT_OF_EACH_BOOK", nullable = false, insertable = true, updatable = true, length = 3, precision = 0)
    @Basic
    public int getAmountOfEachBook() {
        return amountOfEachBook;
    }

    public void setAmountOfEachBook(int amountOfEachBook) {
        this.amountOfEachBook = amountOfEachBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ContentOfOrderEntity that = (ContentOfOrderEntity) o;

        if (amountOfEachBook != that.amountOfEachBook) return false;
        if (bookId != that.bookId) return false;
        if (id != that.id) return false;
        if (orderId != that.orderId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + orderId;
        result = 31 * result + bookId;
        result = 31 * result + amountOfEachBook;
        return result;
    }
}
