package com.darkmatter.greatpay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SummaryRecievedAdapter extends RecyclerView.Adapter<SummaryRecievedAdapter.MySViewHolder>{

    private Context mcontext;
    private List<SummaryModel> mData;


    public SummaryRecievedAdapter(Context mcontext, List<SummaryModel> mData) {
        this.mcontext = mcontext;
        this.mData = mData;


    }


    @NonNull
    @Override
    public SummaryRecievedAdapter.MySViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater=LayoutInflater.from(mcontext);
        view=inflater.inflate(R.layout.custom_summary_item,parent,false);
        return new MySViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SummaryRecievedAdapter.MySViewHolder holder, int position) {

        holder.tvUsername.setText(""+mData.get(position).getName());
        holder.tvMoney.setText(""+mData.get(position).getAmount());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MySViewHolder extends RecyclerView.ViewHolder {

        TextView tvUsername, tvMoney;

        public MySViewHolder(@NonNull View itemView) {
            super(itemView);

            tvUsername=itemView.findViewById(R.id.name_summary);
            tvMoney=itemView.findViewById(R.id.money_summary);
        }

    }
}