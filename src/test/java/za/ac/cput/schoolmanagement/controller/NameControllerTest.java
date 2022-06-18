/*
 * Name.java
 * Entity for the Name
 * @Author: Lufulwabo Franck Kalengayi (220048762)
 * ADP3: June Assessment 2022
 * Date: 16 June 2022
 */

package za.ac.cput.schoolmanagement.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.schoolmanagement.domain.Name;
import za.ac.cput.schoolmanagement.factory.NameFactory;
import za.ac.cput.schoolmanagement.service.name.impl.NameService;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class NameControllerTest {
   /* @Autowired
    private NameService nameService;
    Name name;

    @BeforeEach
    void BeforeEachTest()
    {
        name = NameFactory.build("Lufulwabo","Franck",
                "Kalengayi");
    }

    @Test
    void a_save() {
        Name e= this.nameService.save(name);
        System.out.println(e);
        assertNotNull(e);
    }

    @Test
    void b_read() {
        Optional<Name> read=this.nameService.read("Lufulwabo");
        assertNotNull(read);
        System.out.println(read);}

    @Test
    void delete() {
        this.nameService.deleteById("Lufulwabo");}
*/
}