package np.com.nva

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation
import np.com.nva.fragments.HomeFragment
import np.com.nva.fragments.ReportFragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var navigation = findViewById<MeowBottomNavigation>(R.id.navigation)
        navigation.add(MeowBottomNavigation.Model(0, R.drawable.ic_home))
        navigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_map))
        navigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_message))

        navigation.show(1, true)

        navigation.setOnClickMenuListener {
            when (it.id) {
                0 -> {
                    replaceFragment(HomeFragment())

                }
                1 -> {
                    replaceFragment(np.com.nva.fragments.MapFragment())
                }
                2 -> {
                    replaceFragment(ReportFragment())
                }
            }
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentContainer = supportFragmentManager.beginTransaction()
        fragmentContainer.replace(R.id.fragmentContainer, fragment)
        fragmentContainer.commit()
    }

}