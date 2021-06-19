package com.example.ilmuanislam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailIlmuan extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    Button btn_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ilmuan);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDeskripsi = findViewById(R.id.tv_item_deskripsi);
        TextView tvHarga = findViewById(R.id.tv_item_harga);
        TextView tvKarya = findViewById(R.id.tv_item_karya);

        btn_share = findViewById(R.id.btn_set_share);

        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(DetailIlmuan.this, "Share", Toast.LENGTH_SHORT).show();

                String message = "Kunjungi Sosial Media saya";
                Intent sendTextIntent = new Intent(Intent.ACTION_SEND);
                sendTextIntent.setType("text/plain");
                sendTextIntent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(sendTextIntent);
            }
        });

        Ilmuan ilmuan = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (ilmuan != null) {
            Glide.with(this)
                    .load(ilmuan.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(ilmuan.getNama_ilmuan());
            tvDeskripsi.setText(ilmuan.getDetail_ilmuan());
            tvHarga.setText(ilmuan.getHarga());
            tvKarya.setText(ilmuan.getKarya());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Ilmuan");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
