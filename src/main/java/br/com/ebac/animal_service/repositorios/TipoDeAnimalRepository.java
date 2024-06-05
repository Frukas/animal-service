package br.com.ebac.animal_service.repositorios;

import br.com.ebac.animal_service.entidades.TipoDeAnimal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDeAnimalRepository extends JpaRepository<TipoDeAnimal, Integer> {
}
