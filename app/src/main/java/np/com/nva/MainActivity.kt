package np.com.nva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation

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
                    Toast.makeText(this@MainActivity, "Home Clicked", Toast.LENGTH_LONG).show()
                }
                1 -> {
                    Toast.makeText(this@MainActivity, "Map Clicked", Toast.LENGTH_LONG).show()
                }
                2 -> {
                    Toast.makeText(this@MainActivity, "Message Clicked", Toast.LENGTH_LONG).show()
                }
            }
        }


    }


}