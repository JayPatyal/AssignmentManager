package jaypatyal.assignmentmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        add=findViewById(R.id.addButton);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent NewAssignment = new Intent(MainActivity.this , assignmentaddition.class);
                startActivity(NewAssignment);
            }
        });
        assignmentModel values[] = new assignmentModel[1];
        values[0].setName("Name 1");
        values[0].setDescription("Description 1");
        values[0].setNotifyTime(1l);
        assignmentAdapter adapter = new assignmentAdapter(this, values);
        listView.setAdapter(adapter);
    }
}
