package si.uni_lj.fri.pbd.miniapp1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import si.uni_lj.fri.pbd.miniapp1.R;

public class HomeFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Just inflate the view from xml.
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }
}
