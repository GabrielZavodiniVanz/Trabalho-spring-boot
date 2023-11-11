package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carros")
public class CarroController {
    private List<Carro> carros = new ArrayList<>();

    @GetMapping
    public List<Carro> listarCarros() {
        return carros;
    }

    @PostMapping
    public Carro cadastrarCarro(@RequestBody Carro carro) {
        carros.add(carro);
        return carro;
    }
}