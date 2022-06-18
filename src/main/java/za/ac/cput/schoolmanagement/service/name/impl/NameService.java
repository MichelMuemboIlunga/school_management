/*
 * Name.java
 * Entity for the Name
 * @Author: Lufulwabo Franck Kalengayi (220048762)
 * ADP3: June Assessment 2022
 * Date: 16 June 2022
 */

package za.ac.cput.schoolmanagement.service.name.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.schoolmanagement.domain.Name;
import za.ac.cput.schoolmanagement.repository.name.INameRepository;
import za.ac.cput.schoolmanagement.service.name.INameService;

import java.util.List;
import java.util.Optional;


@Service
public class NameService implements INameService {

    private final INameRepository repository;

    @Autowired
    public NameService(INameRepository repository) {
        this.repository = repository;
    }


    @Override
    public Name save(Name name) {
        return this.repository.save(name);
    }

    @Override
    public Optional<Name> read(String ID) {
        return this.repository.findById(ID);
    }

    @Override
    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public List<Name> findAll() {
        return this.repository.findAll();
    }
}
