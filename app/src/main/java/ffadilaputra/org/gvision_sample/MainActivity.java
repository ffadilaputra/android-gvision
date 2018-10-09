package ffadilaputra.org.gvision_sample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView myImageView = (ImageView) findViewById(R.id.imageview);
                Emojifier emoji = new Emojifier();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inMutable = true;
//                Bitmap mBitmap = BitmapFactory.decodeResource(
//                        getApplicationContext().getResources(),
//                        R.drawable.tarnah,
//                        options
//                );
                Bitmap tempBitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(),R.drawable.tarnahh,options);
                //myImageView.setImageDrawable( new BitmapDrawable(getResources(),tempBitmap));
                myImageView.setImageBitmap(emoji.detectFaces(getApplicationContext(),tempBitmap));
            }
        });
    }
}
