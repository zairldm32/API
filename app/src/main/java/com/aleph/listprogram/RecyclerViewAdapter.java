package com.aleph.listprogram;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> fotoprogram = new ArrayList<>();
    private ArrayList<String> NamaProgram = new ArrayList<>();
    private ArrayList<String> infoProgram = new ArrayList<>();
    private ArrayList<String> link = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> fotoprogram, ArrayList<String> namaProgram, ArrayList<String> infoProgram,ArrayList<String> link,Context context) {
        this.fotoprogram = fotoprogram;
        this.NamaProgram = namaProgram;
        this.infoProgram = infoProgram;
        this.link = link;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter,parent,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Glide.with(context).asBitmap().load(fotoprogram.get(position)).into(holder.imageViewFotoProgram);

        holder.textViewNamaProgram.setText(NamaProgram.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(context, NamaProgram.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context,DetailActivity2.class);

                intent.putExtra("foto program", fotoprogram.get(position));
                intent.putExtra("nama program", NamaProgram.get(position));
                intent.putExtra("info program", infoProgram.get(position));
                intent.putExtra("link", link.get(position));

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return NamaProgram.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageViewFotoProgram;
        TextView textViewNamaProgram;
        ConstraintLayout constraintLayout;
        TextView textViewLink;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoProgram = itemView.findViewById(R.id.imageViewFotoProgram);
            textViewNamaProgram = itemView.findViewById(R.id.textViewNamaProgram);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
            textViewLink = itemView.findViewById(R.id.textLink);

        }
    }
}
