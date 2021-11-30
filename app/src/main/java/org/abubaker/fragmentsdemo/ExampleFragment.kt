package org.abubaker.fragmentsdemo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ExampleFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ExampleFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    /**
     * onCreate()
     * It take cares of the parameters.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Log Entry
        Log.i("onCreate", "Method is called...")

        // arguments?.let {
        //    param1 = it.getString(ARG_PARAM1)
        //    param2 = it.getString(ARG_PARAM2)
        // }
    }


    /**
     * onCreateView()
     * Inflates Layout: fragment_example.xml file.
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Log Entry
        Log.i("onCreateView", "Method was called...")

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_example, container, false)

    }

    /**
     * onViewCreated()
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Log Entry
        Log.i("onViewCreated", "Method was called...")

    }

    // onViewStateRestored()
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        // Log Entry
        Log.i("onViewStateRestored", "Method was called...")
    }

    /**
     * onStart()
     */
    override fun onStart() {
        super.onStart()

        // Log Entry
        Log.i("onStart", "Method was called...")
    }

    /**
     * onResume()
     */
    override fun onResume() {
        super.onResume()

        // Log Entry
        Log.i("onResume", "Method was called...")
    }

    // onPause()
    override fun onPause() {
        super.onPause()

        // Log Entry
        Log.i("onPause", "Method was called...")
    }

    // onStop()
    override fun onStop() {
        super.onStop()

        // Log Entry
        Log.i("onStop", "Method was called...")
    }

    // onSaveInstanceState()
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        // Log Entry
        Log.i("onSaveInstanceState", "Method was called...")
    }

    /**
     * onDestroyView()
     */
    override fun onDestroyView() {
        super.onDestroyView()

        // Log Entry
        Log.i("onDestroyView", "Method was called...")
    }

    /**
     * onDestroy()
     */
    override fun onDestroy() {
        super.onDestroy()

        // Log Entry
        Log.i("onDestroy", "Method was called...")
    }

    /**
     * companion object
     */
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ExampleFragment.
         */

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ExampleFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}