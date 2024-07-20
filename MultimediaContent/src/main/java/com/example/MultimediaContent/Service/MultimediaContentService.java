package com.example.MultimediaContent.Service;

import com.example.MultimediaContent.Entity.MultimediaContent;
import com.example.MultimediaContent.Repository.MultimediaContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MultimediaContentService {
    @Autowired
    private MultimediaContentRepository repository;

    public List<MultimediaContent> getAllContent() {
        return repository.findAll();
    }
    public Optional<MultimediaContent> getContentById(Long id) {
        return repository.findById(id);
    }

    public MultimediaContent saveContent(MultimediaContent content) {
        return repository.save(content);
    }

    public void deleteContent(Long id) {
        repository.deleteById(id);
    }
}
