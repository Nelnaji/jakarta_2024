package demo.jakarta.utils;

import demo.jakarta.entities.Plane;
import demo.jakarta.entities.PlaneType;
import demo.jakarta.repositories.PlaneRepository;
import demo.jakarta.repositories.PlaneTypeRepository;
import demo.jakarta.repositories.impls.PlaneRepositoryImpl;
import demo.jakarta.repositories.impls.PlaneTypeRepositoryImpl;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class DataInitializer implements ServletContextListener {

    private final PlaneTypeRepository planeTypeRepository;
    private final PlaneRepository planeRepository;


    public DataInitializer() {
        this.planeRepository = new PlaneRepositoryImpl();
        this.planeTypeRepository = new PlaneTypeRepositoryImpl();
    }


    @Override
    public void contextInitialized(ServletContextEvent sce) {

        Plane plane1 = new Plane(
                "123", 5
        );
        Plane plane2 = new Plane(
                "456", 456
        );
        Plane plane3 = new Plane(
                "789", 2
        );

        planeRepository.save(plane1);
        planeRepository.save(plane2);
        planeRepository.save(plane3);



        PlaneType planeType1 = new PlaneType("boeing 752", "boeing", 741.7, 145);
        PlaneType planeType2 = new PlaneType("boeing 421", "boeing", 556.2, 245);
        PlaneType planeType3 = new PlaneType("boeing 785", "boeing", 800, 58);


        planeTypeRepository.save(planeType1);
        planeTypeRepository.save(planeType2);
        planeTypeRepository.save(planeType3);


    }
}
