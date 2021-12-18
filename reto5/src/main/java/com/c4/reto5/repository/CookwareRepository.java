package com.c4.reto5.repository;

import com.c4.reto5.model.Cookware;
import com.c4.reto5.repository.crud.InterfaceCookware;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jhon Rob
 */
@Repository
public class CookwareRepository {

    @Autowired
    private InterfaceCookware interfaceCookware;

    public List<Cookware> getAll() {
        return interfaceCookware.findAll();
    }

    public Optional<Cookware> getCookware(String reference) {
        return interfaceCookware.findById(reference);
    }

    public Cookware create(Cookware cookware) {
        return interfaceCookware.save(cookware);
    }

    public void update(Cookware cookware) {
        interfaceCookware.save(cookware);
    }

    public void delete(Cookware cookware) {
        interfaceCookware.delete(cookware);
    }
    
    //anexo reto5
    public List<Cookware> findByPriceLessThanEqual(double precio) {
        return interfaceCookware.findByPriceLessThanEqual(precio);
    }

    public List<Cookware> findByDescriptionLike(String description) {
        return interfaceCookware.findByDescriptionLike(description);
    }
    
    
}
