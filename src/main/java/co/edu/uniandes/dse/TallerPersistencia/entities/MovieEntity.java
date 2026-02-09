package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }   
    
}
