package br.com.cast.avaliacao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.avaliacao.converter.DozerConverter;
import br.com.cast.avaliacao.exception.ResourceNotFoundException;
import br.com.cast.avaliacao.model.Categoria;
import br.com.cast.avaliacao.model.vo.CategoriaVO;
import br.com.cast.avaliacao.reposirory.CategoriaRepository;

@Service
public class CategoriaServices {

	@Autowired
	CategoriaRepository repository;

	public CategoriaVO create(CategoriaVO categoria) {
		
		var entity = DozerConverter.parseObject(categoria, Categoria.class);
		var vo = DozerConverter.parseObject(repository.save(entity), CategoriaVO.class);

		return vo;
	}

	public List<CategoriaVO> findAll() {
		return DozerConverter.parseListObjects(repository.findAll(), CategoriaVO.class);
	}

	public CategoriaVO findById(Long codigo) {

		var entity =  repository.findById(codigo).orElseThrow(() -> new ResourceNotFoundException("Categoria não encontrada!"));
		return DozerConverter.parseObject(repository.save(entity), CategoriaVO.class);

	}
	
	
	public CategoriaVO update(CategoriaVO categoria) {

		var  entity = repository.findById(categoria.getCodigo())
				.orElseThrow(() -> new ResourceNotFoundException("Categoria não encontrada!"));
		entity.setDescricao(categoria.getDescricao());
		var vo = DozerConverter.parseObject(repository.save(entity), CategoriaVO.class);
		return vo;
	}
	
		
	
	public void delete(Long codigo) {
		Categoria entity = repository.findById(codigo)
				.orElseThrow(() -> new ResourceNotFoundException("Categoria não encontrada!"));

		repository.delete(entity);
	}

}
