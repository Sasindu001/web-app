package pizzaloop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    private int quantity;
    private String pname;
    private Double fprice;
    private String imageUrl;

    public void setPname(String pname) { this.pname = pname; }

    public int getPid() { return pid; }
    public void setPid(int pid){
        this.pid=pid;
    }
    public String getPname() {return pname;}
    public Double getFprice() {return fprice;}
    public void setFprice(Double fprice) {this.fprice=fprice;}
    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity=quantity;}
    public String getImageUrl() { return imageUrl; }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}
