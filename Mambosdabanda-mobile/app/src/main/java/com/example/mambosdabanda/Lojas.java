package com.example.mambosdabanda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mambosdabanda.adapter.ListAdapter;
import com.example.mambosdabanda.api.ApiClient;
import com.example.mambosdabanda.api.ApiInterface;
import com.example.mambosdabanda.model.Loja;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Lojas extends AppCompatActivity {

    private ListView lView;
    private ListAdapter lAdapter;
    private List<Loja> lojaItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lojas);

        lView = (ListView)findViewById(R.id.LojasListView);
        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<List<Loja>> call = apiInterface.getLojas();

        call.enqueue(new Callback<List<Loja>>() {

            @Override
            public void onResponse(Call<List<Loja>> call, Response<List<Loja>> response) {
                lojaItems = response.body();
                System.out.println("GOT::::: " + lojaItems);
                lAdapter = new ListAdapter(
                Lojas.this,
                    lojaItems
                );

                lView.setAdapter(lAdapter);
            }

            @Override
            public void onFailure(Call<List<Loja>> call, Throwable t) {
                t.printStackTrace();
            }
        });

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Loja item = lojaItems.get(position);
                Intent activity = new Intent(getBaseContext(), com.example.mambosdabanda.Loja.class);
                activity.putExtra("loja", item);
                startActivity(activity);
            }
        });

    }
}