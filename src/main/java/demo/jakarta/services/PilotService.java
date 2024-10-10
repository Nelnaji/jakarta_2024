package demo.jakarta.services;

import demo.jakarta.entities.Pilot;

import java.util.List;

public interface PilotService {

    List<Pilot> getAll();
    Pilot create(Pilot pilot);
    void update(Pilot pilot);
    void delete(long id);

}
