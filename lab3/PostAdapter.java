package msku.ceng.madlab.lab3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.List;

public class PostAdapter extends BaseAdapter {
    List<Post> posts;
    private LayoutInflater inflater;
    public PostAdapter(Activity activity, List<Post> posts){
        this.posts = posts;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    Context.LAYOUT_INFLATER_SERVICE);
    public int getCount() { return posts.size();
    }
    @Override
    public Object getItem(int position) { return posts.get(position);
    }
    @Override
    public long getItemId(int position) { return position;
    }
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) { View rowView;
        rowView = inflater.inflate(R.layout.row,null);
        EditText txtMessage = (EditText) rowView.findViewById(R.id.txtMessage); TextView txtLocation = (TextView) rowView.findViewById(R.id.txtLocation); ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);
        Post post = posts.get(position); txtMessage.setText(post.getMessage()); imageView.setImageBitmap(post.getImage()); if (post.getLocation() != null) {
            txtLocation.setText(post.getLocation().getLatitude() + " " + post.getLocation().getLongitude());
        }
        return rowView; }
}
