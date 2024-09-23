package demo.jakarta.services.impls;

import demo.jakarta.entities.Plane;
import demo.jakarta.repositories.PlaneRepository;
import demo.jakarta.services.PlaneService;
import jakarta.inject.Inject;

import java.util.List;

public class PlaneServiceImpl implements PlaneService {

@Inject
private PlaneRepository planeRepository;
    @Override
    public List<Plane> getAll() {
        return List.of();
    }
}
