package org.guipretto.empreendeback.controller

import org.guipretto.empreendeback.entity.Empreendimento
import org.guipretto.empreendeback.service.EmpreendimentoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/empreendimento')
class EmpreendimentoController {

    @Autowired
    EmpreendimentoService empreendimentoService

    @GetMapping
    List<Empreendimento> getAllEmpreendimento(@RequestParam("nome") String nome, @RequestParam("quartos") Long quartos) {
        empreendimentoService.findAll(nome, quartos)
    }

    @PostMapping
    Empreendimento salvarEmpreendimento(@RequestBody Empreendimento empreendimento) {
        empreendimentoService.salvarEmpreendimento(empreendimento)
    }

    @PutMapping
    Empreendimento atualizarEmpreendimento(@RequestBody Empreendimento empreendimento) {
        empreendimentoService.atualizarEmpreendimento(empreendimento)
    }

    @DeleteMapping('/{empreendimentoId}')
    Empreendimento deletarEmpreendimento(@PathVariable Integer empreendimentoId) {
        empreendimentoService.deletarEmpreendimento(empreendimentoId)
    }

    @GetMapping('/getEmpreendimentoPorSlug/{empreendimentoSlug}')
    Empreendimento getEmpreendimento(@PathVariable String empreendimentoSlug){
        empreendimentoService.findBySlug(empreendimentoSlug)
    }

    @GetMapping('/getEmpreendimentoPorId/{empreendimentoId}')
    Empreendimento getEmpreendimento(@PathVariable Integer empreendimentoId){
        empreendimentoService.findById(empreendimentoId)
    }
}
