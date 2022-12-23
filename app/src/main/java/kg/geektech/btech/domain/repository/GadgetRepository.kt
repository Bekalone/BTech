package kg.geektech.btech.domain.repository

import kg.geektech.btech.data.network.model.GadgetDTO
import kotlinx.coroutines.flow.Flow

interface GadgetRepository {
    suspend fun getProducts(): Flow<List<GadgetDTO>>
    suspend fun getDetailProduct(id: Int): Flow<GadgetDTO>
    suspend fun addGadgetBasket(gadgetDTO: GadgetDTO): Flow<Unit>
    suspend fun deleteGadgetBasket(gadgetDTO: GadgetDTO): Flow<Unit>
}