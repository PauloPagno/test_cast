package br.com.cast.avaliacao.reposirory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cast.avaliacao.model.Curso;

@Repository
public interface CursoReposirory extends JpaRepository<Curso, Long> {

}
