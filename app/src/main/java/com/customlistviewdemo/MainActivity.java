package com.customlistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String item[]={"Java1","Java2","Java3","Java4","Java5","Java6","Java7","Java8","Java9","Java10",};
    int image[]={R.drawable.java_icon,R.drawable.java_icon,R.drawable.java_icon,R.drawable.java_icon,R.drawable.java_icon,R.drawable.java_icon,R.drawable.java_icon,R.drawable.java_icon,R.drawable.java_icon,R.drawable.java_icon,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listview);
        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),item,image);
        listView.setAdapter(customAdapter);
    }
}
