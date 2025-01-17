package com.example.mandiripanganku.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mandiripanganku.data.repositories.FamilyRepository

class FamilyViewModelFactory(
    private val familyRepository: FamilyRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FamilyViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return FamilyViewModel(familyRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}