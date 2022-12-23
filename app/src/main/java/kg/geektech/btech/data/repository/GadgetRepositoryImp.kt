package kg.geektech.btech.data.repository

import com.example.seventhmfirsthm.data.local.GadgetDao
import kg.geektech.btech.data.network.api.GadgetApi
import kg.geektech.btech.data.network.model.GadgetDTO
import kg.geektech.btech.domain.repository.GadgetRepository
import javax.inject.Inject

class GadgetRepositoryImp @Inject constructor(private val api: GadgetApi) : GadgetRepository {

    override suspend fun getDetailProduct(): ArrayList<GadgetDTO> {
        TODO("Not yet implemented")
    }

    override suspend fun getProducts(id: Int): GadgetDTO {
        TODO("Not yet implemented")
    }

}