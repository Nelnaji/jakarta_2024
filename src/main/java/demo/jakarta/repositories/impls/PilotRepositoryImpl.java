package demo.jakarta.repositories.impls;

import demo.jakarta.entities.Pilot;
import demo.jakarta.repositories.PilotRepository;

import java.io.Serializable;


public class PilotRepositoryImpl extends BaseRepositoryImpl<Pilot, Long>  implements PilotRepository, Serializable {

    public PilotRepositoryImpl(){
        super(Pilot.class);
    }
}
