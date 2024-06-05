package br.com.ebac.animal_service.repositorios;

import br.com.ebac.animal_service.entidades.Animal;
import br.com.ebac.animal_service.entidades.RecebedorDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findNotAdopted();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL ")
    List<Animal> findAdopted();

   //@Query(value =  "SELECT NOME_RECEBEDOR AS recebedor, COUNT(NOME_RECEBEDOR) AS count FROM ANIMAL GROUP BY NOME_RECEBEDOR", nativeQuery = true)
  // List<RecebedorDTO> findRecebedores();

    @Query("SELECT a.nomeRecebedor AS recebedor, COUNT(a.nomeRecebedor) AS count FROM Animal a GROUP BY a.nomeRecebedor")
    List<RecebedorDTO> findRecebedores();


}
