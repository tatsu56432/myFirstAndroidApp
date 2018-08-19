package com.example.t_nakajima.ap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView varWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] menu = getResources().getStringArray(R.array.array);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        android.R.layout.simple_list_item_1,
        menu
        );

        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(itemClickLister);

    }


    AdapterView.OnItemClickListener itemClickLister =
    new AdapterView.OnItemClickListener(){
        public void onItemClick(AdapterView <?> listView,
                                View v,
                                int position,
                                long id){
            if(position == 0){
                Intent intent = new Intent(MainActivity.this,WebActivity.class);
                startActivity(intent);
            }else if(position == 1){
                finish();
            }else if(position == 2){
                Intent intent = new Intent(MainActivity.this,LayoutActivity.class);
                startActivity(intent);
            }else{


            }
        }
    };

}
