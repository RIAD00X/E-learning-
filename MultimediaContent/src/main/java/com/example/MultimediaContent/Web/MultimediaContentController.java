package com.example.MultimediaContent.Web;

import com.example.MultimediaContent.Entity.MultimediaContent;
import com.example.MultimediaContent.Service.MultimediaContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/content")
public class MultimediaContentController {
    @Autowired
    private MultimediaContentService service ;
    @GetMapping
    public List<MultimediaContent> getAllContent() {
        return service.getAllContent();
    }
    @GetMapping("/{id}")
    public Optional<MultimediaContent> getContentById(@PathVariable Long id) {
        return service.getContentById(id);
    }

    @PostMapping
    public MultimediaContent uploadContent(@RequestBody MultimediaContent content) {
        return service.saveContent(content);
    }

    @DeleteMapping("/{id}")
    public void deleteContent(@PathVariable Long id) {
        service.deleteContent(id);
    }
}
