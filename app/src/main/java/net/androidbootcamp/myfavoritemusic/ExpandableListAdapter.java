package net.androidbootcamp.myfavoritemusic;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by louis on 3/26/2019.
 */

public class ExpandableListAdapter extends BaseExpandableListAdapter {
    private Context context;
    private List<String> lstGenres;
    private HashMap<String, List<String>> lstAlbums;

    public ExpandableListAdapter(Context context, List<String> lstGenres, HashMap<String, List<String>> lstAlbums){
        this.context = context;
        this.lstGenres = lstGenres;
        this.lstAlbums = lstAlbums;
    }
    @Override
    public int getGroupCount() {
        return this.lstGenres.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return this.lstAlbums.get(this.lstGenres.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return this.lstGenres.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return this.lstAlbums.get(this.lstGenres.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return 0;
    }

    @Override
    public long getChildId(int i, int i1) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String headerTitle = (String)getGroup(i);
        if (view == null){
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_genres, null);
        }
        TextView genres = (TextView)view.findViewById(R.id.genres);
        genres.setTypeface(null, Typeface.BOLD);
        genres.setText(headerTitle);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        final String childText = (String)getChild(i, i1);
        if (view == null){
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_albums, null);
        }
        TextView albums = (TextView)view.findViewById(R.id.albums);
        albums.setText(childText);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
