package kg.geektech.btech.data.repository

import com.example.seventhmfirsthm.data.local.GadgetDao
import kg.geektech.btech.core.BaseRepository
import kg.geektech.btech.core.Resource
import kg.geektech.btech.core.gadgetDtoToNote
import kg.geektech.btech.data.network.api.GadgetApi
import kg.geektech.btech.domain.model.Gadget
import kg.geektech.btech.domain.repository.GadgetRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GadgetRepositoryImp @Inject constructor(
    private val api: GadgetApi,
    private val gadgetDao: GadgetDao,
) : GadgetRepository,BaseRepository() {
    override fun getAllGadgets(): Flow<Resource<List<Gadget>>> = doRequest {
        TODO("Not yet implemented")
    }

    override fun getDetailGadgets(id: Int): Flow<Resource<Gadget>> {
        TODO("Not yet implemented")
    }

    override fun addGadgetBasket(gadget: Gadget): Flow<Resource<Unit>> {
        TODO("Not yet implemented")
    }

    override fun deleteGadgetBasket(gadget: Gadget): Flow<Resource<Unit>> {
        TODO("Not yet implemented")
    }


}