package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public  class secondactivity extends RecyclerView.ViewHolder{
    RecyclerView studentview;
    private RecyclerView.LayoutManager layoutManager;

    public TextView name,id,password;
    public secondactivity(View detailview)
    {
        super(detailview);
        id=detailview.findViewById(R.id.userid);
        password=detailview.findViewById(R.id.password);





    }
}
