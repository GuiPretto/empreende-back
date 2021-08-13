package org.guipretto.empreendeback.repository

import org.guipretto.empreendeback.entity.Empreendimento
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmpreendimentoRepository extends JpaRepository<Empreendimento, Integer> {
    Empreendimento findBySlug(String slug)

    List<Empreendimento> findByNomeContainingAndQuartos(String nome, Long quartos)

    List<Empreendimento> findByNomeContaining(String nome)
}
