package br.com.harisson.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.harisson.forum.models.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	public Curso findByNome(String nomeCurso);
	
}