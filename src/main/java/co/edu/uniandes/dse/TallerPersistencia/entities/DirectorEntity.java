package co.edu.uniandes.dse.TallerPersistencia.entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class DirectorEntity extends BaseEntity {

    private Long id;
    private String nombre;
    private String nacionalidad;

    @OneToMany(mappedBy = "director")
    private List<MovieEntity> peliculas;

    
}
