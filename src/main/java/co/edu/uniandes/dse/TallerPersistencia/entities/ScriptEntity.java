package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class ScriptEntity extends BaseEntity {

    private Long id;
    private String nombre;
    private String nombreOriginal;
 
    @OneToOne(mappedBy = "script")
    private MovieEntity pelicula;


}
