package one.digitalinnovation.project.projetodemicroservico.controller;

import one.digitalinnovation.project.projetodemicroservico.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/Product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional <Product> findById(@PathVariable Integer id) {
        return productRepository.findById(id);
    }
}
