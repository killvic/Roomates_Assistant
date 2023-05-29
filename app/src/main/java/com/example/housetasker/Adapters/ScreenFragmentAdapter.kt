package com.example.housetasker.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.housetasker.Account.AccountSettings
import com.example.housetasker.Activities.ActivitiesHistory
import com.example.housetasker.Friends.FriendsFragment
import com.example.housetasker.Groups.FinanceAssistance

class ScreenFragmentAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
             0 -> FinanceAssistance()
             1 -> FriendsFragment()
             2 -> ActivitiesHistory()
             3 -> AccountSettings()
            else -> throw IllegalArgumentException("Invalid view pager position: $position")
        }
    }
}