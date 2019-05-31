package sg.edu.rp.c346.demotipsforexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvExamTips;
    String [] items;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips=findViewById(R.id.listViewExamTips);

        items = new String[3];
        items[0]="Item 1";
        items[1]="Item 2";
        items[2]="Item 3";

        aa= new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, items);
        lvExamTips.setAdapter(aa);


    }
}
