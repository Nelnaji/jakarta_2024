package demo.jakarta.repositories.impls;
import demo.jakarta.entities.PlaneType;
import demo.jakarta.repositories.PlaneTypeRepository;

import java.io.Serializable;

public class PlaneTypeRepositoryImpl extends BaseRepositoryImpl <PlaneType, Long>  implements PlaneTypeRepository, Serializable {

    public PlaneTypeRepositoryImpl(){
        super(PlaneType.class);
    }
}
