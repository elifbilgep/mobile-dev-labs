package msku.ceng.madlab.lab3;

import android.graphics.Bitmap;
import android.location.Location;

public class Post {
    private Bitmap image;
    private Location location;
    private String message;

    public Bitmap getImage() { return image;
    }
    public void setImage(Bitmap image) { this.image = image;
    }
    public Location getLocation() { return location;
    }
    public void setLocation(Location location) { this.location = location;
    }
    public String getMessage() { return message;
    }
    public void setMessage(String message) { this.message = message;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) { if (requestCode == CAPTURE_IMAGE && resultCode == Activity.RESULT_OK){
        Bundle bundle = data.getExtras();
        Bitmap image = (Bitmap) bundle.get("data"); img.setImageBitmap(image);
    } }


    txtMsg = (EditText)findViewById(R.id.txtMessage); btnOk = (ImageButton) findViewById(R.id.btnOk); btnOk.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putCharSequence("msg",txtMsg.getText()); bundle.putParcelable("bitmap",((BitmapDrawable)img.getDrawable()).getBitmap()); intent.putExtras(bundle);
            setResult(Activity.RESULT_OK,intent);
            finish(); }
    });
    btnCancel = (ImageButton) findViewById(R.id.btnCancel); btnCancel.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) { setResult(Activity.RESULT_CANCELED); finish();

        } });
}
