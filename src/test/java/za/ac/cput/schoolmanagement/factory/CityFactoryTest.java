package za.ac.cput.schoolmanagement.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.City;

import static org.junit.jupiter.api.Assertions.*;

class CityFactoryTest {

    @Test
    public void BuildWithSucess() {

        City city = CityFactory.build("2", "3");
        System.out.println(city);
        assertNotNull(city);
    }

    @Test
    void buildId() {
    }
}