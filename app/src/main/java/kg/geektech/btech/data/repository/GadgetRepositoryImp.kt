package kg.geektech.btech.data.repository

import com.example.seventhmfirsthm.data.local.GadgetDao
import kg.geektech.btech.data.network.api.GadgetApi
import kg.geektech.btech.data.network.model.GadgetDTO
import kg.geektech.btech.domain.repository.GadgetRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GadgetRepositoryImp @Inject constructor(private val api: GadgetApi,private val gadgetDao: GadgetDao) : GadgetRepository {
    override suspend fun getProducts(): Flow<List<GadgetDTO>> {
        TODO("Not yet implemented")
    }

    override suspend fun getDetailProduct(id: Int): Flow<GadgetDTO> {
        TODO("Not yet implemented")
    }

    override suspend fun addGadgetBasket(gadgetDTO: GadgetDTO): Flow<Unit> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteGadgetBasket(gadgetDTO: GadgetDTO): Flow<Unit> {
        TODO("Not yet implemented")
    }


}