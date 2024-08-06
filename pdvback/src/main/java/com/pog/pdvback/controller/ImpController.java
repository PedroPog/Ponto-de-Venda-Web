package com.pog.pdvback.controller;

import com.pog.pdvback.service.ImpService;
import com.pog.pdvback.service.SatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/impressora")
public class ImpController {

    @Autowired
    private ImpService impService;

    @GetMapping()
    public int GetImpressora(@RequestParam String texto){
        return impService.GetStatus(texto);
    }
}
