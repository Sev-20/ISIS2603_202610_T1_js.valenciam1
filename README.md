# Taller Persistencia

## Enlaces de interés

- [BookstoreBack](https://github.com/Uniandes-isis2603/bookstore-back) -> Repositorio de referencia para el Back


# Justificación de respuesta


- @ManytoMany entre director y pelicula se escogio esta relación ya que un solo director puede tener varias peliculas y por lo mismo varias peliculas pueden tener el mismo director. Además que también funciona para el genero por que muchas peliculas pueden tener el mismo genero y un solo genero varias peliculas. MappedBy sirve para cuando hay bi dirección en los esquemas/UMLS/Diagramas, ya que esto funciona para que entre ellas se puedan encontrar, esta lo que hace es que pone la columna extra en la tabla con un ID especifico para referenciarlo con otra, como tipo las tablas de hash.

-@OneToOne esta relación esta dada solo en script para las peliculas por que las peliculas solo pueden tener un solo guion y el guion puede tener solo una pelicula.

- Al intentar eliminar un Director que tiene películas asociadas sin usar cascada, la base de datos H2 arroja una violación de integridad referencial. Este comportamiento es deseable, ya que evita que queden películas huérfanas referenciando a un director inexistente y garantiza la consistencia de las relaciones en el sistema.
