package kg.geektech.btech.core

import kg.geektech.btech.data.network.model.GadgetDTO
import kg.geektech.btech.domain.model.Gadget

fun GadgetDTO.gadgetDtoToNote() =
    Gadget(image = this.image, price = this.price, subtext = this.subtext, title = this.title)

fun Gadget.gadgetToGadgetDto() =
    GadgetDTO(image = this.image, price = this.price, subtext = this.subtext,title = this.title)