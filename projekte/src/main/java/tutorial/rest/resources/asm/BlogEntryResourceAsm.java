package tutorial.rest.resources.asm;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import tutorial.core.entities.BlogEntry;
import tutorial.rest.mvc.BlogEntryController;
import tutorial.rest.resources.BlogEntryResource;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

/**
 * Created by piriyatharsika.senth on 30.08.16.
 */
public class BlogEntryResourceAsm extends ResourceAssemblerSupport<BlogEntry, BlogEntryResource> {

    public BlogEntryResourceAsm(){

        super(BlogEntryController.class, BlogEntryResource.class);
    }

    public BlogEntryResource toResource(BlogEntry entry){

        BlogEntryResource rec = new BlogEntryResource();
        rec.setTitle(entry.getTitle());
        Link link = linkTo(methodOn(BlogEntryController.class).getBlogEntry(entry.getId())).withSelfRel();
        rec.add(link.withSelfRel());
        return rec;
    }
}
