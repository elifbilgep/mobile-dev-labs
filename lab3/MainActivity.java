package msku.ceng.madlab.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        PostAdapter adapter = new PostAdapter(this, posts);
        listView.setAdapter(adapter);


        btnPost = (Button) findViewById(R.id.btnPost); btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PostActivity.class); startActivityForResult(intent, POST_REQUEST);
            } });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) { if (requestCode == POST_REQUEST && resultCode == Activity.RESULT_OK){
        Post post = new Post(); post.setMessage(data.getCharSequenceExtra("msg").toString()); post.setImage((Bitmap) data.getParcelableExtra("bitmap")); posts.add(post);
        ((PostAdapter) listView.getAdapter()).notifyDataSetChanged();
    } }
}