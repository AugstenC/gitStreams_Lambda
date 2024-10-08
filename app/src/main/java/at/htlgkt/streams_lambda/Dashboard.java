package at.htlgkt.streams_lambda;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import at.htlgkt.streams_lambda.databinding.FragmentDashboardBinding;

public class Dashboard extends Fragment {

    private FragmentDashboardBinding binding;
    public Dashboard() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDashboardBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}