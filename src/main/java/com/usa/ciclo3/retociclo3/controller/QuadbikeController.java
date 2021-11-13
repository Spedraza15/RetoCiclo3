package com.usa.ciclo3.retociclo3.controller;


import com.usa.ciclo3.retociclo3.model.Quadbike;
import com.usa.ciclo3.retociclo3.service.QuadbikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Quadbike")
@CrossOrigin (origins= "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class QuadbikeController {
    @Autowired
    private QuadbikeService quadbikeService;

    @GetMapping("/all")
    public List<Quadbike> getAll(){return quadbikeService.getAll();}

    @GetMapping("/{id}")
    public Optional<Quadbike> getCabin(@PathVariable("id") int id){return quadbikeService.getQuadbike(id);}

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Quadbike save(@RequestBody Quadbike cabin){ return quadbikeService.save(cabin);}

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Quadbike update(@RequestBody Quadbike cabin){return quadbikeService.update(cabin);}

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Boolean delete(@PathVariable("id") int id){return quadbikeService.deleteQuadbike(id);}
}
