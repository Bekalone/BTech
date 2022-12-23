package kg.geektech.btech.core


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

abstract class BaseViewModel: ViewModel() {
    protected fun <T> Flow<Resource<T>>.getData(
        error: (message: String?) -> Unit,
        loading:() ->Unit,
        success: (data: T?) -> Unit
    ){
        viewModelScope.launch {
            this@getData.collect {
                when (it) {
                    is Resource.Loading -> {
                        loading()
                    }
                    is Resource.Success -> {
                        success(it.data)
                    }
                    is Resource.Error ->{
                        error(it.message)
                    }
                }
            }
        }
    }
}