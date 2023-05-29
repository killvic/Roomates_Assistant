package com.example.housetasker


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.housetasker.Adapters.ScreenFragmentAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private lateinit var botNavMenu: BottomNavigationView
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Functionality here:
        //  - Bottom navigation bar including: Groups, Friends, Activity (history), Account
        // This bottom navigation will be present all the time during the app use

        // !!! THIS ALL IS JUST A SPLIT MOKE-UP NEED TO CREATE BY MY OWN !!!
        //  - Groups: Picking a group from a list of groups will transfer the group to the fragment
        // this "Group Fragment" has 2 screen inside one with money functionality and one with tasks functionality
        // The "money fragment": Will have a group name, balances (who owes who)
        // The "tasks fragment": Will have a task functionality (!!! Think about it later !!!)

        //  - Friends: Picking a friend from a list of friends will transfer the friend to the fragment
        // will open screen with: list of actions between friends, money owed and settle up functionality

        // - Activity (history): Will have just a list with all actions (like notifications)
        // actions will have their own screen: with group/name/amount/who paid/date/who owes how much/and comment section

        // - Account: avatar, qr code functionality, ?notifications setting?, account management



        // ----------------------------------------------------------------
        // VIEWPAGER
        val adapter = ScreenFragmentAdapter(this)
        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = adapter
        viewPager.currentItem = 0

        // ----------------------------------------------------------------
        // BOTTOM NAVIGATION MENU
        botNavMenu = findViewById(R.id.bottomNavigationView)

        botNavMenu.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.miGroups -> {
                    supportFragmentManager.beginTransaction().apply{
                        viewPager.currentItem = 0
                        addToBackStack(null)
                        commit()
                    }
                }
                R.id.miFriends -> {
                    supportFragmentManager.beginTransaction().apply{
                        viewPager.currentItem = 1
                        addToBackStack(null)
                        commit()
                    }
                }
                R.id.miActivities -> {
                    supportFragmentManager.beginTransaction().apply{
                        viewPager.currentItem = 2
                        addToBackStack(null)
                        commit()
                    }
                }
                R.id.miAccount -> {
                    supportFragmentManager.beginTransaction().apply{
                        viewPager.currentItem = 3
                        addToBackStack(null)
                        commit()
                    }
                }
            }
            true
        }
    }
}