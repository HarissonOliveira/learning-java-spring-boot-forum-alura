package br.com.harisson.forum.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.harisson.forum.models.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	public List<Topico> findByCursoNomeContains(String nomeCurso);
	
	// EXEMPLO GERANDO A QUERY
	@Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
	public List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
	
}