package uclv.dte.visitavirtualalauclv;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

/**
 * Created by SERGIO-PC on 14/02/2019.
 */

public class ImageDialog extends Activity {
    private ImageView mDialog;
    private WebView myBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_imagen);

        Display display = getWindowManager().getDefaultDisplay();
        int width = display.getWidth();
        int height = display.getHeight();

        Bundle bundle = getIntent().getExtras();

        mDialog = (ImageView)findViewById(R.id.your_image);
        switch (getIntent().getIntExtra("url", 0)){
            //valla
            case 1:
                //mDialog.setImageResource(R.drawable.valla);
                break;
            //escultura
            case 2:
                //mDialog.setImageResource(R.drawable.marta);
                break;
            //placa sala historia
            case 3:
                //mDialog.setImageResource(R.drawable.tarjash);
                break;
            //placa humanidades
            case 4:
                //mDialog.setImageResource(R.drawable.tarjah);
                break;
            //direcciones entrada
            case 5:
                //mDialog.setImageResource(R.drawable.direccione);
                break;
            default:
                //mDialog.setImageResource(R.drawable.valla);
                break;
        }


        mDialog.getLayoutParams().height = height;
        mDialog.getLayoutParams().width = width;
        mDialog.setClickable(true);


        //finish the activity (dismiss the image dialog) if the user clicks
        //anywhere on the image
        mDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
