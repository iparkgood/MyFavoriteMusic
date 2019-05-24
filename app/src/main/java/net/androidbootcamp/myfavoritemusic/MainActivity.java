package net.androidbootcamp.myfavoritemusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> lstGenres;
    HashMap<String, List<String>> lstAlbums;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstGenres = new ArrayList<String>();
        lstAlbums = new HashMap<String, List<String>>();

        lstGenres.add("Hip-Hop");
        lstGenres.add("K-Pop");

        List<String> hipHop = new ArrayList<String>();
        hipHop.add("Graduation - Kanye West");
        hipHop.add("Stankonia - Outkast");

        List<String> kPop = new ArrayList<String>();
        kPop.add("Blackpink - Blackpink");
        kPop.add("Love Yourself:Tear - BTS");

        lstAlbums.put(lstGenres.get(0), hipHop);
        lstAlbums.put(lstGenres.get(1), kPop);

        final ExpandableListView expanListView = (ExpandableListView)findViewById(R.id.expanList);
        final ExpandableListAdapter listAdapter = new ExpandableListAdapter(this, lstGenres, lstAlbums);
        expanListView.setAdapter(listAdapter);

        expanListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long l) {
                return false;
            }
        });
        expanListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View view, int groupPosition, int childPosition, long id) {
                if (groupPosition==0){
                    if(childPosition==0)
                        startActivity(new Intent(MainActivity.this, Graduation.class));
                    else if (childPosition==1)
                        startActivity(new Intent(MainActivity.this, Stankonia.class));
                }
                if (groupPosition==1){
                    if (childPosition==0)
                        startActivity(new Intent(MainActivity.this, Blackpink.class));
                    else if (childPosition==1)
                        startActivity(new Intent(MainActivity.this, Loveyourself.class));
                }
                return false;
            }
        });
    }
}
