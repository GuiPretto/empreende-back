package org.guipretto.empreendeback.entity

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = 'limite')
class Limite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "limite_id", referencedColumnName = "id")
    List<Coordenada> coordenadas
}
