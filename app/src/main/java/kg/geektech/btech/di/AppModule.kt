package kg.geektech.btech.di

import android.content.Context
import androidx.room.Room
import com.example.seventhmfirsthm.data.local.GadgetDao
import com.example.seventhmfirsthm.data.local.GadgetDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kg.geektech.btech.BuildConfig
import kg.geektech.btech.data.network.api.GadgetApi
import kg.geektech.btech.data.repository.GadgetRepositoryImp
import kg.geektech.btech.domain.repository.GadgetRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideGadgetApi():GadgetApi{
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GadgetApi::class.java)
    }
    @Provides
    @Singleton
    fun provideGadgetRepository(api:GadgetApi):GadgetRepository{
        return GadgetRepositoryImp(api)
    }

    @Singleton
    @Provides
    fun provideGadgetDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, GadgetDatabase::class.java, "gadget_db").allowMainThreadQueries()
            .build()

    @Singleton
    @Provides
    fun provideGadgetDao(gadgetDatabase: GadgetDatabase) = gadgetDatabase.noteDao()

    /*@Provides
    fun provideGadgetRepository(gadgetDao: GadgetDao): GadgetRepository {
        return GadgetRepositoryImp(gadgetDao)
    }*/
}
