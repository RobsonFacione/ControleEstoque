
/*esse arquivo é quem conversa com o banco
  só com esse código o sproing ja sabe fazer SALVAR, LISTAR, BUSCAR PO ID, EXCLUIR, ALTERAR
sem ter a necessidade de escrever SQL
*/
package com.controleestoque.backend.repository;

import com.controleestoque.backend.entity.Produto; //
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
  boolean existsByCodigo(String codigo);  //verifica se já existe produto com o mesmo código
}

