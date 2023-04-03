package com.example.SVCoorp.controller;

import com.example.SVCoorp.model.Despesa;
import com.example.SVCoorp.service.DespesaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesas")
public class DespesaController {
    private final DespesaService despesaService;

    public DespesaController(DespesaService despesaService) {
        this.despesaService = despesaService;
    }
    @PostMapping
    public Despesa salvar(@RequestBody Despesa despesa){
        Despesa despesaSalva = null;
        try {
            despesaSalva = despesaService.salvar(despesa);
        }catch (IllegalArgumentException exception){
            System.out.println("NF já cadastrada");
        }
        return despesaSalva;
    }
    @GetMapping("/listar")
    public List<Despesa> listar(){
        return despesaService.listar();
    }
    @GetMapping("/{id}")
    public Despesa buscar(@PathVariable Long id){
        return despesaService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public Despesa deletar(@PathVariable Long id){
        return despesaService.deletar(id);
    }
}
