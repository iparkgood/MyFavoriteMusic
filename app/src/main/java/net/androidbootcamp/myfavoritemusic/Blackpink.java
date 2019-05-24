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

public class Blackpink extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] songs = {"1. Boombayah", "2. Whistle", "3. Playing with Fire", "4. Stay", "5. As If It's Your Last",
                "6. Whistle (Acoustic Ver.)"};
        setListAdapter(new ArrayAdapter<>(this,R.layout.activity_blackpink,R.id.blackpinkList, songs));
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(Blackpink.this, BlackpinkGrid.class));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/Blackpink/dp/B079BDVN2S/ref=sr_1_2?keywords=blackpink+cd&qid=1553749627&s=gateway&sr=8-2")));
                break;
        }
    }
}
