package org.guipretto.empreendeback.entity

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToMany
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = 'empreendimento')
class Empreendimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @Column
    String nome

    @Column
    String slug

    @Column
    Long contato

    @Column
    Long area

    @Column
    Long quartos

    @Column
    Long vagas

    @OneToOne(cascade = CascadeType.ALL)
    Endereco endereco
}
