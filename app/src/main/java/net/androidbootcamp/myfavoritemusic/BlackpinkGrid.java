package net.androidbootcamp.myfavoritemusic;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class BlackpinkGrid extends AppCompatActivity {
    Integer[] Blackpink = {R.drawable.blackpink1, R.drawable.blackpink2, R.drawable.blackpink3, R.drawable.blackpink4};
    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blackpink_grid);
        GridView grid = (GridView)findViewById(R.id.gridView);
        final ImageView pic = (ImageView)findViewById(R.id.imgLargeBlackpink);
        grid.setAdapter(new ImageAdapter(this));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(),"Blackpink Photo " + (i+1), Toast.LENGTH_SHORT).show();
                pic.setImageResource(Blackpink[i]);
            }
        });
    }


    public class ImageAdapter extends BaseAdapter {
        private Context context;
        public ImageAdapter(Context c){
            context = c;
        }

        @Override
        public int getCount() {
            return Blackpink.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            pic = new ImageView(context);
            pic.setImageResource(Blackpink[i]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330, 300));
            return pic;
        }
    }
}
