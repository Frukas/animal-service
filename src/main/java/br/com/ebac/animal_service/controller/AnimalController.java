package br.com.ebac.animal_service.controller;

import br.com.ebac.animal_service.entidades.Animal;
import br.com.ebac.animal_service.entidades.RecebedorDTO;
import br.com.ebac.animal_service.repositorios.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private AnimalRepository repository;

    public AnimalController(AnimalRepository animalRepository){
        this.repository = animalRepository;
    }

    @GetMapping
    private List<Animal> findAll(){
        return repository.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal){
        return repository.save(animal);
    }

    @GetMapping("not-adopted")
    private List<Animal> findNotAdopted(){
        return repository.findNotAdopted();
    }

    @GetMapping("adopted")
    private List<Animal> findAdopted(){
        return repository.findAdopted();
    }

//    @GetMapping("recebedores")
//    private List<RecebedorDTO> findRecebedores(){
//        return repository.findRecebedores();
//    }

    @GetMapping("recebedores")
    private List<RecebedorDTO>findRecebedores(){
    return repository.findRecebedores();
    }
}
