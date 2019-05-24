package net.androidbootcamp.myfavoritemusic;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Stankonia extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] songs = { "1.Intro", "2.Gasoline Dreams - Outkast with Khujo Goodie", "3. I'm Cool (Interlude)",
                "4. So Fresh, So Clean", "5. Ms. Jackson", "6. Snappin' & Trappin' - OutKast with Killer Mike & J-Sweet",
                "7. D.F. (Interlude)", "8. Spaghetti Junction", "9. Kim & Cookie (Interlude)",
                "10. I'll Call B4 I Cum - Outkast with Gangsta Boo & Eco",
                "11. B.O.B.", "12. Xplosion - OutKast with B-Real", "13. Good Hair (Interlude)",
                "14. We Luv Deez Hoez - Outkast feat. Backbone and Big Gipp",
                "15. Humble Mumble - Outkast with Erykah Badu",
                "16. Drinkin' Again (Interlude)", "17. Red Velvet",
                "18. Cruisin' In The ATL (Interlude) - Southside",
                "19. Gangsta Sh*t - OutKast feat. Slimm Calhoun, C-Bone & T-Mo",
                "20. Toilet Tisha",
                "21. Slum Beautiful - Outkast feat. Cee-Lo",
                "22. Pre-Nump (Interlude)",
                "23. Stankonia (Stanklove) - Outkast feat. Big Rube and Sleepy Brown"};
        setListAdapter(new ArrayAdapter<>(this,R.layout.activity_stankonia,R.id.stankoniaList, songs));
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
