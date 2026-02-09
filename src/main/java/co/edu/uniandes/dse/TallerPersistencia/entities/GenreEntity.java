package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class GenreEntity extends BaseEntity {

    private Long id;
    private String name;
    @ManyToMany(mappedBy = "genres")
    private java.util.List<MovieEntity> movies;
    
}
