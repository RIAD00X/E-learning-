package com.Elearning.Elearning.Service;

import com.Elearning.Elearning.Entity.Session;
import com.Elearning.Elearning.Repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {
    @Autowired
    private SessionRepository sessionRepository;

    public Session createSession(Session Session)
    {
        return sessionRepository.save(Session);
    }
    public Session updateSession(Session Session)
    {
        return sessionRepository.save(Session);
    }

    public List<Session> findAllSessions()
    {
        return sessionRepository.findAll();
    }

    public Session findSessionById(long id)
    {
        return sessionRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid Session Id:" + id));
    }

    public void deleteSession(long id)
    {
        sessionRepository.deleteById(id);
    }
}
