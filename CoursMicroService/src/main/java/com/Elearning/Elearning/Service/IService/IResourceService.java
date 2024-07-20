package com.Elearning.Elearning.Service.IService;

import com.Elearning.Elearning.Entity.Resource;

import java.util.List;

public interface IResourceService {
    public Resource createResource(Resource Resource);
    public Resource updateResource(Resource Resource);
    public List<Resource> findAllResources();
    public Resource findResourceById(long id);
    public void deleteResource(long id);
}
