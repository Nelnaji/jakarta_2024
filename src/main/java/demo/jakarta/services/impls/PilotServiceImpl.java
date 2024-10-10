package demo.jakarta.services.impls;

import demo.jakarta.entities.Pilot;
import demo.jakarta.repositories.PilotRepository;
import demo.jakarta.services.PilotService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class PilotServiceImpl implements PilotService, Serializable {
    @Inject
    private PilotRepository pilotRepository;

    @Override
    public List<Pilot> getAll() {
        return pilotRepository.findAll();
    }

    @Override
    public Pilot create(Pilot pilot) {
        return pilotRepository.save(pilot);
    }

    @Override
    public void update(Pilot pilot) {
        pilotRepository.update(pilot);
    }

    @Override
    public void delete(long id) {
        pilotRepository.delete(id);
    }
}
