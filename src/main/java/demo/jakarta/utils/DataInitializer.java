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



        PlaneType planeType1 = new PlaneType("boeing 134", "boeing", 741.7, 145);
        PlaneType planeType2 = new PlaneType("Airbus 420", "Airbus", 1500, 245);
        PlaneType planeType3 = new PlaneType("boeing 101", "boeing", 370, 58);




        Plane plane1 = new Plane(
                "123", 5, null,
                planeType1
        );
        Plane plane2 = new Plane(
                "456", 456, null, planeType2
        );
        Plane plane3 = new Plane(
                "789", 2, null,
                planeType3
        );

        planeRepository.save(plane1);
        planeRepository.save(plane2);
        planeRepository.save(plane3);



    }
}
