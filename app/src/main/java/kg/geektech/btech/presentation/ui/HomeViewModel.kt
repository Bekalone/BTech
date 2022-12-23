package kg.geektech.btech.presentation.ui

import dagger.hilt.android.lifecycle.HiltViewModel
import kg.geektech.btech.core.BaseViewModel
import kg.geektech.btech.core.UIState
import kg.geektech.btech.domain.model.Gadget
import kg.geektech.btech.domain.use_case.DetailGadgetUseCase
import kg.geektech.btech.domain.use_case.GadgetsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val gadgetUseCase: GadgetsUseCase,
    private val detailGadgetUseCase: DetailGadgetUseCase,
) : BaseViewModel() {

    private val _getAllGadgetState = MutableStateFlow<UIState<List<Gadget>>>(UIState.Loading())
    val getAllGadgetState = _getAllGadgetState.asStateFlow()

    fun getAllNotes() {
        gadgetUseCase.getAllGadgets().getData(
            { error ->
                _getAllGadgetState.value = UIState.Error(error ?: "Unknown message")
            },
            {
                _getAllGadgetState.value = UIState.Loading()
            },
            { data ->
                if (data != null)
                    _getAllGadgetState.value = UIState.Success(data)
            })
    }
}