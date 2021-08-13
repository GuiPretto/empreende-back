package org.guipretto.empreendeback.service

import org.guipretto.empreendeback.entity.Empreendimento
import org.guipretto.empreendeback.entity.Endereco
import org.guipretto.empreendeback.repository.EmpreendimentoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EmpreendimentoServiceImpl implements EmpreendimentoService{

    @Autowired
    EmpreendimentoRepository empreendimentoRepository

    @Override
    List<Empreendimento> findAll(String nome, Long quartos) {
        if (quartos === 0) {
            empreendimentoRepository.findByNomeContainingAndQuartos(nome, quartos)
        } else {
            empreendimentoRepository.findByNomeContaining(nome)
        }
    }

    @Override
    Empreendimento findById(Integer id) {
        empreendimentoRepository.findById(id).get()
    }

    @Override
    Empreendimento findBySlug(String slug) {
        empreendimentoRepository.findBySlug(slug)
    }

    @Override
    Empreendimento salvarEmpreendimento(Empreendimento empreendimento) {
        empreendimentoRepository.save(empreendimento)
    }

    @Override
    Empreendimento atualizarEmpreendimento(Empreendimento empreendimento) {
        empreendimentoRepository.save(empreendimento)
    }

    @Override
    Empreendimento deletarEmpreendimento(Integer id) {
        empreendimentoRepository.deleteById(id)
    }
}
