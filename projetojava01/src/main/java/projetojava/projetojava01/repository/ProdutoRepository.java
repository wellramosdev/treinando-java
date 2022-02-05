package projetojava.projetojava01.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import projetojava.projetojava01.model.Produto;

@Repository
public class ProdutoRepository {
    private List<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoid = 0;

             
public List<Produto> obterTodos(){
    return produtos;

}


}
