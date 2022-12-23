package kg.geektech.btech.domain.repository

import kg.geektech.btech.core.Resource
import kg.geektech.btech.domain.model.Gadget
import kotlinx.coroutines.flow.Flow

interface GadgetRepository {
    fun getAllGadgets(): Flow<Resource<List<Gadget>>>
    fun getDetailGadgets(id: Int): Flow<Resource<Gadget>>
    fun addGadgetBasket(gadget: Gadget): Flow<Resource<Unit>>
    fun deleteGadgetBasket(gadget: Gadget): Flow<Resource<Unit>>
}