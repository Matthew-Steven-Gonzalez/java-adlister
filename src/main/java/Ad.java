import java.io.Serializable;

public class Ad implements Serializable {

    private String name;

    private String description;

    private int userId;

    private int catId;

    public Ad(String name, String description, int userId, int catId) {
        this.name = name;
        this.description = description;
        this.userId = userId;
        this.catId = catId;
    }

    public Ad(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }
}
