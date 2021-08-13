package org.guipretto.empreendeback.service

import org.guipretto.empreendeback.entity.Empreendimento

interface EmpreendimentoService {
    List<Empreendimento> findAll(String nome, Long quartos)

    Empreendimento findById(Integer id)

    Empreendimento findBySlug(String slug)

    Empreendimento salvarEmpreendimento(Empreendimento empreendimento)

    Empreendimento atualizarEmpreendimento(Empreendimento empreendimento)

    Empreendimento deletarEmpreendimento(Integer id)
}