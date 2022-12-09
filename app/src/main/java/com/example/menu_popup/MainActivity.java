package com.example.menu_popup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public Button mbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbutton = findViewById(R.id.mbutton);
    }

    public void click(View view) {
        PopupMenu popup = new PopupMenu(MainActivity.this, mbutton);

        popup.getMenuInflater().inflate(
                R.menu.menu, popup.getMenu());

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.action_fav:
                        Toast.makeText(getApplicationContext(), "Favoritos", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.action_set:
                        Toast.makeText(getApplicationContext(), "Settings", Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return true;
                }


            }
        });
        popup.show();
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        return false;
    }
}