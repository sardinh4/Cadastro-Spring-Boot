package br.com.example.testespringboot2.repositorio;

import br.com.example.testespringboot2.modelo.ProdutoModelo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Long> {
}
