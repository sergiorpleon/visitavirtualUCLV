package uclv.dte.visitavirtualalauclv;

import android.accounts.AccountManager;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

/**
 * Created by SERGIO-PC on 08/02/2019.
 */

public class Intermediario {
    MainActivity mContext;
    Intermediario(MainActivity c) {
        mContext = c;
    }

    @JavascriptInterface
    public void showPano(String pano) {


        //Puente.a.cambiarpano(pano);

            Intent intent = new Intent(mContext, MainActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("pano", pano);
            intent.putExtras(bundle);
            mContext.startActivity(intent);



/*
        WebView myBrowser = (WebView)((Activity)mContext).findViewById(R.id.mybrowser);

        //activamos javascript
        WebSettings settings = myBrowser.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);

        myBrowser.loadUrl("file:///android_asset/"+pano+".html");

        myBrowser.addJavascriptInterface(new Intermediario(mContext), "Android");
        */
    }

    @JavascriptInterface
    public void showToast(String pano) {
        Toast.makeText(mContext, pano, Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public void showDialog(String pano) {
        /*
        //Creacion del Dialogo
        AlertDialog.Builder builder = new AlertDialog.Builder(mContext);

        //inflando el contenido con un layout;
        LayoutInflater inflater = mContext.getLayoutInflater();
        View layout = inflater.inflate(R.layout.layout_imagen,(ViewGroup) mContext.findViewById(R.id.lytLayout));
        builder.setView(layout);

        builder.setPositiveButton("REGRESAR", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        return builder.create();
        */

        sendMessage(pano);
    }








    // Send an Intent with an action named "my-event".
    private void sendMessage(String pano) {
        Intent intent = new Intent("my-event");
        // add data
        intent.putExtra("message", pano);
        LocalBroadcastManager.getInstance(mContext).sendBroadcast(intent);
    }
}