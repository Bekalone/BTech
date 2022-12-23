package kg.geektech.btech.domain.use_case

import kg.geektech.btech.domain.repository.GadgetRepository
import javax.inject.Inject

class DetailGadgetUseCase @Inject constructor(private val gadgetRepository: GadgetRepository) {
    fun getDetailGadgets(id:Int) = gadgetRepository.getDetailGadgets(id)
}