package kg.geektech.btech.core

import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


abstract class BaseFragment: Fragment() {
    protected fun <T> StateFlow<UIState<T>>.subscride(
        error: (message:String) ->Unit,
        loading: ()->Unit,
        success:(data: T)->Unit
    ){
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                this@subscride.collect {
                    when (it) {
                        is UIState.Error -> {
                            error(it.error)
                        }
                        is UIState.Loading -> {
                            // TODO show progress bar
                        }
                        is UIState.Success -> {
                            success(it.data)
                        }
                    }
                }
            }
        }
    }
}