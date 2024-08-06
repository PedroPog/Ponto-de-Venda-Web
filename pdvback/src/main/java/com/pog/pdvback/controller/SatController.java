package com.pog.pdvback.controller;

import com.pog.pdvback.models.sat.CancelarVenda;
import com.pog.pdvback.models.sat.VendaDados;
import com.pog.pdvback.service.SatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sat")
public class SatController {

    @Autowired
    private SatService satService;

    @GetMapping("/status")
    public String GetStatus(){
        return satService.GetStatus();
    }
    @GetMapping("/operacional")
    public String StatusOperacional(@RequestHeader String cod){
        return satService.StatusOperacional(cod);
    }
    @PostMapping("/venda")
    public String EnviarDadosVenda(@RequestBody VendaDados vendaDados){
        return satService.EnviarDadosVenda(vendaDados.getCod(),vendaDados.getDados());
    }
    @PostMapping("/cencelar")
    public String CencelarUltimaVenda(@RequestBody CancelarVenda cancelarVenda){
        return satService.CancelarUltimaVenda(cancelarVenda.getCod(),
                cancelarVenda.getChave(),cancelarVenda.getDadosscancel());
    }
    @GetMapping("/logs")
    public String ExtrairLogs(@RequestHeader String cod){
        return satService.ExtrairLogs(cod);
    }
}
