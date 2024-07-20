package com.Elearning.Elearning.Service.IService;

import com.Elearning.Elearning.Entity.Session;

import java.util.List;

public interface ISessionService {
    public Session createSession(Session Session);
    public Session updateSession(Session Session);
    public List<Session> findAllSessions();
    public Session findSessionById(long id);
    public void deleteSession(long id);
}
