import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import co.edu.udea.compumovil.gr01_20201.lab2.R



class POIDetailFragment : Fragment() {


    companion object {

        fun newInstance(): POIDetailFragment {
            return POIDetailFragment()
        }
    }


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_p_o_i_detail, container, false)
    }

}