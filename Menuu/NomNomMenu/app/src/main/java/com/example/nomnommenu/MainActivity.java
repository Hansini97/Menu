package com.example.nomnommenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    GridView gridView1;

    String[] fastfoodNames1 = {"Hawaiian_BBQ_Chicken_Pizza","Hot butter cuttlefish pizza","Tandoori Chicken Pizza","Spicy Seafood Pizza"};
    int[] fastfoodImages1 = {R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView1 = findViewById(R.id.gridview1);

        CustomAdapter customAdapter1 = new CustomAdapter();
        gridView1.setAdapter(customAdapter1);

        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),GridItem1Activity.class);
                intent.putExtra("name",fastfoodNames1[i]);
                intent.putExtra("image",fastfoodImages1[i]);
                startActivity(intent);


            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return fastfoodImages1.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = getLayoutInflater().inflate(R.layout.row_data1,null);

            TextView name1 = view2.findViewById(R.id.fastfood1);
            ImageView image1 = view2.findViewById(R.id.images1);

            name1.setText(fastfoodNames1[i]);
            image1.setImageResource(fastfoodImages1[i]);
            return view2;
        }
    }
}
