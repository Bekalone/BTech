package kg.geektech.btech.data.network.model

import androidx.room.Entity

@Entity(tableName = "gadget")
data class GadgetDTO(
    val image: String? = null, // http://164.92.190.147:8006/media/media/%D0%A7%D1%82%D0%BE-%D1%82%D0%B0%D0%BA%D0%BE%D0%B5-%D1%84%D0%BE%D1%82%D0%BE.jpeg
    val price: Int? = null, // 45000
    val subtext: String? = null, // рассрочка от 489с./ месяц
    val title: String? = null // Samsung Galaxy A 52 5G (EU)
)