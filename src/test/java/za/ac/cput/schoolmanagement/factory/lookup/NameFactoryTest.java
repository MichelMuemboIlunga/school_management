package za.ac.cput.schoolmanagement.factory.lookup;

import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.lookup.Name;
import za.ac.cput.schoolmanagement.factory.lookup.NameFactory;

import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest {

    @Test
    void createNameSuccess() throws IllegalArgumentException {
        Name name = NameFactory.createName("Lufulwabo", "Franck", "Kalengayi");
        assertNotNull(name);
        assertEquals("Lufulwabo", name.getFirstName());
        System.out.println(name);
    }

    @Test
    void createNameFail() {
        assertThrows(IllegalArgumentException.class, ()->{
            NameFactory.createName("", "Sweet", "Bone");
        });
        System.out.println("Thrown an error as expected");
    }

}