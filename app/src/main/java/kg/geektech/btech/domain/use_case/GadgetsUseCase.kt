package kg.geektech.btech.domain.use_case

import kg.geektech.btech.domain.repository.GadgetRepository
import javax.inject.Inject

class GadgetsUseCase @Inject constructor(private val gadgetRepository: GadgetRepository) {
    fun getAllGadgets() = gadgetRepository.getAllGadgets()
}