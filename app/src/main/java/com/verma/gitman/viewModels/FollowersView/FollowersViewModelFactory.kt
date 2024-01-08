package com.verma.gitman.viewModels.FollowersView

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.verma.gitman.repository.GithubRepo

class FollowersViewModelFactory(private val repo: GithubRepo) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return FollowersViewModel(repo) as T
    }
}