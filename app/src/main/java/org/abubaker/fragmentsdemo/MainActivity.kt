package org.abubaker.fragmentsdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {

            supportFragmentManager.commit {

                // Allow Reordering
                setReorderingAllowed(true)

                // Select the Fragment file to be inflated
                add<ExampleFragment>(R.id.fragment_container_view)

            }

        }

    }
}