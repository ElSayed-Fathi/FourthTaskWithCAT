package com.example.fourthtaskwithcat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {


    ListView listView;
    String mTitle[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};
    String mDescribtion[] = {"Apple", "Strawbarry", "Bananas", "Lemon", "Orange", "Mango", "Watermelon", "Pineapple", "Pear", "Carrot", "Bell Pepper", "Tomato", "Corn", "Tree", "Pine", "Palm trees"};
    int image[] = {R.drawable.m1, R.drawable.m2, R.drawable.m3, R.drawable.m4, R.drawable.m5, R.drawable.m6, R.drawable.m7, R.drawable.m8, R.drawable.m9, R.drawable.m11, R.drawable.m12, R.drawable.m13, R.drawable.m14, R.drawable.m15, R.drawable.m16, R.drawable.m17};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);

        //   linearLayout = findViewById(R.id.tt1);

        // creat adapter class
        MyAdapter adapter = new MyAdapter(this, mTitle, mDescribtion, image);
        listView.setAdapter(adapter);
        listView.setVisibility(View.GONE);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                for (int i = 0; i < mDescribtion.length; i++) {


                    if (position == i) {
                        Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("image", image[i]);
                        intent.putExtras(bundle);
                        intent.putExtra("title", mTitle[i]);
                        intent.putExtra("discribtion", mDescribtion[i]);
                        intent.putExtra("postion", i);
                        startActivity(intent);

                    }//if()

                }//for()

            }//onItemClick()
        });


    }//end of onCreat()


    public void addList(View view) {
        listView.setVisibility(View.VISIBLE);
    }//end addList()

}//end of activity