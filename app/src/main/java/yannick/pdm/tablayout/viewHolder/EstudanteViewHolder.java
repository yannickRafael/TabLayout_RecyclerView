package yannick.pdm.tablayout.viewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import yannick.pdm.tablayout.R;

public class EstudanteViewHolder extends RecyclerView.ViewHolder {

     TextView evhnome, evhidade, evhcurso;
     ImageView evhavatar;


    public EstudanteViewHolder(@NonNull View itemView) {
        super(itemView);
        evhnome = itemView.findViewById(R.id.item_nome);
        evhidade = itemView.findViewById(R.id.item_idade);
        evhcurso = itemView.findViewById(R.id.item_curso);
        evhavatar = itemView.findViewById(R.id.item_avatar);
    }
}
