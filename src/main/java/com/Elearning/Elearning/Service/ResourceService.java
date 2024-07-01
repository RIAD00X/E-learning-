package com.Elearning.Elearning.Service;

import com.Elearning.Elearning.Entity.Resource;
import com.Elearning.Elearning.Repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceService {
    @Autowired
    private ResourceRepository resourceRepository;

    public Resource createResource(Resource Resource)
    {
        return resourceRepository.save(Resource);
    }
    public Resource updateResource(Resource Resource)
    {
        return resourceRepository.save(Resource);
    }

    public List<Resource> findAllResources()
    {
        return resourceRepository.findAll();
    }

    public Resource findResourceById(long id)
    {
        return resourceRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Resource Id:" + id));
    }

    public void deleteResource(long id)
    {
        resourceRepository.deleteById(id);
    }
}
