package com.Elearning.Elearning.Service;

import com.Elearning.Elearning.Entity.Section;
import com.Elearning.Elearning.Repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SectionService {
    @Autowired
    private SectionRepository sectionRepository;

    public Section createSection(Section Section)
    {
        return sectionRepository.save(Section);
    }
    public Section updateSection(Section Section)
    {
        return sectionRepository.save(Section);
    }

    public List<Section> findAllSections()
    {
        return sectionRepository.findAll();
    }

    public Section findSectionById(long id)
    {
        return sectionRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Section Id:" + id));
    }

    public void deleteSection(long id)
    {
        sectionRepository.deleteById(id);
    }
}
