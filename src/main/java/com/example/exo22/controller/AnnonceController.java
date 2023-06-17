package com.example.exo22.controller;

import com.example.exo22.dto.Annonce;
import com.example.exo22.services.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("annonce")
@RestController
@Component
public class AnnonceController {
    private AnnonceService AnnonceService;

    @Autowired
    public AnnonceController(AnnonceService AS) {
        this.AnnonceService = AS;
    }

    @GetMapping("all")
    public List<Annonce> getAnnonces() {
        return AnnonceService.getAnnonces();
    }

    @GetMapping("{id}")
    public Optional<Annonce> getById(@PathVariable("id") String id) {
        return AnnonceService.getById(id);
    }

    @PostMapping("new")
    public void add(@RequestBody Annonce annonce) {
        AnnonceService.add(annonce);
    }

    @PutMapping("update/{id}")
    public void update(@PathVariable("id") String id, @RequestBody Annonce annonce) {
        AnnonceService.update(id, annonce);
    }

    @DeleteMapping("delete")
    public void update(@RequestParam("id") String id) {
        AnnonceService.delete(id);
    }
}
