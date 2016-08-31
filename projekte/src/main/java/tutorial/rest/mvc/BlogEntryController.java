package tutorial.rest.mvc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tutorial.core.entities.BlogEntry;
import tutorial.core.services.BlogEntryService;
import tutorial.rest.resources.BlogEntryResource;
import tutorial.rest.resources.asm.BlogEntryResourceAsm;

/**
 * Created by piriyatharsika.senth on 30.08.16.
 */
@Controller
public class BlogEntryController {

    private BlogEntryService blogEntryService;

    public BlogEntryController(BlogEntryService service){

        this.blogEntryService = service;
    }


    @RequestMapping(value = "/rest/blog-entries/{blogEntryId}", method = RequestMethod.GET)
    public ResponseEntity<BlogEntryResource> getBlogEntry(
            @PathVariable Long blogEntryId){
        BlogEntry entry = blogEntryService.find(blogEntryId);
        BlogEntryResource blogEntryResource = new BlogEntryResourceAsm().toResource(entry);
        return  new ResponseEntity<BlogEntryResource>(blogEntryResource, HttpStatus.OK);

    }
}
