package com.Elearning.Elearning.Web;

import com.Elearning.Elearning.Entity.Resource;
import com.Elearning.Elearning.Service.ResourceService;
import com.Elearning.Elearning.Service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/resources")
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @Autowired
    private SessionService sessionService;

    @GetMapping
    public List<Resource> getResources() {
        return resourceService.findAllResources();
    }

    @PostMapping
    public Resource addResource(Resource resource,@RequestParam int session) {
        resource.setSession(sessionService.findSessionById(session));
        return resourceService.createResource(resource);
    }

    @PutMapping
    public Resource updateResource(Resource resource,@RequestParam int session) {
        resource.setSession(sessionService.findSessionById(session));
        return resourceService.updateResource(resource);
    }

    @DeleteMapping("/{id}")
    public void deleteResource(@PathVariable long id) {
        resourceService.deleteResource(id);
    }

    @GetMapping("/{id}")
    public Resource getResourceById(@PathVariable long id) {
        return resourceService.findResourceById(id);
    }
}
