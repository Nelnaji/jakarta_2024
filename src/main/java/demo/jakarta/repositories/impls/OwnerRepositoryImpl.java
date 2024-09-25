package demo.jakarta.repositories.impls;

import demo.jakarta.entities.Owner;
import demo.jakarta.repositories.OwnerRepository;

import java.io.Serializable;

public class OwnerRepositoryImpl extends BaseRepositoryImpl<Owner, Long> implements OwnerRepository, Serializable {
    public OwnerRepositoryImpl(){
        super(Owner.class);
    }
}
