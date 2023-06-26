package yannick.pdm.tablayout.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import yannick.pdm.tablayout.Adapters.ViewHolderAdapter;
import yannick.pdm.tablayout.MainActivity;
import yannick.pdm.tablayout.R;
import yannick.pdm.tablayout.databinding.FragmentListagemBinding;
import yannick.pdm.tablayout.model.Constantes;
import yannick.pdm.tablayout.model.Estudante;

public class ListagemFragment extends Fragment {

    public static FragmentListagemBinding binding;
    public static ViewHolderAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getContext(), "Lista criada", Toast.LENGTH_SHORT).show();
        binding = FragmentListagemBinding.inflate(getLayoutInflater());





        binding.recycler.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ViewHolderAdapter(getContext(), Constantes.estudantes);
        binding.recycler.setAdapter(adapter);







        return binding.getRoot();
    }

}