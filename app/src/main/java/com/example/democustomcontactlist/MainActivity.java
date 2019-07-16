package com.example.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<AndroidVersion> nameList; //Ignore the AndroidVersion because i was about to rename to Contact, but just treat it as contact.
    ArrayAdapter<AndroidVersion> Version;
    ListView lvContacts;
    ArrayList<AndroidVersion> alContacts;
    CustomAdaptor ccContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContacts=findViewById(R.id.lvContact);
        alContacts=new ArrayList<>();
        AndroidVersion item1=new AndroidVersion("Mary", 65, 81234567, 'F');
        alContacts.add(item1);
        AndroidVersion item2=new AndroidVersion("Tapu", 65, 91122334, 'M');
        alContacts.add(item2);

        ccContacts=new CustomAdaptor(this, R.layout.row, alContacts);
        lvContacts.setAdapter(ccContacts);
    }

}
