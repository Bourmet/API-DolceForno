package com.Dolce.DolceForno.empresa;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    private EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    //Listar Estoque
    public List<EmpresaModel> estoque(){
        return empresaRepository.findAll();
    }

    //Adicionar sabor
    public EmpresaModel adicionarSabor(EmpresaModel empresaModel){
        return empresaRepository.save(empresaModel);
    }
}
