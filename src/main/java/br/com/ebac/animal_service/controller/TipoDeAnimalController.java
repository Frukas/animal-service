package br.com.ebac.animal_service.controller;

import br.com.ebac.animal_service.entidades.Animal;
import br.com.ebac.animal_service.entidades.TipoDeAnimal;
import br.com.ebac.animal_service.repositorios.TipoDeAnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo-animais")
public class TipoDeAnimalController {

    private TipoDeAnimalRepository repository;

    public TipoDeAnimalController(TipoDeAnimalRepository repository){
        this.repository = repository;
    }

    @GetMapping
    private List<TipoDeAnimal> findAll(){
        return repository.findAll();
    }

    @PostMapping
    private TipoDeAnimal create(@RequestBody TipoDeAnimal tipoDeAnimal){
        return repository.save(tipoDeAnimal);
    }
}
