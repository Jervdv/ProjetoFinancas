package service;

import entities.Categoria;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class TransacaoService {
    
    private List<Categoria> categorias;

    public TransacaoService() {
        categorias = new ArrayList<Categoria>();
        
    }

    public List<Categoria> buscarCategorias(){
        
        return categorias;
    }
    
    public void cadastrarCategoria(Categoria cat){
        this.categorias.add(cat);
    }
    
    public void editarCategoria(){
        
    }
    
    public void excluirCategoria(){
        
    }
}
