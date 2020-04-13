package Model;

public class ListItem {
    private String name;
    private String price;



    private String count;
    private String cancel;

    public ListItem(String name, String price, String count) {
        this.name = name;
        this.price = price;
        this.count=count;
        //this.cancel = cancel;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }







}
