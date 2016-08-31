package tutorial.rest.resources;

import org.springframework.hateoas.ResourceSupport;

/**
 * Created by piriyatharsika.senth on 30.08.16.
 */
public class BlogEntryResource extends ResourceSupport {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
