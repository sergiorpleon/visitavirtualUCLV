package uclv.dte.visitavirtualalauclv;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AlertDialog;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Locale;

import static java.util.Locale.forLanguageTag;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Dialog dialogo1 = null;

    WebView myBrowser;
    String lenguage ="es";
    String current ="entrada";
    String last ="entrada";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Configuration config = new Configuration(getResources().getConfiguration());
        lenguage = config.locale.getLanguage();

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
        //});

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        myBrowser = (WebView)findViewById(R.id.mybrowser);

        //activamos javascript
        WebSettings settings = myBrowser.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);

        Bundle bundle = getIntent().getExtras();

        if(bundle == null){
            myBrowser.loadUrl("file:///android_asset/entrada_"+lenguage+".html");
        }else{
            String page = bundle.getString("pano","entrada");
            Toast.makeText(this,page, Toast.LENGTH_SHORT).show();
            myBrowser.loadUrl("file:///android_asset/"+page+"_"+lenguage+".html");

        }


        myBrowser.addJavascriptInterface(new Intermediario(this), "Android");
        //myBrowser.setWebViewClient(new AppWebClient());

        //myBrowser.setWebViewClient(new WebViewClient(){
        //    public void onPageFinished(WebView view, String url){
        //        myBrowser.loadUrl("javascript:init('" + "Sergio" + "')");
        //    }
        //});
        //Puente.a = this;
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            switch (current){
                case "mapa1":
                case "mapa2":
                case "mapa3":
                case "mapa4":
                case "mapa5":
                case "mapa6":
                case "mapa7":
                case "mapa8":
                case "mapa9":
                case "mapa10":
                case "mapa11":
                case "mapa12":
                case "mapa13":
                case "mapa14":
                case "mapa15":
                case "mapa16":
                case "mapa17":
                case "mapa18":
                case "mapa19":
                case "mapa20":
                case "mapa21":
                        myBrowser.loadUrl("file:///android_asset/"+last+"_"+lenguage+".html");
                    break;
                case "galeria":
                    myBrowser.loadUrl("file:///android_asset/"+last+"_"+lenguage+".html");
                    break;
                case "comedor-int":
                    myBrowser.loadUrl("file:///android_asset/comedor-cruce_"+lenguage+".html");
                    current = "comedor-cruce";
                    break;
                case "electrica-int":
                    myBrowser.loadUrl("file:///android_asset/biblioteca-cruce_"+lenguage+".html");
                    current = "biblioteca-cruce";
                    break;
                case "biblioteca-int":
                    myBrowser.loadUrl("file:///android_asset/biblioteca-cruce_"+lenguage+".html");
                    current = "biblioteca-cruce";
                    break;
                case "economia-int":
                    myBrowser.loadUrl("file:///android_asset/biblioteca-cruce_"+lenguage+".html");
                    current = "biblioteca-cruce";
                    break;
                case "agropecuaria-int":
                    myBrowser.loadUrl("file:///android_asset/agropecuaria-cruce_"+lenguage+".html");
                    current = "agropecuaria-cruce";
                    break;
                case "contruccion-int":
                    myBrowser.loadUrl("file:///android_asset/construccion-cruce_"+lenguage+".html");
                    current = "construccion-cruce";
                    break;
                case "humanidades-int":
                    myBrowser.loadUrl("file:///android_asset/rectorado_"+lenguage+".html");
                    current = "rectorado";
                    break;
                case "mfc-int":
                    myBrowser.loadUrl("file:///android_asset/mfc-cruce_"+lenguage+".html");
                    current = "mfc-cruce";
                    break;
                case "jardin":
                    myBrowser.loadUrl("file:///android_asset/comedor-cruce_"+lenguage+".html");
                    current = "comedor-cruce";
                    break;
                case "mecanica-int":
                    myBrowser.loadUrl("file:///android_asset/humanidades-cruce_"+lenguage+".html");
                    current = "humanidades-cruce";
                    break;
                case "salahistoria":
                    myBrowser.loadUrl("file:///android_asset/entrada_"+lenguage+".html");
                    current = "entrada";
                    break;
                case "jardin2":
                case "jardin4":
                    myBrowser.loadUrl("file:///android_asset/jardin_"+lenguage+".html");
                    current = "jardin";
                    break;
                case "salahistoria1":
                case "salahistoria2":
                case "salahistoria3":
                    myBrowser.loadUrl("file:///android_asset/salahistoria_"+lenguage+".html");
                    current = "salahistoria";
                    break;
                default:
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
                    dialogo1.setTitle(getString(R.string.btn_title));
                    dialogo1.setMessage(getString(R.string.btn_text_salir));
                    dialogo1.setCancelable(false);
                    dialogo1.setNegativeButton(getString(R.string.btn_cancelar), new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                        }
                    });
                    dialogo1.setPositiveButton(getString(R.string.btn_salir), new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            salir();
                        }
                    });
                    dialogo1.show();
                    break;
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            crearDialogoAlerta();
            return true;
        }
        if (id == R.id.action_lenguage) {
            crearDialogoIdioma();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        current = "";
        if (id == R.id.nav_visita) {
            // Handle the camera action
            myBrowser.loadUrl("file:///android_asset/entrada_"+lenguage+".html");
        } else if (id == R.id.nav_agropecuaria) {
            //Intent infoagro = new Intent(this, FCAActivity.class);
            //startActivity(infoagro);
            myBrowser.loadUrl("file:///android_asset/agropecuaria-int_"+lenguage+".html");
        } else if (id == R.id.nav_computacion) {
            //Intent infomfc = new Intent(this, FMFCActivity.class);
            //startActivity(infomfc);
            myBrowser.loadUrl("file:///android_asset/mfc-int_"+lenguage+".html");
        } else if (id == R.id.nav_construccion) {
            //Intent infocon = new Intent(this, FCActivity.class);
            //startActivity(infocon);
            myBrowser.loadUrl("file:///android_asset/construccion-int_"+lenguage+".html");
        } else if (id == R.id.nav_economia) {
            //Intent infoeco = new Intent(this, FCEActivity.class);
            //startActivity(infoeco);
            myBrowser.loadUrl("file:///android_asset/economia-int_"+lenguage+".html");
        } else if (id == R.id.nav_electrica) {
            //Intent infoelec = new Intent(this, FIEActivity.class);
            //startActivity(infoelec);
            myBrowser.loadUrl("file:///android_asset/electrica-int_"+lenguage+".html");
        }else if (id == R.id.nav_farmacia) {
            //Intent infofar = new Intent(this, FQFActivity.class);
            //startActivity(infofar);
            myBrowser.loadUrl("file:///android_asset/mecanica-int_"+lenguage+".html");
        }else if (id == R.id.nav_humanidades) {
            //Intent infohum = new Intent(this, FHActivity.class);
            //startActivity(infohum);
            myBrowser.loadUrl("file:///android_asset/humanidades-int_"+lenguage+".html");
        }else if (id == R.id.nav_galeria) {
            //Intent infohum = new Intent(this, FHActivity.class);
            //startActivity(infohum);
            current = "galeria";
            myBrowser.loadUrl("file:///android_asset/galeria_"+lenguage+".html");
        }

        /*
        else if (id == R.id.nav_mecanica) {
            //Intent infomec = new Intent(this, FIMIActivity.class);
            //startActivity(infomec);
        }else if (id == R.id.nav_sociales) {
            //Intent infosoc = new Intent(this, FCSActivity.class);
            //startActivity(infosoc);
            myBrowser.loadUrl("file:///android_asset/entrada.html");
        }
        */

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onResume() {
        super.onResume();

        // Register mMessageReceiver to receive messages.
        LocalBroadcastManager.getInstance(this).registerReceiver(mMessageReceiver,
                new IntentFilter("my-event"));
    }

    @Override
    protected void onPause() {
        // Unregister since the activity is not visible
        LocalBroadcastManager.getInstance(this).unregisterReceiver(mMessageReceiver);
        super.onPause();
    }

    // handler for received Intents for the "my-event" event
    private BroadcastReceiver mMessageReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            // Extract data included in the Intent
            String type = intent.getStringExtra("type");
            String message = intent.getStringExtra("message");
            switch (type){
                case "pano":
                    current = message;
                    switch (message){
                        case "back":
                            myBrowser.loadUrl("file:///android_asset/"+last+"_"+lenguage+".html");
                            current = last;
                            break;
                        case "mapa1":
                        case "mapa2":
                        case "mapa3":
                        case "mapa4":
                        case "mapa5":
                        case "mapa6":
                        case "mapa7":
                        case "mapa8":
                        case "mapa9":
                        case "mapa10":
                        case "mapa11":
                        case "mapa12":
                        case "mapa13":
                        case "mapa14":
                        case "mapa15":
                        case "mapa16":
                        case "mapa17":
                        case "mapa18":
                        case "mapa19":
                        case "mapa20":
                        case "mapa21":
                            String num = message.split("pa")[1];
                            //myBrowser.loadUrl("file:///android_asset/"+message+"_"+lenguage+".html");
                            myBrowser.loadUrl("file:///android_asset/mapa_"+lenguage+".html#"+num);
                            break;

                        default:
                            last = message;
                            myBrowser.loadUrl("file:///android_asset/"+message+"_"+lenguage+".html");
                            break;
                    }
                    String texttoast = "";
                    switch (current){
                        case "agropecuaria-cruce":
                            texttoast = getString(R.string.title_toast_agropecuaria_ext);
                            break;
                        case "agropecuaria-int":
                            texttoast = getString(R.string.title_toast_fca);
                            break;
                        case "biblioteca-cruce":
                            texttoast = getString(R.string.title_toast_biblioteca_ext);
                            break;
                        case "biblioteca-int":
                            texttoast = getString(R.string.title_toast_biblioteca_int);
                            break;
                        case "comedor-cruce":
                            texttoast = getString(R.string.title_toast_comedor_cruce);
                            break;
                        case "comedor-ext":
                            texttoast = getString(R.string.title_toast_comedor_ext);
                            break;
                        case "comedor-int":
                            texttoast = getString(R.string.title_toast_comedor_int);
                            break;
                        case "construccion-cruce":
                            texttoast = getString(R.string.title_toast_construccion_ext);
                            break;
                        case "contruccion-int":
                            texttoast = getString(R.string.title_toast_fc);
                            break;
                        case "economia-int":
                            texttoast = getString(R.string.title_toast_fce);
                            break;
                        case "electrica-int":
                            texttoast = getString(R.string.title_toast_fie);
                            break;
                        case "entrada":
                            texttoast = getString(R.string.title_toast_entrada);
                            break;
                        case "humanidades-ext":
                            texttoast = getString(R.string.title_toast_humanidades_ext);
                            break;
                        case "humanidades-int":
                            texttoast = getString(R.string.title_toast_fhcs);
                            break;
                        case "jardin":
                            texttoast = getString(R.string.title_toast_jardin);
                            break;
                        case "mfc-int":
                            texttoast = getString(R.string.title_toast_fmfc);
                            break;
                        case "mecanica-int":
                            texttoast = getString(R.string.title_toast_fimifq);
                            break;
                        case "mfc-cruce":
                            texttoast = getString(R.string.title_toast_mfc_ext);
                            break;
                        case "rectorado":
                            texttoast = getString(R.string.title_toast_rectorado);
                            break;
                        case "salahistoria":
                            texttoast = getString(R.string.title_toast_salahistoria);
                            break;
                        case "teatro-cruce":
                            texttoast = getString(R.string.title_toast_teatro);
                            break;


                    }
                    if(texttoast.equalsIgnoreCase("")){

                    }else{
                        Toast.makeText(context, texttoast, Toast.LENGTH_SHORT).show();
                    }

                    break;
                case "imagen":
                    //Intent i = new Intent(context, ImageDialog.class);
                    switch (message) {
                        case "areasdeportivas":
                            crearDialogoSlider(getString(R.string.title_dialog_areas_dep), "areasdeportivas");
                            break;
                        case "becas900":
                            crearDialogoSlider(getString(R.string.title_dialog_res_est_900), "becas900");
                            break;
                        case "becasc":
                            crearDialogoSlider(getString(R.string.title_dialog_res_est_camilito), "becasc");
                            break;
                        case "becasu":
                            crearDialogoSlider(getString(R.string.title_dialog_res_est_u), "becasu");
                            break;
                        case "boladecannon":
                            crearDialogoSlider("", "jardinarbolbolacannon");
                            break;
                        case "cartel":
                            //     i.putExtra("url", 1);
                            crearDialogoSlider("", "ent_valla");
                            break;
                        case "ceed":
                            crearDialogoSlider(getString(R.string.title_dialog_cent_est_educ), "ceed");
                            break;
                        case "ceiba":
                            crearDialogoSlider("", "jardinceiba");
                            break;
                        case "centralito":
                            crearDialogoSlider(getString(R.string.title_dialog_centralito), "centralito");
                            break;
                        case "comedorcamilito":
                            crearDialogoSlider(getString(R.string.title_dialog_comedor_camilito), "comedorcamilito");
                            break;
                        case "comunicacion":
                            crearDialogoSlider(getString(R.string.title_dialog_comunicacion), "comunicacion");
                            break;
                        case "coronado":
                            crearDialogoSlider(getString(R.string.title_dialog_coronado), "coronado");
                            break;
                        case "direccione":
                            //     i.putExtra("url", 1);
                            crearDialogoSlider("", "ent_direccione");
                            break;
                        case "feu":
                            //i.putExtra("url", 5);
                            crearDialogoSlider(getString(R.string.title_dialog_casafeu), "casafeu");
                            break;
                        case "florbrasilenna":
                            crearDialogoSlider("", "jardinflorbrasilenna");
                            break;
                        case "florguinea":
                            crearDialogoSlider("", "jardinflorguinea");
                            break;
                        case "hotelito":
                            crearDialogoSlider(getString(R.string.title_dialog_hotelito), "hotelito");
                            break;
                        case "ingreso":
                            crearDialogoSlider(getString(R.string.title_dialog_ingreso), "ingreso");
                            break;
                        case "jardinbambu":
                            crearDialogoSlider(getString(R.string.title_dialog_jardinbambu), "jardinbambu");
                            break;
                        case "jardincartel":
                            crearDialogoSlider("", "jardincartel");
                            break;
                        case "marta":
                            //   i.putExtra("url", 2);
                            crearDialogoSlider("", "ecultura_marta");
                            break;
                        case "muralh":
                            //i.putExtra("url", 4);
                            crearDialogoSlider("", "human_mural");
                            break;
                        case "panaderia":
                            crearDialogoSlider(getString(R.string.title_dialog_panaderia), "panaderia");
                            break;
                        case "elect_paneles":
                            //i.putExtra("url", 4);
                            crearDialogoSlider(getString(R.string.title_dialog_paneles), "elect_paneles");
                            break;
                        case "pisoh":
                            //i.putExtra("url", 4);
                            crearDialogoSlider("", "human_piso");
                            break;
                        case "policlinico":
                            crearDialogoSlider(getString(R.string.title_dialog_policlinico), "policlinico");
                            break;
                        case "rectorado":
                            crearDialogoSlider(getString(R.string.title_dialog_rectorado), "rectorado");
                            break;
                        case "rechum":
                            crearDialogoSlider(getString(R.string.title_dialog_rec_hum), "recursoshumanos");
                            break;
                        case "relint":
                            crearDialogoSlider(getString(R.string.title_dialog_rel_int), "rel_internacionales");
                            break;
                        case "salahist_placa":
                            crearDialogoSlider("", "salahist_placa");
                            break;
                        case "salahistoria":
                            crearDialogoSlider(getString(R.string.title_dialog_sala_hist), "salahistoria");
                            break;
                        case "salchicha":
                            crearDialogoSlider("", "jardinarbolsalchicha");
                            break;
                        case "tarjah":
                            //i.putExtra("url", 4);
                            crearDialogoSlider("", "human_placa");
                            break;
                        case "tarjash":
                            // i.putExtra("url", 3);
                            crearDialogoSlider("", "sala_historia");
                            break;
                        case "teatro":
                            crearDialogoSlider(getString(R.string.title_dialog_teatro_univ), "teatro");
                            break;
                        case "transporte":
                            crearDialogoSlider(getString(R.string.title_dialog_transporte), "transporte");
                            break;
                        case "trepadora":
                            crearDialogoSlider("", "jardintrepadora");
                            break;

                        default:
                            //i.putExtra("url", 1);
                            break;
                    }
                    //startActivity(i);
                    break;
                case "slider":
                    //crearDialogoSlider();
                    break;
                case "info":

                    switch (message) {
                        case "agropecuaria":
                            Intent infoagro = new Intent(context, FCAActivity.class);
                            startActivity(infoagro);
                            break;
                        case "cbq":
                            Intent infocbq = new Intent(context, CBQActivity.class);
                            startActivity(infocbq);
                            break;
                        case "cec":
                            Intent infocec = new Intent(context, CECActivity.class);
                            startActivity(infocec);
                            break;
                        case "ced":
                            Intent infoced = new Intent(context, CEDActivity.class);
                            startActivity(infoced);
                            break;
                        case "cee":
                            Intent infocee = new Intent(context, CEEActivity.class);
                            startActivity(infocee);
                            break;
                        case "ceqa":
                            Intent infoceqa = new Intent(context, CEQAActivity.class);
                            startActivity(infoceqa);
                            break;
                        case "ceta":
                            Intent infoceta = new Intent(context, CETAActivity.class);
                            startActivity(infoceta);
                            break;
                        case "ciap":
                            Intent infociap = new Intent(context, CIAPActivity.class);
                            startActivity(infociap);
                            break;
                        case "cidema":
                            Intent infocidema = new Intent(context, CIDEMActivity.class);
                            startActivity(infocidema);
                            break;
                        case "cis":
                            Intent infocis = new Intent(context, CISActivity.class);
                            startActivity(infocis);
                            break;
                        case "ibp":
                            Intent infoibp = new Intent(context, IBPActivity.class);
                            startActivity(infoibp);
                            break;
                        case "cei":
                            Intent infocei = new Intent(context, CEIActivity.class);
                            startActivity(infocei);
                            break;
                        case "construccion":
                            Intent infocon = new Intent(context, FCActivity.class);
                            startActivity(infocon);
                            break;
                        case "economia":
                            Intent infoeco = new Intent(context, FCEActivity.class);
                            startActivity(infoeco);
                            break;
                        case "electrica":
                            Intent infoelec = new Intent(context, FIEActivity.class);
                            startActivity(infoelec);
                            break;
                        case "farmacia":
                            Intent infofar = new Intent(context, FQFActivity.class);
                            startActivity(infofar);
                            break;
                        case "humanidades":
                            Intent infohum = new Intent(context, FHActivity.class);
                            startActivity(infohum);
                            break;
                        case "jardin":
                            Intent infojardin = new Intent(context, JardinActivity.class);
                            startActivity(infojardin);
                            break;
                        case "mecanica":
                            Intent infomec = new Intent(context, FIMIActivity.class);
                            startActivity(infomec);
                            break;
                        case "mfc":
                            Intent infomfc = new Intent(context, FMFCActivity.class);
                            startActivity(infomfc);
                            break;
                        case "planetario":
                            Intent infoplanetario = new Intent(context, CEMNIActivity.class);
                            startActivity(infoplanetario);
                            break;
                        case "sociales":
                            Intent infosoc = new Intent(context, FCSActivity.class);
                            startActivity(infosoc);
                            break;
                        default:

                            break;
                    }

                    break;
                case "galeria":
                    Intent infoplanetario = new Intent(context, ViewPage_activity.class);
                    infoplanetario.putExtra("id", Integer.parseInt(message)/2);
                    startActivity(infoplanetario);

                    break;
                default:
                    Log.d("receiver", "Got message: " + message);
                    //myBrowser.loadUrl("file:///android_asset/biblioteca.html");
                    crearDialogoAlerta();
                    break;
            }

        }
    };

    private void crearDialogoSlider(String title, String name) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        WebView wv = new WebView(this);
        WebSettings settings = wv.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);

        alert.setTitle(title);
        wv.loadUrl("file:///android_asset/slider/"+name+"_"+lenguage+".html");
        wv.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);

                return true;
            }
        });

        alert.setView(wv);
        alert.setNegativeButton(getString(R.string.btn_regresar), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }
        });
        alert.show();
    }

    private void crearDialogoAlerta() {
        //Creacion del Dialogo
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        //inflando el contenido con un layout;
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.layout_creditos,(ViewGroup) findViewById(R.id.lytLayout));
        builder.setView(layout);

        builder.setPositiveButton(getString(R.string.btn_regresar), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        Dialog dialogo = builder.create();
        dialogo.show();
    }

    private void crearDialogoIdioma() {
        //Creacion del Dialogo
        AlertDialog.Builder  builder = new AlertDialog.Builder(this);

        //inflando el contenido con un layout;
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.layout_idioma,(ViewGroup) findViewById(R.id.lytLayout));
        builder.setView(layout);

        dialogo1 = builder.create();
        dialogo1.show();
    }

    public void onEspannol(View v) {
        Configuration config = new Configuration(getResources().getConfiguration());
        config.locale = Locale.getDefault();
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        lenguage = "es";

        dialogo1.dismiss();
    }

    public void onIngles(View v) {
        Configuration config = new Configuration(getResources().getConfiguration());
        config.locale = Locale.ENGLISH;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        lenguage = "en";

        dialogo1.dismiss();
    }

    private void salir(){
        finish();
        this.onBackPressed();
    }

}
