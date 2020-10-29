package br.com.livresbs.livres.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livresbs.livres.model.DataEntrega;
import br.com.livresbs.livres.model.EstoqueProdutor;

public interface EstoqueProdutorRepository extends JpaRepository<EstoqueProdutor, Integer>{

    Page<EstoqueProdutor> findByDatasEntrega(DataEntrega dataEntrega, Pageable pagina);

    Page<EstoqueProdutor> findByDatasEntregaAndProdutoCategoriaNomeIn(DataEntrega dataEntrega, List<String> categorias, Pageable pagina);

}
