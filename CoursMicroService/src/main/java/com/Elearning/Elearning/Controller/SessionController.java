package com.Elearning.Elearning.Controller;

import com.Elearning.Elearning.Entity.Session;
import com.Elearning.Elearning.Service.IService.ISectionService;
import com.Elearning.Elearning.Service.IService.ISessionService;
import com.Elearning.Elearning.Service.SectionService;
import com.Elearning.Elearning.Service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {
    @Autowired
    private ISessionService sessionService;

    @Autowired
    private ISectionService sectionService;

    @GetMapping
    public List<Session> getSessions() {
        return sessionService.findAllSessions();
    }

    @PostMapping
    public Session addSession(Session session,@RequestParam int section) {
        session.setSection(sectionService.findSectionById(section));

        return sessionService.createSession(session);
    }

    @PutMapping
    public Session updateSession(Session session,@RequestParam("sec") int idSec) {
        session.setSection(sectionService.findSectionById(idSec));
        session.setResources(sessionService.findSessionById(session.getId()).getResources());
        return sessionService.updateSession(session);
    }

    @DeleteMapping("/{id}")
    public void deleteSession(@PathVariable long id) {
        sessionService.deleteSession(id);
    }

    @GetMapping("/{id}")
    public Session getSessionById(@PathVariable long id) {
        return sessionService.findSessionById(id);
    }
}
