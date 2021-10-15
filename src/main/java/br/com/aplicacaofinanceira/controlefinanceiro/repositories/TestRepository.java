package br.com.aplicacaofinanceira.controlefinanceiro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.aplicacaofinanceira.controlefinanceiro.entities.EntityTest;

@Repository
public interface TestRepository extends JpaRepository<EntityTest, Long>{
	List<EntityTest> findEntityTestById(@Param("id") long id);

	List<EntityTest> findAll();
	
	EntityTest deleteById(@Param("id") long id);
	
	EntityTest save(@Param("entityTest")EntityTest entityTest);

	//	EntityTest insertEntityTest(@Param("conta") String conta, @Param("considerado") boolean considerado);

}
