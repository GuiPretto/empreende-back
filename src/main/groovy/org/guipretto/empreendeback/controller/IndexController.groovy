package org.guipretto.empreendeback.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/')
class IndexController {

    @GetMapping
    String index() {
        'We in the house'
    }
}
