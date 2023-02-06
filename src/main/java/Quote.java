import java.io.Serializable;

public class Quote implements Serializable {
    private String authorFirstName;
    private String authorLastName;
    private String quoteContent;
    private int id;

    public Quote(String authorFirstName, String authorLastName, String quoteContent, int id) {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.quoteContent = quoteContent;
        this.id = id;
    }

    public Quote(){}

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public String getQuoteContent() {
        return quoteContent;
    }

    public void setQuoteContent(String quoteContent) {
        this.quoteContent = quoteContent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
