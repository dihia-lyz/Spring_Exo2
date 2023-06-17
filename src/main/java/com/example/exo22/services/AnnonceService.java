package com.example.exo22.services;

import com.example.exo22.dto.Annonce;
import com.example.exo22.repository.AnnonceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class AnnonceService {
    private AnnonceRepository AnnonceRepo;

    @Autowired
    public AnnonceService(AnnonceRepository ar) {
        this.AnnonceRepo = ar;
    }

    public List<Annonce> getAnnonces() {
        System.out.println("service");
        List<Annonce> result = new ArrayList<Annonce>();
        Iterable<Annonce> T = AnnonceRepo.findAll();
        System.out.println("iter" + T);
        for (Annonce a : T) {
            result.add(a);
        }
        return result;
    }

    public Optional<Annonce> getById(String id) {
        return AnnonceRepo.findById(id);
    }

    public void add(Annonce annonce) {
        AnnonceRepo.save(annonce);
    }

    public void update(String id, Annonce annonce) {
        Optional<Annonce> A = AnnonceRepo.findById(id);
        System.out.println("okk" + A);
        if (A != null) AnnonceRepo.save(annonce);
    }

    public void delete(String id) {
        AnnonceRepo.deleteById(id);
    }


}
