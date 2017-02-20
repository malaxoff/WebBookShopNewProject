package dao;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 20.02.17
 * Time: 15:55
 * To change this template use File | Settings | File Templates.
 */
@javax.persistence.Table(name = "ORDERS", schema = "SYSTEM", catalog = "")
@Entity
public class OrdersEntity {
    private int orderId;

    @javax.persistence.Column(name = "ORDER_ID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    private int userId;

    @javax.persistence.Column(name = "USER_ID", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private Timestamp orderDate;

    @javax.persistence.Column(name = "ORDER_DATE", nullable = false, insertable = true, updatable = true, length = 7, precision = 0)
    @Basic
    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }

    private int orderPrice;

    @javax.persistence.Column(name = "ORDER_PRICE", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Basic
    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    private BigInteger idStatus;

    @javax.persistence.Column(name = "ID_STATUS", nullable = false, insertable = true, updatable = true, length = 1, precision = 0)
    @Basic
    public BigInteger getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(BigInteger idStatus) {
        this.idStatus = idStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersEntity that = (OrdersEntity) o;

        if (orderId != that.orderId) return false;
        if (orderPrice != that.orderPrice) return false;
        if (userId != that.userId) return false;
        if (idStatus != null ? !idStatus.equals(that.idStatus) : that.idStatus != null) return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + userId;
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + orderPrice;
        result = 31 * result + (idStatus != null ? idStatus.hashCode() : 0);
        return result;
    }
}
