package one.digitalinnovation.project.projetodemicroservico.repository;


import one.digitalinnovation.project.projetodemicroservico.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface productRepository extends CrudRepository<Product, Integer> {
}
