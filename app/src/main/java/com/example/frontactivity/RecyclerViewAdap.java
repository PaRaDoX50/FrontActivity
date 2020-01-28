package com.example.frontactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdap extends RecyclerView.Adapter<RecyclerViewAdap.CardViewHolder> {
    private ArrayList<CardViewStruct> mInfo;
    private Context mContext;

    public RecyclerViewAdap(Context context, ArrayList<CardViewStruct> info){
        mInfo = info;
        mContext = context;
    }
    @NonNull
    @Override
    public RecyclerViewAdap.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.card_view, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdap.CardViewHolder holder, int position) {
        CardViewStruct cardViewStruct = mInfo.get(position);
        holder.text1.setText(cardViewStruct.getText1());
        holder.text2.setText(cardViewStruct.getText2());
        holder.text3.setText(cardViewStruct.getText3());
    }

    @Override
    public int getItemCount() {
        return mInfo.size();
    }
    class CardViewHolder extends RecyclerView.ViewHolder{
        public TextView text1;
        public TextView text2;
        public TextView text3;

        public CardViewHolder(View view){
            super(view);
            text1 = (TextView) view.findViewById(R.id.text1);
            text2 = (TextView) view.findViewById(R.id.text2);
            text3 = (TextView) view.findViewById(R.id.text3);
        }

    }
}
