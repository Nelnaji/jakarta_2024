package demo.jakarta.services;

import demo.jakarta.entities.Plane;
import java.util.List;

public interface PlaneService {

    List<Plane> getAll();
    Plane create(Plane plane);
    void update(Plane plane);
    void delete(long id);
}
