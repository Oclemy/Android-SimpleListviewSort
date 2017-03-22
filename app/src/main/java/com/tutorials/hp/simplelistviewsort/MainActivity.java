package com.tutorials.hp.simplelistviewsort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    //VIEWS
    private ListView lv;
    private Button sortBtn;


    //DATA
    private static ArrayList<String> spacecrafts =new ArrayList<>();
    private boolean ascending = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initializeViews();
        this.fillSpacecrafts();


    }


    //INITIALIZE VIEWS
    private void initializeViews()
    {
        lv = (ListView) findViewById(R.id.lv);
        sortBtn = (Button) findViewById(R.id.sortBtn);

        sortBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sortData(ascending);
                ascending = !ascending;
            }
        });
    }


    /*
     * SORT
     */
    private void sortData(boolean asc)
    {
        //SORT ARRAY ASCENDING AND DESCENDING
        if (asc)
        {
            Collections.sort(spacecrafts);
        }
        else
        {
            Collections.reverse(spacecrafts);
        }


        lv.setAdapter(new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,spacecrafts));


    }

    /*
    FILL SPACECRAFTS DATA
     */
    private void fillSpacecrafts() {

        spacecrafts.clear();
        spacecrafts.add("Kepler");
        spacecrafts.add("Casini");
        spacecrafts.add("Voyager");
        spacecrafts.add("New Horizon");
        spacecrafts.add("James Web");
        spacecrafts.add("Apollo 15");
        spacecrafts.add("WMAP");
        spacecrafts.add("Enterprise");
        spacecrafts.add("Spitzer");
        spacecrafts.add("Galileo");
        spacecrafts.add("Challenger");
        spacecrafts.add("Atlantis");
        spacecrafts.add("Apollo 19");
        spacecrafts.add("Huygens");
        spacecrafts.add("Hubble");
        spacecrafts.add("Juno");
        spacecrafts.add("Aries");
        spacecrafts.add("Columbia");

        lv.setAdapter(new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,spacecrafts));

    }

}
