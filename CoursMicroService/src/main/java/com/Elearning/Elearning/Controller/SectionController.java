package com.Elearning.Elearning.Controller;

import com.Elearning.Elearning.Entity.Section;
import com.Elearning.Elearning.Service.CourseService;
import com.Elearning.Elearning.Service.IService.ICourseService;
import com.Elearning.Elearning.Service.IService.ISectionService;
import com.Elearning.Elearning.Service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sections")
public class SectionController {
    @Autowired
    private ISectionService sectionService;

    @Autowired
    private ICourseService courseService;

    @GetMapping
    public List<Section> getSections() {
        return sectionService.findAllSections();
    }

    @PostMapping
    public Section addSection(@RequestParam String title,@RequestParam("course") int idC) {
        Section section = new Section();
        section.setTitle(title);
        section.setCourse(courseService.findCourseById(idC).orElseThrow());
        return sectionService.createSection(section);
    }

    @PutMapping
    public Section updateSection(@RequestParam String title,@RequestParam int id,@RequestParam("course") int idC) {
        Section section = sectionService.findSectionById(id);
        section.setTitle(title);
        section.setCourse(courseService.findCourseById(idC).orElseThrow());
        section.setSessions(section.getSessions());
        return sectionService.updateSection(section);
    }

    @DeleteMapping("/{id}")
    public void deleteSection(@PathVariable long id) {
        sectionService.deleteSection(id);
    }

    @GetMapping("/{id}")
    public Section getSectionById(@PathVariable long id) {

        return sectionService.findSectionById(id);
    }
}
