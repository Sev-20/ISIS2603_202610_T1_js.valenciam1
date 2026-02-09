package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;
import jakarta.persistence.CascadeType;

@Entity
@Data
public class MovieEntity extends BaseEntity {

    private Long id;
    private String titulo;
    private Integer anoSalida;


    @ManyToOne
    private DirectorEntity director;

    @ManyToMany
    private java.util.List<GenreEntity> genres;

    @OneToOne(cascade = CascadeType.REMOVE, orphanRemoval = true)
    private ScriptEntity script;
    
}
