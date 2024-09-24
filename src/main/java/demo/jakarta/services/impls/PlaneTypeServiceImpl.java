package demo.jakarta.services.impls;

import demo.jakarta.entities.PlaneType;
import demo.jakarta.repositories.PlaneTypeRepository;
import demo.jakarta.services.PlaneTypeService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class PlaneTypeServiceImpl implements PlaneTypeService, Serializable {

    @Inject
    private PlaneTypeRepository planeTypeRepository;

    @Override
    public List<PlaneType> getAll() {
        return planeTypeRepository.findAll();
    }
}
