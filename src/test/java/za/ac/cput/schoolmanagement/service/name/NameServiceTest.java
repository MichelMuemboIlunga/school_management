package za.ac.cput.schoolmanagement.service.name;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.schoolmanagement.domain.Name;
import za.ac.cput.schoolmanagement.factory.NameFactory;
import za.ac.cput.schoolmanagement.service.name.impl.NameService;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)
class NameServiceTest {

    @Autowired
    private NameService service;
    private Name name = NameFactory.createName("Franck", "Hun", "Bone");

    @Test
    void a_create() {
        Name temp =service.save(name);
        assertNotNull(temp);
        System.out.println(temp.toString());
    }

    @Test
    void d_delete() {
        service.delete(name.getLastName());
        assertEquals(0, service.findAll().size());
    }

    @Test
    void c_getAll() {
        assertEquals(1, service.findAll().size());
    }

    @Test
    void b_read() {
        Optional <Name> read=service.read(name.getLastName());
        assertTrue(read.isPresent());

    }


}