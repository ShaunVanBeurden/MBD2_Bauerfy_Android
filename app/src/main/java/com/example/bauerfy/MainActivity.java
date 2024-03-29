package com.example.bauerfy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        //MenuItem searchItem = menu.findItem(R.id.toolbar_search);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.toolbar_home:
                return true;
            case R.id.toolbar_muziek:
                return true;
            case R.id.toolbar_favorieten:
                return true;
            case R.id.toolbar_quotes:
                Intent intent = new Intent(this, QuoteActivity.class);
                startActivity(intent);
                return true;
            case R.id.toolbar_about:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
