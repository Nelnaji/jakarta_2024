package demo.jakarta.services.impls;

import demo.jakarta.entities.Plane;
import demo.jakarta.repositories.PlaneRepository;
import demo.jakarta.services.PlaneService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;
@SessionScoped
public class PlaneServiceImpl implements PlaneService, Serializable {

    @Inject
    private PlaneRepository planeRepository;

    @Override
    public List<Plane> getAll() {
        return planeRepository.findAll();
    }

    @Override
    public Plane create(Plane plane) {
        return null;
    }

    @Override
    public void update(Plane plane) {

    }

    @Override
    public void delete(long id) {
            planeRepository.delete(id);
    }
}
