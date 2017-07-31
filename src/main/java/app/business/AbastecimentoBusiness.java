package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.dao.*;
import app.entity.*;

/**
 * Classe que representa a camada de negócios de AbastecimentoBusiness
 * 
 * @generated
 **/
@Service("AbastecimentoBusiness")
public class AbastecimentoBusiness {



  /**
   * Instância da classe AbastecimentoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("AbastecimentoDAO")
  protected AbastecimentoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Abastecimento post(final Abastecimento entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Abastecimento result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Abastecimento put(final Abastecimento entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Abastecimento result = repository.saveAndFlush(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public void delete(java.lang.String id) throws Exception {
    Abastecimento entity = this.get(id);
    // begin-user-code  
    // end-user-code
    this.repository.delete(entity);
    // begin-user-code  
    // end-user-code        
  }
  
  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public Abastecimento get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Abastecimento result = repository.findOne(id);
    // begin-user-code
    // end-user-code
    return result;
  }

  // CRUD
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Abastecimento> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Abastecimento> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Foreign Key user
   * @generated
   */
  public Page<Abastecimento> findAbastecimentosByUser(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Abastecimento> result = repository.findAbastecimentosByUser(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key posto
   * @generated
   */
  public Page<Abastecimento> findAbastecimentosByPosto(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Abastecimento> result = repository.findAbastecimentosByPosto(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key carro
   * @generated
   */
  public Page<Abastecimento> findAbastecimentosByCarro(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Abastecimento> result = repository.findAbastecimentosByCarro(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key combustivel
   * @generated
   */
  public Page<Abastecimento> findAbastecimentosByCombustivel(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Abastecimento> result = repository.findAbastecimentosByCombustivel(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
