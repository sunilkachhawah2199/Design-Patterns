package machine_coding.parking_lot.models;

import java.util.Date;

public abstract class BaseModel {
    private int id;
    private Date createdAt;
    private Date updatedAt;

    // getters and setters

    public void setId(int id){
        this.id=id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    // setters

    public int getId(){
        return id;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
