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
    public void showToast(String pano) {
        Toast.makeText(mContext, pano, Toast.LENGTH_SHORT).show();
    }

    @JavascriptInterface
    public void showPano(String pano) {
        sendMessage("pano", pano);
    }

    @JavascriptInterface
    public void showImagen(String imagen) {
        sendMessage("imagen", imagen);
    }

    @JavascriptInterface
    public void showInfo(String info) {
        sendMessage("info", info);
    }

    @JavascriptInterface
    public void showDialog(String pano) {
        sendMessage("", pano);
    }


    // Send an Intent with an action named "my-event".
    private void sendMessage(String type, String pano) {
        Intent intent = new Intent("my-event");
        // add data
        intent.putExtra("type", type);
        intent.putExtra("message", pano);

        LocalBroadcastManager.getInstance(mContext).sendBroadcast(intent);
    }


    /**/
    @JavascriptInterface
    public void showofGaleria(String imagen) {

        //sendMessage("imagen", imagen);
        //Toast.makeText(mContext, imagen, Toast.LENGTH_SHORT).show();
        sendMessage("galeria", imagen);

    }

}