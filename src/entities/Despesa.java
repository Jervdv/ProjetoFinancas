package entities;

/**
 *
 * @author User
 */
public class Despesa extends Transacao{

    public Despesa(Categoria categoria, String nome, Double mensal, Double ocasional) {
        super(categoria, nome, mensal, ocasional);
    }
    
}
