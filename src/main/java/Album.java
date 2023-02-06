import java.io.Serializable;
import java.sql.Date;

public class Album implements Serializable {
    private String artistFirstName;
    private String artistLastName;
    private String albumName;
    private int releaseDate;
    private double salesInMillions;
    private String genres;

    private int id;

    public Album(String artistFirstName, String artistLastName, String albumName, int releaseDate, double salesInMillions, String genres,int id) {
        this.artistFirstName = artistFirstName;
        this.artistLastName = artistLastName;
        this.albumName = albumName;
        this.releaseDate = releaseDate;
        this.salesInMillions = salesInMillions;
        this.genres = genres;
        this.id = id;
    }

    public Album(){}

    public String getArtistFirstName() {
        return artistFirstName;
    }

    public void setArtistFirstName(String artistFirstName) {
        this.artistFirstName = artistFirstName;
    }

    public String getArtistLastName() {
        return artistLastName;
    }

    public void setArtistLastName(String artistLastName) {
        this.artistLastName = artistLastName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getSalesInMillions() {
        return salesInMillions;
    }

    public void setSalesInMillions(double salesInMillions) {
        this.salesInMillions = salesInMillions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }
}
