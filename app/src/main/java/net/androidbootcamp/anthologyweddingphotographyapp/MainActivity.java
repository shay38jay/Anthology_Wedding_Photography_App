package net.androidbootcamp.anthologyweddingphotographyapp;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView thegrid = (GridView) findViewById(R.id.thegrid);
        thegrid.setAdapter(new ImageAdapter(this));


        thegrid.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){
                Toast.makeText(getBaseContext(), "Anthology Wedding Photo"  + (position + 1), Toast.LENGTH_LONG).show();
                Intent f = new Intent(getApplicationContext(), OneViewActivity.class);
                f.putExtra("id", position);
                startActivity(f);
            }
        });
    }
}





