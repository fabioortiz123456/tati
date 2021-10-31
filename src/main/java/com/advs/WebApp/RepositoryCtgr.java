
package com.advs.WebApp;

import Model.Categorias;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author David Vargas
 */
@Repository
public class RepositoryCtgr {
    @Autowired
    private InterfaceCtgr crud;
    
    public List<Categorias> getAll(){
        return (List<Categorias>) crud.findAll();
    }
    public Optional <Categorias> getCategorias(int id){
        return crud.findById(id);
    }
    public Categorias save(Categorias categorias){
        return crud.save(categorias);
    }    
     
    public void delete(Categorias Categorias){
       crud.delete(Categorias);
    }
}
