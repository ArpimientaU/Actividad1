package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listView);

        //Crear los objetos personas
        Person andres = new Person("Andres", "11-12-1995", "male");
        Person ricardo = new Person("Ricardo", "11-12-1995", "male");
        Person cristian = new Person("Cristian", "11-12-1995", "male");
        Person david = new Person("David", "11-12-1995", "male");
        Person hilka = new Person("Hilka", "11-12-1995", "female");
        Person john = new Person("John", "11-12-1995", "male");
        Person john2 = new Person("John2", "11-12-1995", "male");
        Person john3 = new Person("John3", "11-12-1995", "male");
        Person john4 = new Person("John4", "11-12-1995", "male");
        Person john5 = new Person("John5", "11-12-1995", "male");
        Person john6 = new Person("John6", "11-12-1995", "male");
        Person john7 = new Person("John7", "11-12-1995", "male");
        Person john8 = new Person("John8", "11-12-1995", "male");
        Person john9 = new Person("John9", "11-12-1995", "male");

        //Agregar los objetos personas a un arraylist
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(andres);
        peopleList.add(ricardo);
        peopleList.add(cristian);
        peopleList.add(david);
        peopleList.add(hilka);
        peopleList.add(john);
        peopleList.add(john2);
        peopleList.add(john3);
        peopleList.add(john4);
        peopleList.add(john5);
        peopleList.add(john6);
        peopleList.add(john7);
        peopleList.add(john8);
        peopleList.add(john9);

        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de hacerse visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_SHORT).show();
        // La actividad se ha vuelto visible (ahora se "reanuda").
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_SHORT).show();
        // Enfocarse en otra actividad  (esta actividad está a punto de ser "detenida").
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();
        // La actividad ya no es visible (ahora está "detenida")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
        // La actividad está a punto de ser destruida.
    }
}