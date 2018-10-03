package bogdanski_e5c1s1.odrobienie_projektu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Odrobienie extends AppCompatActivity {

    public List<Numbers> lista = new ArrayList<>();
    private ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odrobienie);

        //Lista jest tworzona tutaj

        for(int i=0; i<10;i++)
        {
            Random rand = new Random();
            int value = rand.nextInt(14)+2;

            Numbers numbers = new Numbers();
            numbers.randomnum = Integer.toString(value);
            numbers.counter=Integer.toString(i+1);
            lista.add(numbers);

        }

        //Pomiędzy tymi komentarzami

        RecyclerView recyclerView = findViewById(R.id.recycler);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new ListAdapter(lista);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}