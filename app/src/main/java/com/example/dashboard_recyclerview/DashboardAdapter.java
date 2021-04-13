package com.example.dashboard_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardHolder> {

    private ArrayList<SetterGetter> listdata;

    public DashboardAdapter(ArrayList<SetterGetter> listdata){
        this.listdata       =   listdata;
    }
    @NonNull
    @Override
    public DashboardHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view                   = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dashboard,parent,false);
        DashboardHolder holder      =   new DashboardHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardHolder holder, int position) {

        final SetterGetter getData = listdata.get(position);
        String titleMenu   = getData.getTitle();
        String logoMenu    = getData.getImg();

        holder.titleMenu.setText(titleMenu);
        if (logoMenu.equals("logomenu1")){
            holder.imgMenu.setImageResource(R.drawable.whatsapp);
        }else if (logoMenu.equals("logomenu2")){
            holder.imgMenu.setImageResource(R.drawable.instagram);
        }else if (logoMenu.equals("logomenu3")){
            holder.imgMenu.setImageResource(R.drawable.facebook);
        }else if (logoMenu.equals("logomenu4")){
            holder.imgMenu.setImageResource(R.drawable.youtube);
        }else if (logoMenu.equals("logomenu5")){
            holder.imgMenu.setImageResource(R.drawable.twitter);
        }else if (logoMenu.equals("logomenu6")){
            holder.imgMenu.setImageResource(R.drawable.maps);
        }

    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class DashboardHolder extends RecyclerView.ViewHolder {

        TextView titleMenu;
        ImageView imgMenu;

        public DashboardHolder(@NonNull View itemView) {
            super(itemView);

            titleMenu           =   itemView.findViewById(R.id.tv_title_menu);
            imgMenu           =   itemView.findViewById(R.id.iv_logo_menu);

        }
    }
}
