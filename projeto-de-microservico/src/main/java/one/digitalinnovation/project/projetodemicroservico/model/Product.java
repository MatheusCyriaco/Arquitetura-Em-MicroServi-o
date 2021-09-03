package one.digitalinnovation.project.projetodemicroservico.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "Product", type = "catalog")
public class Product {

    @Id
    private long id;
    private String name;
    private Integer anount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAnount() {
        return anount;
    }

    public void setAnount(Integer anount) {
        this.anount = anount;
    }
}
