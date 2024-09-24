package demo.jakarta.repositories.impls;
import demo.jakarta.entities.PlaneType;
import demo.jakarta.repositories.PlaneTypeRepository;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

//Preparing an instance to make it injectable
@SessionScoped
public class PlaneTypeRepositoryImpl extends BaseRepositoryImpl <PlaneType, Long>  implements PlaneTypeRepository, Serializable {

    public PlaneTypeRepositoryImpl(){
        super(PlaneType.class);
    }
}
