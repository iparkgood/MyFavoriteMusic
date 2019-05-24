package net.androidbootcamp.myfavoritemusic;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Graduation extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] songs = {"1. Good Morning [Explicit]", "2. Champion [Explicit]", "3. Stronger [Explicit]", "4. I Wonder [Explicit]",
                "5. Good Life [feat. T-Pain] [Explicit]",
                "6. Can't Tell Me Nothing [Explicit]", "7. Barry Bonds [feat. Lil Wayne] [Explicit]",
                "8. Drunk and Hot Girls [feat. Mos Def] [Explicit]", "9. Flashing Lights [Explicit]",
                "10. Everything I Am [feat. DJ Premier] [Explicit]", "11. The Glory [Explicit]",
                "12. Homecoming [feat. Chris Martin] [Explicit]", "13. Big Brother [Explicit]"};
        setListAdapter(new ArrayAdapter<>(this,R.layout.activity_graduation,R.id.graduationList, songs));
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(Graduation.this, GraduationGrid.class));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/Graduation-Kanye-West/dp/B000RG1FMO/ref=tmm_acd_swatch_0?_encoding=UTF8&qid=1553749585&sr=8-2")));
                break;
        }
    }
}
