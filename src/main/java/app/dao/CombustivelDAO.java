package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("CombustivelDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface CombustivelDAO extends JpaRepository<Combustivel, java.lang.String> {

  /**
   * Obtém a instância de Combustivel utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Combustivel entity WHERE entity.id = :id")
  public Combustivel findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Combustivel utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Combustivel entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Combustivel c")
  public Page<Combustivel> list(Pageable pageable);
  


  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Abastecimento entity WHERE entity.combustivel.id = :id")
  public Page<Abastecimento> findAbastecimento(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key posto
   * @generated
   */
  @Query("SELECT entity FROM Combustivel entity WHERE entity.posto.id = :id")
  public Page<Combustivel> findCombustivelsByPosto(@Param(value="id") java.lang.String id, Pageable pageable);

}
