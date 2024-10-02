package com.javaadvanced.simulado.controller;

import com.javaadvanced.simulado.entity.Blog;
import com.javaadvanced.simulado.entity.Owner;
import com.javaadvanced.simulado.repository.BlogRepository;
import com.javaadvanced.simulado.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("api/owner")
public class OwnerController {

    @Autowired
    private OwnerRepository ownerRepository;
    @Autowired
    private BlogRepository blogRepository;

    @PostMapping("/create")
    public Owner saveOwner(@RequestBody Owner owner) {
        System.out.println("Owner save called...");
        Owner ownerOut = ownerRepository.save(owner);
        System.out.println("Saved!!!");

        return ownerOut;
    }

    @GetMapping("/get/{id}")
    public Optional<Owner> getOwner(@PathVariable String id) {
        System.out.println("Owner get() called...");
        Optional<Owner> outOwner = ownerRepository.findById(Long.valueOf(id));
        System.out.println("Owner with Engine :: " + outOwner);

        return outOwner;
    }

    @GetMapping("/jpqltest/{title}")
    public Collection<Blog> getBlogsByTitle(@PathVariable String title) {
        System.out.println("Owner get() called...");
        Collection<Blog> outOwner = blogRepository.getBlogsByTitleNative(title);
        //Collection<Blog> outOwner = blogRepository.jpqlTest1(title);
        System.out.println("Owner with Engine :: " + outOwner);

        return outOwner;
    }

    @GetMapping("/querytest/{param}")
    public Collection<Owner> queryTest(@PathVariable String param) {
        return ownerRepository.findByNameNot(param);
    }

}