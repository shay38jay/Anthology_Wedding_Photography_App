package net.androidbootcamp.anthologyweddingphotographyapp;

import android.app.Activity;
import android.content.Intent;
import android.widget.ImageView;
import android.os.Bundle;
import android.widget.Toast;

public class OneViewActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_view);

        Intent f = getIntent();
        int position = f.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView)findViewById(R.id.OneView);
        imageView.setImageResource(imageAdapter.sPics[position]);

    }
}
