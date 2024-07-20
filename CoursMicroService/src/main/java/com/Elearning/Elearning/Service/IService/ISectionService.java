package com.Elearning.Elearning.Service.IService;

import com.Elearning.Elearning.Entity.Section;

import java.util.List;

public interface ISectionService {
    public Section createSection(Section Section);
    public Section updateSection(Section Section);
    public List<Section> findAllSections();
    public Section findSectionById(long id);
    public void deleteSection(long id);
}
