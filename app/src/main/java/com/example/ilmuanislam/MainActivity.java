package com.example.ilmuanislam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.ilmuanislam.adapter.ListIlmuanAdapter;
import com.example.ilmuanislam.adapter.OnItemClickCallback;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView r_ilmuan;
    private ArrayList<Ilmuan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r_ilmuan = findViewById(R.id.r_ilmuan);

        r_ilmuan.setHasFixedSize(true);

        list.addAll(DataIlmuan.getListData());
        showRecyclerList();



    }
    private void showRecyclerList(){
        r_ilmuan.setLayoutManager(new LinearLayoutManager(this));
        ListIlmuanAdapter listIlmuanAdapter = new ListIlmuanAdapter(list);
        r_ilmuan.setAdapter(listIlmuanAdapter);

        listIlmuanAdapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Ilmuan ilmuan) {
                Intent moveIntent1 = new Intent(MainActivity.this, DetailIlmuan.class);
                moveIntent1.putExtra(DetailIlmuan.ITEM_EXTRA, ilmuan);
                startActivity(moveIntent1);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);



    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.kontak_id) {
            Intent moveIntent = new Intent(MainActivity.this, KontakActivity.class);
            startActivity(moveIntent);
        }

        return super.onOptionsItemSelected(item);
    }




}
