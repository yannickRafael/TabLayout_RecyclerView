package yannick.pdm.tablayout.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import yannick.pdm.tablayout.R;
import yannick.pdm.tablayout.model.Constantes;
import yannick.pdm.tablayout.model.Estudante;
import yannick.pdm.tablayout.viewHolder.EstudanteViewHolder;

public class ViewHolderAdapter extends RecyclerView.Adapter<EstudanteViewHolder> {

    ArrayList<Estudante> estudantes;
    Context context;


    public ViewHolderAdapter(Context context, ArrayList<Estudante> estudantes){
        this.estudantes = estudantes;
        this.context = context;
    }

    @NonNull
    @Override
    public EstudanteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new EstudanteViewHolder(LayoutInflater.from(this.context).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull EstudanteViewHolder holder, int position) {

        ((TextView)(holder.itemView.findViewById(R.id.item_nome))).setText(Constantes.estudantes.get(position).getNome());
        ((TextView)(holder.itemView.findViewById(R.id.item_curso))).setText(Constantes.estudantes.get(position).getCurso());
        ((TextView)(holder.itemView.findViewById(R.id.item_idade))).setText(Constantes.estudantes.get(position).getIdade()+"");
        int index = Constantes.estudantes.get(position).getAvatar();
        index = Constantes.getID(index);
        ((ImageView)(holder.itemView.findViewById(R.id.item_avatar))).setImageResource(index);

    }

    @Override
    public int getItemCount() {
        return Constantes.estudantes.size();
    }
}
