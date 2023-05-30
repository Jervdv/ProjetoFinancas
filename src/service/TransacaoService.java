package service;

import entities.Categoria;

/**
 *
 * @author User
 */
public class TransacaoService {
    public Categoria cadastrarCategoria(String nome, int id){
        return new Categoria(nome, id);
    }
    public void editarCategoria(){
        
    }
    
    public void excluirCategoria(){
        
    }
}
