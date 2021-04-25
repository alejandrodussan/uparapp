package uparapp.upar.uparapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registrarse(View view){
        Intent intent = new Intent(this,registro_Activity.class);
        startActivity(intent);
    }
    public void menu(View view){
        Intent intent = new Intent(this,menu_activity.class);
        startActivity(intent);
    }
}