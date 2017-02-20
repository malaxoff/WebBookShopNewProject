package domain;

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
@javax.persistence.Table(name = "PUBLISHER", schema = "SYSTEM", catalog = "")
@Entity
public class PublisherEntity {
    private int idPublisher;

    @javax.persistence.Column(name = "ID_PUBLISHER", nullable = false, insertable = true, updatable = true, length = 10, precision = 0)
    @Id
    public int getIdPublisher() {
        return idPublisher;
    }

    public void setIdPublisher(int idPublisher) {
        this.idPublisher = idPublisher;
    }

    private String nameOfPublisher;

    @javax.persistence.Column(name = "NAME_OF_PUBLISHER", nullable = true, insertable = true, updatable = true, length = 200, precision = 0)
    @Basic
    public String getNameOfPublisher() {
        return nameOfPublisher;
    }

    public void setNameOfPublisher(String nameOfPublisher) {
        this.nameOfPublisher = nameOfPublisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PublisherEntity that = (PublisherEntity) o;

        if (idPublisher != that.idPublisher) return false;
        if (nameOfPublisher != null ? !nameOfPublisher.equals(that.nameOfPublisher) : that.nameOfPublisher != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPublisher;
        result = 31 * result + (nameOfPublisher != null ? nameOfPublisher.hashCode() : 0);
        return result;
    }
}
