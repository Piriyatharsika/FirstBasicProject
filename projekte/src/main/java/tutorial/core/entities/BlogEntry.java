package tutorial.core.entities;

/**
 * Created by piriyatharsika.senth on 24.08.16.
 */
public class BlogEntry {

    private Long id;

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
