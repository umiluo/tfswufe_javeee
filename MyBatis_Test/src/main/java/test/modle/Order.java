package main.java.test.modle;

public class Order {
    private Integer order_id;
    private Integer user_id;
    private String order_site;

    public Order(){
        super();
    }
    public Order(Integer order_id, Integer user_id, String order_site) {
        super();
        this.order_id = order_id;
        this.user_id = user_id;
        this.order_site = order_site;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getOrder_site() {
        return order_site;
    }

    public void setOrder_site(String order_site) {
        this.order_site = order_site;
    }
    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", user_id=" + user_id +
                ", order_site='" + order_site + '\'' +
                '}';
    }
}
