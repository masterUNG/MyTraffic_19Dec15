package appewtc.masterung.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by masterUNG on 12/20/15 AD.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private String[] title1Strings, title2Strings;
    private int[] iconInts;

    public MyAdapter(Context objContext, String[] title1Strings, String[] title2Strings, int[] iconInts) {
        this.objContext = objContext;
        this.title1Strings = title1Strings;
        this.title2Strings = title2Strings;
        this.iconInts = iconInts;
    }   // Constructor

    @Override
    public int getCount() {
        return title1Strings.length;
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

        //Open Service
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView1 = objLayoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //For TextView
        TextView title1TextView = (TextView) objView1.findViewById(R.id.txtTitle1);
        title1TextView.setText(title1Strings[i]);

        TextView title2TextView = (TextView) objView1.findViewById(R.id.txtTitle2);
        title2TextView.setText(title2Strings[i]);

        //For Image
        ImageView iconImageView = (ImageView) objView1.findViewById(R.id.imvIcon);
        iconImageView.setImageResource(iconInts[i]);

        return objView1;
    }
}   // Main Class
