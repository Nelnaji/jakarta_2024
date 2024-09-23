package demo.jakarta.repositories.impls;


import demo.jakarta.entities.Plane;
import demo.jakarta.repositories.PlaneRepository;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class PlaneRepositoryImpl extends BaseRepositoryImpl<Plane, Long>  implements PlaneRepository, Serializable {

    public PlaneRepositoryImpl(){
        super(Plane.class);
    }
}
