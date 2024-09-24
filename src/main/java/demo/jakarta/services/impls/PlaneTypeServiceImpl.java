package demo.jakarta.services.impls;

import demo.jakarta.entities.PlaneType;
import demo.jakarta.repositories.PlaneTypeRepository;
import demo.jakarta.services.PlaneTypeService;
import jakarta.inject.Inject;

import java.util.List;

public class PlaneTypeServiceImpl implements PlaneTypeService {

    @Inject
    private PlaneTypeRepository planeTypeRepository;

    @Override
    public List<PlaneType> getAll() {
        return planeTypeRepository.findAll();
    }
}
