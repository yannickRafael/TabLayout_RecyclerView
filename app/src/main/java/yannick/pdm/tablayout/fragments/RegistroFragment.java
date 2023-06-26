package yannick.pdm.tablayout.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.List;

import yannick.pdm.tablayout.Adapters.ViewHolderAdapter;
import yannick.pdm.tablayout.model.Alerta;
import yannick.pdm.tablayout.model.Constantes;
import yannick.pdm.tablayout.model.Estudante;
import yannick.pdm.tablayout.databinding.FragmentRegistroBinding;

public class RegistroFragment extends Fragment {


    private FragmentRegistroBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentRegistroBinding.inflate(getLayoutInflater());

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, Constantes.cursos);
        binding.spinnerCursos.setAdapter(adapter);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, Constantes.avatars);
        binding.spinnerAvatar.setAdapter(adapter1);

        binding.spinnerAvatar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int index = Constantes.getID(position);
                binding.avatar.setImageResource(index);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String nome = binding.nome.getText()+"";
                    int idade = Integer.parseInt(binding.idade.getText()+"");
                    String curso = binding.spinnerCursos.getSelectedItem()+"";
                    int avatar = binding.spinnerAvatar.getSelectedItemPosition();
                    Estudante estudante = new Estudante(nome, curso, idade, avatar);
                    Constantes.estudantes.add(estudante);
                    ListagemFragment.adapter.notifyDataSetChanged();
                    binding.nome.setText(null);
                    binding.idade.setText(null);
                    Toast.makeText(getContext(), "Estudante gravado com sucesso", Toast.LENGTH_SHORT).show();

                }catch (Exception e){
                    Alerta.alertar(getContext(), "Erro", "Preencha todos os campos correctamente");
                    Log.i("Registro", e.toString());
                }

            }
        });


        return binding.getRoot();
    }
}