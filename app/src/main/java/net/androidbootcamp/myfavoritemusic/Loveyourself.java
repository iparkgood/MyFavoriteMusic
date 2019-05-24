package net.androidbootcamp.myfavoritemusic;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Loveyourself extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] songs = {"1. Intro: Singularity", "2. FAKE LOVE", "3. The Truth Untold (feat. Steve Aoki)", "4. 134340",
                "5. Paradise", "6. Love Maze", "7. Magic Shop", "8. Airplane Pt.2", "9. Anpanman", "10. So What",
                "11. Outro: Tear"};
        setListAdapter(new ArrayAdapter<>(this,R.layout.activity_loveyourself,R.id.loveyourselfList, songs));
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:
                break;
            case 1:
                break;
        }
    }
}
