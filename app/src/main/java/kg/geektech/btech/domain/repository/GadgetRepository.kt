package kg.geektech.btech.domain.repository

import kg.geektech.btech.data.network.model.GadgetDTO

interface GadgetRepository {
    suspend fun getDetailProduct(): ArrayList<GadgetDTO>
    suspend fun getProducts(id: Int): GadgetDTO
}