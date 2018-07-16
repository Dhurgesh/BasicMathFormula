package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMath;
    ArrayList<Math> alMath;
    CustomAdapter caMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMath = findViewById(R.id.ListViewMath);
        alMath = new ArrayList<>();
        Math item1 = new Math("Length x Length","Area of rectangle", "Formula type is Area");
        Math item2 = new Math("(Length of base x Length)/2","Area of triangle","Formula type is Area");
        Math item3 = new Math("Length x Length x Length","Volume of cube","Formula type is Volume");

        alMath.add(item1);
        alMath.add(item2);
        alMath.add(item3);

        caMath = new CustomAdapter(this,R.layout.math_layout,alMath);
        lvMath.setAdapter(caMath);


    }
}
