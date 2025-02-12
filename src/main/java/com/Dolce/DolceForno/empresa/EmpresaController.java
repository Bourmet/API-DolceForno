package com.Dolce.DolceForno.empresa;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    private EmpresaService empresaService;
    public EmpresaController(EmpresaService empresaService){
        this.empresaService = empresaService;
    }

    //Mostrar sabores e quantidade
    @GetMapping("/estoque")
    public List<EmpresaModel> estoque(){
        return empresaService.estoque();
    }

    //Adicionar sabor
    @PostMapping("/criar")
    public EmpresaModel adicionarSabor(@RequestBody EmpresaModel empresaModel){
        return empresaService.adicionarSabor(empresaModel);
    }
    //Alterar quantidade
}
