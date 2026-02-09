package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class ScriptEntity extends BaseEntity {

    private Long id;
    private String nombre;
    private String nombreOriginal;
 
    @OneToOne
    @JoinColumn(name = "movie_id", nullable = false, unique = true)
    private MovieEntity pelicula;


}
